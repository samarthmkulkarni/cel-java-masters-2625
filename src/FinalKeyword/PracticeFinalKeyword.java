package FinalKeyword;

class FinalClass{
    public String name = "Samarth";
    public final int id = 1;
}



public class PracticeFinalKeyword {
    public static void main(String[] args) {
        int a = 5;

        System.out.println(a);

        a = 7;

        System.out.println(a);

        final int b = 5;

        System.out.println("This is final b");
        System.out.println(b);

//        b = 10;  // Cannot assign a value to final variable 'b'

        FinalClass samarth = new FinalClass();
        System.out.println(samarth.id);
        System.out.println(samarth.name);

        System.out.println("Lets change name");

        samarth.name = "Kulkarni";
//        samarth.id = 15;  // Cannot assign a value to final variable 'b'
        System.out.println("After changing");
        System.out.println(samarth.name);

    }
}
