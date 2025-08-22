package OOP.StaticPractice;


class SampleOne{

    static void addition(int a, int b)
    {
        System.out.println(a+b);
    }

    static void addition(int a, int b,int c)
    {
        System.out.println(a+b+c);
    }

}


public class StaticOverloading {


    public static void main(String[] args) {


        SampleOne.addition(1,2);
        SampleOne.addition(1,2,3);
    }

}
