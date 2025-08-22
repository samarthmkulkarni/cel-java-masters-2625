package Multithreading;


class ExtraClass1{
    public void display()
    {
        System.out.println("Display Method");
    }
}

public class MyRunnable extends ExtraClass implements Runnable{

    public void run()
    {
        System.out.println("I am from Runnable Interface");
        Thread current = Thread.currentThread();
        String name = current.getName();
        System.out.println("Thread Name"+ name);

        ThreadGroup currentGroup = current.getThreadGroup();
        System.out.println(currentGroup.getName());
    }

    public static void main(String[] args) {

        ThreadGroup myGroup = new ThreadGroup("CustomMyGroup");


        MyRunnable runnable = new MyRunnable();
        Thread t1 = new Thread(myGroup,runnable,"My Thread T2",1024*1024);  // 1 MB


        t1.start();

    }
}
