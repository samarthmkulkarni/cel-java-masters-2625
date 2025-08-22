package Multithreading;

class MyThread1 extends Thread{
    public void run()
    {
        for(int i = 0;i<50;i++)
        {
            System.out.println(Thread.currentThread().getName()+ " | "+i);
            Thread.yield(); // Temp pause current thread and gives chance to ther
        }

    }
}


public class YieldExample {
    public static void main(String[] args) {


        MyThread1 thread1 = new MyThread1();
        MyThread1 thread2 = new MyThread1();

        thread1.setName("Thread-1");
        thread2.setName("Thread-2");

        thread1.start();
        thread2.start();


    }
}
