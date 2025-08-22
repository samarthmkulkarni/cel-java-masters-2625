package OOP.Abstraction;

class Example{

    void show()
    {
        System.out.println("I am show method in example");
        this.show();
    }

}


public class SampleTTT {
    public static void main(String[] args) {
        Example e = new Example();
        e.show();
    }
}
