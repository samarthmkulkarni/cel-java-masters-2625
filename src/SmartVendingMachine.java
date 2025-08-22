import java.util.Scanner;

public class SmartVendingMachine {



    public static void main(String[] args) {
        //                         0       1       2         3          4
        String[] productNames = {"Chips","Milk","Chocolate","Butter","Bread"};
        int[] productPrice =    {  10,     25,      15,       45,      20};
        int[] productQuantity = {  50,     70,      100,      30,      60};


        int productNum;
        int productQuant;
        System.out.println("Welcome To Smart Vending Machine !");
        System.out.println("Products : " +
                "1) Chips" +
                " 2) Milk" +
                " 3) Chocolate" +
                " 4) Butter" +
                " 5) Bread");
        System.out.println("Press 1 : To Buy");
        System.out.println("Press 10 To Exit");

        Scanner scanner = new Scanner(System.in);
        int userChoice = scanner.nextInt();

        switch (userChoice){
            case 10:
                System.out.println("Thank You! Visit Again!");
                break;
            case 1:
                System.out.println("Welcome!");
                System.out.println("Please Enter Product You Wish To Buy");
                productNum =scanner.nextInt();
                System.out.println("Please Enter Quantity ");
                productQuant =scanner.nextInt();
                // We will calculate The Price
                // Quantity * Price For One Item
                // If productNum = 1 -> Index = ProductNum - 1
                int productIndex = productNum - 1;


                int totalPrice = productPrice[productIndex] * productQuant;
                int oldQuantity = productQuantity[productIndex];
                int currentQuantity = oldQuantity - productQuant;
                productQuantity[productIndex] = currentQuantity;

                System.out.println("=========DETAILS==============");
                System.out.println("Product Name : " + productNames[productIndex] );
                System.out.println("Product Price : " + productPrice[productIndex] );
                System.out.println("Product Previous Quantity : " + oldQuantity );
                System.out.println("Product Current Quantity  : " + productQuantity[productIndex] );
                System.out.println("===========BILL===============");
                System.out.println("Total Bill " + totalPrice );
        }


    }


}
