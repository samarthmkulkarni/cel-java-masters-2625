package FlowControl;

public class TernaryOperator {

    public static void main(String[] args) {

        int a = 30;
        int b = 20;

        int result = 0;

        if(a>b)   // 20>30 F
        {
            result = a + b;
        }
        else
        {
            result = a - b;   // 20 - 30 = -10
        }

        result = a>b ? a + b   : a-b;




        System.out.println(result);


    }

}
