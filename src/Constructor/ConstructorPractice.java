package Constructor;


class Product{
    int productId;
    String productName;
    float productPrice;
    int productQuantity;

    // Default Constructor
    // Non-Parameterized Constructor
    Product()
    {
        productId = 0;
        productName = null;
        productPrice = 0.0f;
        productQuantity = 0;
    }

    //Parameterized Constructor
    Product(int pId, String pName, float pPrice, int pQuantity)
    {
        productId = pId;
        productName = pName;
        productPrice = pPrice;
        productQuantity = pQuantity;
    }

}


public class ConstructorPractice {

    public static void main(String[] args) {
        // How to create object / variable
        // Write Data Type
        // Write your object/variable name

        Product milk = new Product(1,"Milk",55.5f,500);

        System.out.println("This is for Milk");

        System.out.println(milk.productId);
        System.out.println(milk.productName);
        System.out.println(milk.productPrice);
        System.out.println(milk.productQuantity);

        Product butter = new Product(2,"Butter",44.4f,400);

        System.out.println("This is for butter");

        System.out.println(butter.productId);
        System.out.println(butter.productName);
        System.out.println(butter.productPrice);
        System.out.println(butter.productQuantity);
    }

}