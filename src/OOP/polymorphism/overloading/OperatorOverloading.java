package OOP.polymorphism.overloading;

public class OperatorOverloading {

    public static void main(String[] args) {

        int a = 10;
        int b = 20;

        // Lets overload + operator

        // Addition

        System.out.println(a + b);

        System.out.println("now lets try to join strings");

        String firstname = "Samarth";
        String lastname = "Kulkarni";

        System.out.println(firstname+lastname);

        System.out.println("I am at my desk"+" and i am coding");


        System.out.println("My age is "+ 45);

        // 45 will get converted into string
        // "45"

    }

}
