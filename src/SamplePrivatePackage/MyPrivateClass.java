package SamplePrivatePackage;


class MyStudent
{
    public String name="Samarth";
    public int age = 24;

    private String password = "Swami@123";

    public String email = "samarth@gmail.com";

    public void displayMyPassword()
    {
        System.out.println(this.password);
    }

}


public class MyPrivateClass {
    public static void main(String[] args) {
            MyStudent samarth = new MyStudent();

        System.out.println(samarth.name);
        System.out.println(samarth.age);
        System.out.println(samarth.email);

        samarth.displayMyPassword();

        // Direct use of private member is not allowed
//        System.out.println(samarth.password);
    }
}
