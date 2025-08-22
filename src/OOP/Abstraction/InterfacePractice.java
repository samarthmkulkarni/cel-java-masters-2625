package OOP.Abstraction;

abstract class SampleOne{

    void display() // Normal Method
    {
        System.out.println("I am normal");
    }

    abstract void show();   // abstract Method
}

class AbsChild extends SampleOne{
    void show()
    {
        System.out.println("Provided body in child class - AbsChild");
    }
}

interface SampleTwo{

    // In Interface all methods are asbtract by default
     void show();
     void addition();
     int addition(int a, int b);
     float addition(float a, float b);
}

class SampleTwoImpl implements SampleTwo {

    // We have ovverriden show method
    public void show() {
        System.out.println(" I am show implemented in Impl class");
    }

    // We have done overloading for addition method
    // and also we have done overriding
    public void addition() {
        System.out.println(" I am addition from impl class");
    }

    public int addition(int a, int b) {
        return a+b;
    }

    public float addition(float a, float b) {
        return a+b;
    }

}


public class InterfacePractice {
    public static void main(String[] args) {
        // Can we create object of interface - No
        // Can we create object of abstract class - No


        // To use show() in abstract class  - we created on child and
        // extended abstract class
        AbsChild absChild = new AbsChild();

        absChild.show();
        absChild.display();

        // We have to use methods in interface
        // 1. Create a class and implement / extend interface
        // Impl Class - and implemented all methods

        SampleTwoImpl s = new SampleTwoImpl();

        s.show();
        s.addition();
        System.out.println(s.addition(1,2));
        System.out.println(s.addition(1.2f,5.6f));


    }
}
