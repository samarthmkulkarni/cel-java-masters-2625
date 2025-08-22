package FlowControl;

public class IfElseLadder {

    public static void main(String[] args) {

        int a = 10;
        int b = 15;


        if(false)
        {
            System.out.println("One Is True");
        }
        else if(false)  // 10>5
        {
            System.out.println("Two Is True");
        }
        else if(b>20)   // 15>20  ->F
        {
            System.out.println("Three Is True");
        }
        else
        {
            System.out.println("All are False");
        }




    }

}
