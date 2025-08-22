package Multithreading;

class MyThread3 extends Thread{
    public  void run()
    {
        for(int i = 0;i<5;i++)
        {
            System.out.println(Thread.currentThread().getName()+ " | "+i);

            try {
                Thread.sleep(500);
            }catch (InterruptedException e)
            {
                System.out.println("InterruptedException " + e.getMessage());
            }
        }
    }
}


public class JoinExample {
    public static void main(String[] args) {
        MyThread3 t1 = new MyThread3();
        MyThread3 t2 = new MyThread3();
        MyThread3 t3 = new MyThread3();

        t1.setName("Thread-1");
        t2.setName("Thread-2");
        t3.setName("Thread-3");

        t1.start();
        try {
            t1.join();  // wait for t1 completion
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        t2.start();
        try {
            t2.join();  // wait for t2 completion
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        t3.start();



    }
}
