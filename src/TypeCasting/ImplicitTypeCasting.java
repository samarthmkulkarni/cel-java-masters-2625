package TypeCasting;

public class ImplicitTypeCasting {


    public static void main(String[] args) {

        // Implicit
        // Convert lower type to bigger

        // byte --> short --> int --> long --> float -> double
        // char --> int possible

        // No data loss
        // No risk
        // No extra syntax

        // Byte to int

        byte b = 100;
        int i = b;

        System.out.println(i);  // 100

        // int to double
        int num = 25;
        double d = num;  // 25.0

        System.out.println(d);

        // int to float
        int number = 25;
        float f = number;
        System.out.println(f);  // 25.0


        // char to int
        char a = 'A';
        int charInt = a;
        System.out.println(charInt);

    }

}
