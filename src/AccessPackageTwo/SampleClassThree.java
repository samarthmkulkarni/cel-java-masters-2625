package AccessPackageTwo;

import AccessPackageOne.MyProduct;

public class SampleClassThree {
    public static void main(String[] args) {
        MyProduct p = new MyProduct();
// Not allowed as MyProduct and SampleClassThree are in different packages
//        System.out.println(p.productName);
//        System.out.println(p.productQuantity);
//        System.out.println(p.productPrice);
    }
}
