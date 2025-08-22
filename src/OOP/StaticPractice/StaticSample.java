package OOP.StaticPractice;

class Test{

    static int count = 0;


    void display()
    {
        System.out.println("This is normal method");
    }

    static void displayNow()
    {
        System.out.println("This is static Method");
    }

}


public class StaticSample {

    public static void main(String[] args) {

        System.out.println(Test.count);

        Test t = new Test();

        t.display(); //

        Test.displayNow();

    }

}
