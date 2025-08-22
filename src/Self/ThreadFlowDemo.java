package Self;

public class ThreadFlowDemo extends Thread {

    public void run() {
        System.out.println("3. run() method executing in thread: " + Thread.currentThread().getName());
        System.out.println("4. Thread ID: " + Thread.currentThread().getId());
        try {
            Thread.sleep(1000); // Simulate some work
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("5. run() method completed");
    }

    public static void main(String[] args) {
        System.out.println("1. Main thread: " + Thread.currentThread().getName());

        ThreadFlowDemo t1 = new ThreadFlowDemo();
        System.out.println("2. Calling t1.start() from main thread");

        t1.start(); // This will internally call run() in a NEW thread

        System.out.println("6. Main thread continues executing while run() executes in background");
        System.out.println("7. Main thread ID: " + Thread.currentThread().getId());
    }
}
