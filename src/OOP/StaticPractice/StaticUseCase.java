package OOP.StaticPractice;


class MyTest
{
    static int count = 0;

    MyTest()
    {
        count = count + 1;
    }

}

class Vote{
    static int age = 18;
}


public class StaticUseCase {



    public static void main(String[] args) {

        MyTest t1 = new MyTest();
        MyTest t2 = new MyTest();
        MyTest t3 = new MyTest();

        System.out.println(MyTest.count);


        Vote year2025 = new Vote();

        System.out.println(year2025.age);


        Vote year2026 = new Vote();

        year2026.age = 25;


        Vote year2027 = new Vote();

        System.out.println(year2027.age);


    }

}

