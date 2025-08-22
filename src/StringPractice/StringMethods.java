package StringPractice;

public class StringMethods {
    public static void main(String[] args) {

        String s = "Samarth 45K";

        System.out.println(s.length());

        // Samarth : 7
        // Samarth 45 : 11


        String s1 = "";
        System.out.println(s1.isEmpty());

        String s2 ="ABC";
        System.out.println(s2.isEmpty());


        String s3 = "abc";

        System.out.println(s3.charAt(1));

        String s4 = "abcde";
        System.out.println(s4.indexOf("b"));


        String m1 = "Hello";
        String m2 = "Hello";

        // In string pool m1,m2 ---> "Hello"

        System.out.println(m1.equals(m2));

        String m3 = new String("Hello");
        String m4 = new String("Hello");

        System.out.println(m3.equals(m4));
        System.out.println("================");

        System.out.println(m3==m4);  // false , m3 and m4 are diff object
        // Content will not be considered, reference, object mem

        System.out.println(m1==m2);  // true



    }
}
