package FlowControl;

public class ATM {

    public static void main(String[] args) {


        int choice = 3;

        switch (choice)
        {
            case 1 :
                System.out.println("Your Acc No is 45");
                break;
            case 2:
                System.out.println("Your balance is 5000Rs");
                break;
            case 3:
                System.out.println("500 Rs Initiated");
                break;
            case 4:
                System.out.println("Thanks! Visit Again !");
                break;
            default:
                System.out.println("Please Enter 1/2/3/4");

        }



    }


}
