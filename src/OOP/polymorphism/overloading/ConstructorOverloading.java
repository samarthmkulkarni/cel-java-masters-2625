package OOP.polymorphism.overloading;

class Sample {

    Sample()           // 1
    {
        System.out.println("I am default constructor");
    }

    Sample(int a)        // 2
    {
        System.out.println("I am para constructor with 1 param");
    }

    Sample(int a, int b)         // 3
    {
        System.out.println("I am para constructor with 2 params");
    }

}


public class ConstructorOverloading {


    public static void main(String[] args) {
        Sample s1 = new Sample();  // Calls to constructor 1
        Sample s2 = new Sample(1);  // Calls to constructor 2
        Sample s3 = new Sample(1,2); // Calls to constructor 3

        // Constructor Name is same but we have different constructors with diff parameters
        // Constructor Overloading
    }

}
