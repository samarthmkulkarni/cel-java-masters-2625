package Interview;

class Vote{
    String name;
    static int age = 18;

    static int add(int a,int b)
    {
        return  a+b;
    }

    static int add(int a,int b,int c)
    {
        return a+b+c;
    }
}


public class StaticPractice {
    public static void main(String[] args) {
        Vote shri = new Vote();
        shri.name = "Shrivaradhan";
        System.out.println(Vote.age);
        System.out.println(shri.age);
        shri.age = 20;
        Vote akshay = new Vote();
        akshay.name="Akshay";
        System.out.println(Vote.age);

        System.out.println(Vote.add(1,2));
        System.out.println(Vote.add(1,2,3));


    }
}
