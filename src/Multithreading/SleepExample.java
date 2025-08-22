package Multithreading;

class MyThread2 extends Thread{
    public void run()
    {
        for(int i = 0;i<50;i++)
        {
            System.out.println(Thread.currentThread().getName()+ " | "+i);

            try {
                Thread.sleep(3000);
            }catch (InterruptedException e)
            {
                System.out.println("InterruptedException " + e.getMessage());
            }
        }
    }
}


public class SleepExample {
    public static void main(String[] args) {
        MyThread2 thread1 = new MyThread2();
        MyThread2 thread2 = new MyThread2();

        thread1.setName("Thread-1");
        thread2.setName("Thread-2");

        thread1.start();
        thread2.start();
    }
}
