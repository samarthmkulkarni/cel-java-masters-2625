package ExceptionHandling;

public class ThrowsPractice {

    public static int divide(int a, int b) throws ArithmeticException{
        return  a/b;
    }

    public static void main(String[] args) {
        try {
            throw new Exception("Hi I am exception");
        }
        catch (Exception e)
        {
            System.out.println(e.getMessage());
        }

        try {

        }
        catch (RuntimeException e)
        {
            System.out.println("Please do not put zero for b " + e.getMessage());
        }


        try {
            System.out.println(divide(20,0));
        }
        catch (Exception e)
        {
            System.out.println("Please do not put zero for b " + e.getMessage());
        }
        finally
         {
            System.out.println("I am finally block, I always execute");
        }

    }
}
