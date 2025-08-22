package Constructor;

class Course
{
    String courseName;
    int id;

    void addition(int a,int b)
    {
        System.out.println(a+b);
    }

    void addition(int a,int b,int c)
    {
        System.out.println(a+b+c);
    }

    int addition(int a,int b,int c,int d)
    {
        return a+b+c+d;
    }

}


public class MethodOverloading {
    public static void main(String[] args) {

        Course maths = new Course();

        maths.addition(1,2);

        maths.addition(1,2,3);

       int result = maths.addition(1,2,3,4);

        System.out.println(result);


    }
}
