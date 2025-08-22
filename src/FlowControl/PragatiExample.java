package FlowControl;

public class PragatiExample {
    public static void main(String[] args) {
        int x = 5;
        int y = 10;

        if (x < 1)   // 5<10
        {
            if (y < 5)    // 10<5  F
            {
                System.out.println("Inner if");
            }
        }
        else {
            System.out.println("Outer else");   // ignore if first
            //if is true
        }
    }
}
