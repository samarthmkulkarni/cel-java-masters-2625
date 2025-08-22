package Constructor;


class ProductClass {
    // Default Access
    String name;
    int id;


    ProductClass(String name, int id)
    {
        this.name = name;
        this.id = id;
    }


}

public class ThisKeywordPractice {

    public static void main(String[] args) {

        ProductClass milk = new ProductClass("Milk",1);

        System.out.println(milk.name);
        System.out.println(milk.id);

        ProductClass butter = new ProductClass("Butter",2);

        System.out.println(butter.name);
        System.out.println(butter.id);

    }


}
