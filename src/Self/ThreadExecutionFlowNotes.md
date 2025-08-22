# Thread Execution Flow Notes

## Question: How does t1.start() call the run() method?

### Overview
When you call `t1.start()` on a Thread object, it doesn't directly call `run()`. Instead, it triggers a complex internal process where the JVM creates a new thread and then calls your overridden `run()` method in that new thread context.

## Step-by-Step Flow

### 1. Object Creation
```java
MyThread t1 = new MyThread();
```
- Creates a new thread object that extends Thread
- Thread is in **NEW** state
- No OS thread is created yet

### 2. Calling start()
```java
t1.start();
```
- Calls the inherited `start()` method from Thread class
- **Important**: You call `start()`, NOT `run()` directly
- This is the trigger that begins the thread creation process

### 3. Internal JVM Process (What happens inside start())
1. **State Validation**: JVM checks if thread is in NEW state
   - If already started, throws `IllegalThreadStateException`
2. **Thread Registration**: Adds thread to JVM's thread group
3. **Native Thread Creation**: JVM makes a system call to create OS-level thread
4. **State Change**: Thread state changes from NEW → RUNNABLE
5. **Schedule for Execution**: Thread is added to thread scheduler queue

### 4. JVM Calls run() Method
- Thread scheduler eventually picks up your thread
- **JVM internally calls your overridden `run()` method**
- This happens in the **new thread context**, not the main thread
- The call is made by JVM's native thread implementation

### 5. Your Code Execution
```java
@Override
public void run() {
    System.out.println("Thread created");
}
```
- Your overridden `run()` method executes in the new thread
- When `run()` method completes, thread dies (TERMINATED state)

## Key Points to Remember

### Why start() and not run()?
- **Calling `run()` directly**: Executes in current thread (no new thread created)
- **Calling `start()`**: Creates new thread and executes `run()` in that thread

### Thread States
1. **NEW**: Thread created but not started
2. **RUNNABLE**: Thread is ready to run or running
3. **BLOCKED**: Thread waiting for monitor lock
4. **WAITING**: Thread waiting indefinitely
5. **TIMED_WAITING**: Thread waiting for specific time
6. **TERMINATED**: Thread execution completed

### Example Code Pattern
```java
public class MyThread extends Thread {
    @Override
    public void run() {
        // This method is called by JVM in new thread
        System.out.println("Executing in: " + Thread.currentThread().getName());
    }
    
    public static void main(String[] args) {
        MyThread t1 = new MyThread();
        t1.start(); // JVM will call run() in new thread
    }
}
```

## Important Notes

### Method Override Relationship
- When you override `run()`, you're providing the actual work for the thread
- The `start()` method is inherited from Thread class and shouldn't be overridden
- JVM uses polymorphism to call your specific `run()` implementation

### Thread Safety
- Each thread has its own stack space
- Multiple threads can share heap memory (potential for race conditions)
- `start()` can only be called once per thread object

### Common Mistakes
1. **Calling `run()` directly** - No new thread created
2. **Calling `start()` multiple times** - Throws IllegalThreadStateException
3. **Overriding `start()`** - Breaks the thread creation mechanism

## Practical Example Output
```
Main thread: main
Calling t1.start() from main thread
Main thread continues executing
run() method executing in thread: Thread-0
Thread ID: 21
run() method completed
```

This shows that `start()` returns immediately while `run()` executes in background thread.

## Advanced: What happens in Thread.start() source code
```java
public synchronized void start() {
    if (threadStatus != 0)
        throw new IllegalThreadStateException();
    
    group.add(this);
    
    boolean started = false;
    try {
        start0(); // Native method that creates OS thread
        started = true;
    } finally {
        // Cleanup if start failed
    }
}

private native void start0(); // JVM calls this to create OS thread
```

The `start0()` native method is what actually creates the OS thread and makes it call your `run()` method.
