package Interview;


class SampleA
{
    String name;

    SampleA()
    {
        name = "Samarth";
    }
}

class SampleB extends SampleA
{
    String address;

    SampleB()
    {
        super(); // It will call parent class constructor - SampleA()
        address="ABC";
    }
}


public class SuperFunctionPractice {
    public static void main(String[] args) {
        SampleB b = new SampleB();

        System.out.println(b.address);

        System.out.println(b.name);
    }
}
