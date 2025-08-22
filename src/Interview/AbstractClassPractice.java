package Interview;

abstract class SampleAbstract{
    // normal + abstract methods

    void add(int a,int b)
    {
        System.out.println(a+b);
    }

    abstract void add(int a,int b,int c);

}

class ChildClass extends SampleAbstract{

    @Override
    void add(int a, int b, int c) {
        System.out.println(a+b+c);
    }
}


public class AbstractClassPractice {
    public static void main(String[] args) {
        ChildClass c = new ChildClass();

        c.add(1,2); // normal
        c.add(1,2,3); // abstract
    }
}
