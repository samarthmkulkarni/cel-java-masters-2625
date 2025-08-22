package ExceptionHandling;


public class MoreExceptions {
    public static void main(String[] args) {

        try {
            Class.forName("java.lang.StringOne");
        }
        catch (ClassNotFoundException e)
        {
            System.out.println("This class cannot be found");
        }


    }
}
