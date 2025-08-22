package Interview;

interface InterfaceA
{
    default void clear()
    {
        System.out.println("I am from Interface A");
    };

    void clearone();
}

interface InterfaceB
{
    default void clear()
    {
        System.out.println("I am from Interface B");
    };

    void clearTwo();
}

class SampleImpl implements InterfaceA,InterfaceB
{
    public void clear()
    {
        InterfaceB.super.clear();
    }


    public void clearTwo() {
        System.out.println("Clear Two");
    }


    public void clearone() {
        System.out.println("Clear One");
    }
}

public class MultipleInheritance {

    public static void main(String[] args) {

        SampleImpl s = new SampleImpl();

        s.clear();


    }

}
