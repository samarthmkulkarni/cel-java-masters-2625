package ExceptionHandling;

public class MyExeptionClass {
    public static void main(String[] args) {

        try {
           // code that can cause exception
            System.out.println("I am a try block i contain code that can casue exception");
            // We are throwing exception
            throw new Exception("This is my exception !");
        }
        catch (Exception e){
            // code that catches and handles exception
            System.out.println("I am a catch block & I can handle exception");
            String message = e.getMessage();
            System.out.println(message);

        }
        finally {
            // cleanup code - connections closing
            System.out.println("I am finally block, i always execute");
        }

    }
}
