package FlowControl;

public class NestedFlowControl {

    public static void main(String[] args) {

        int a = 15;
        int b = 12;

        // condition 1 -> a > = b
        // condition 2 -> b%2 == 0
        // make condition 1 and 2 nested

        if(a>=b)  // 15>=12 -> T
        {
            System.out.println("condition1 Is True");
            if(b%2==0)  // 12%2 == 0 -? 0 == 0 -> T
            {
                System.out.println("condition2 Is True");
            }
            else
            {
                System.out.println("condition2 Is Flase");
            }

        }
        else
        {
            System.out.println("condition1 Is False");
        }

    }

}
