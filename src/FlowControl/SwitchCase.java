package FlowControl;

public class SwitchCase {

    public static void main(String[] args) {


        // case 1 : Fan ON
        // case 2 : Light On
        // case 3 : Charging On


        int choice = 3;

        switch (choice) {
            case 1:
                System.out.println("Fan On");
                break;
            case 2:
                System.out.println("Light ON");
                break;
            case 3:
                System.out.println("Charging ON");
                break;

            default:
                System.out.println("Please Enter 1/2/3");

        }

    }
}