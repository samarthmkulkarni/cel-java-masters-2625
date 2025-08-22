package ExceptionHandling;

public class NullPointer {
    public static void main(String[] args) {
        String s = "Samarth";
        String s2 = null;



        try {
            System.out.println(s2.length());
        }
        catch (NullPointerException e)
        {
            System.out.println("You cannot perrform operations on null objects. " + e.getMessage());
        }
    }
}
