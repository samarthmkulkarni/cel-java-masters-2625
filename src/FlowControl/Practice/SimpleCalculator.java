package FlowControl.Practice;

public class SimpleCalculator {

    public static void main(String[] args) {

        int a = 20;
        int b = 10;
        int choice = 8;

        switch (choice)
        {
            case 1 :
                System.out.println(a+b);
                break;
            case 2:
                System.out.println(a-b);
                break;
            case 3:
                System.out.println(a*b);
                break;
            case 4:
                System.out.println(a/b);
                break;
            default:
                System.out.println("Invalid Input, Choice Should Be Between 1 - 4");
        }


    }
}
