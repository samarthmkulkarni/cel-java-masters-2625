package FlowControl;

public class EvenOdd {

    public static void main(String[] args) {

        int num = 5;
        // 5 % 2 --> 1
        if(num%2 == 0)  // 1 == 0 (F)
        {
            System.out.println("EVEN");
        }
        else
        {
            System.out.println("ODD");
        }

    }

}
