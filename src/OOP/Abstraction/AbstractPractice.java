package OOP.Abstraction;


abstract class MySample{
    void displayNormal()   // Normal Method - Concrete Method
    {
        System.out.println("I am normal");
    }

    abstract void displayAbstract(); // No body //abstract Method

}


class Result extends MySample{

    void displayResult()
    {
        System.out.println("I am result class method");
    }

    @Override
    void displayAbstract()
    {
        System.out.println("I am abstract method from parent but " +
                "child class Result has provide me body");
    }
}

public class AbstractPractice {
    public static void main(String[] args) {

        Result r = new Result();

        r.displayResult();
        r.displayNormal();

        r.displayAbstract();

    }
}
