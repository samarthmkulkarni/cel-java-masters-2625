package MyPublicClassTwo;

import MyPublicClass.MyProductOne;

public class MySamplePublicClass {
    public static void main(String[] args) {
        MyProductOne p = new MyProductOne();

        System.out.println(p.productName);
        System.out.println(p.productQuantity);
        System.out.println(p.productPrice);
    }
}
