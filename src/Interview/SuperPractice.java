package Interview;


class A{
    String name = "ClassA";

    void display()
    {
        System.out.println(this.name);
    }
}

class B extends A {
    String name ="ABC";

    void displayData()
    {
        System.out.println(super.name);
        System.out.println(name);
    }
}

public class SuperPractice {
    public static void main(String[] args) {
        B b = new B();
        b.displayData();
    }
}
