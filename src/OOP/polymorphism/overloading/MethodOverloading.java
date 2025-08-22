package OOP.polymorphism.overloading;


class MyAddition
{

    int  addition(int a,int b)   // param diff - 2 ======= 1
    {
        return a + b ;  // body diff
    }

    int addition(int a,int b,int c)  // param diff -3 =======2
    {
        return a+b+c; // body diff
    }

}

public class MethodOverloading {

    public static void main(String[] args) {

        MyAddition a = new MyAddition();

        System.out.println(a.addition(1,2));  // call -==> 1
        System.out.println(a.addition(1,2,3));  // call ===>

        // We have same method name - addition
        // But diff parameters & body

        // This is Method overloading

    }

}
