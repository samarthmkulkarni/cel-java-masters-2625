package Multithreading;


class HighPrio implements Runnable{

    @Override
    public void run() {
        for (int i = 0;i<1000;i++)
        {
            System.out.println("----HP");
            Thread.yield();
        }
    }
}

class LowPrio implements  Runnable{
    @Override
    public void run() {
        for (int i = 0;i<1000;i++)
        {
            System.out.println("----LP");
            Thread.yield();
        }
    }
}


public class Main {
    public static void main(String[] args) {

        Runnable high = new HighPrio();
        Runnable low = new LowPrio();

        Thread t1 = new Thread(high);
        Thread t2 = new Thread(low);

        t1.setPriority(Thread.MAX_PRIORITY);
        t2.setPriority(Thread.MIN_PRIORITY);


        t2.start();
        t1.start();


    }
}
