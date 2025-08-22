package Multithreading;

class ExtraClass{
    public void display()
    {
        System.out.println("Display Method");
    }
}


public class MyThread extends Thread {

    public MyThread(String name)
    {
        super(name);
    }


    public void run()
    {
        System.out.println("I am a running method for thread");

        Thread current = Thread.currentThread();
        String name = current.getName();

        System.out.println(name);
    }

    public static void main(String[] args) {
        MyThread thread1 = new MyThread("My Thread T1");
        thread1.start();

        MyThread thread2 = new MyThread("My Thread T2");
        thread2.start();
    }
}
