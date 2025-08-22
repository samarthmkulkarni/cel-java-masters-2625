package StringPractice;

public class StringMethodsTwo {
    public static void main(String[] args) {

        // 6) concat

        String s1 = "Hello";
        String s2 = "World";

//        String s3 = s1+s2;

        String s3 = s1.concat(s2);

        System.out.println(s3);


        int age = 25;

        String s4 = "My age is ";

        String s5 = s4 + age;

//        String s5 = s4.concat(age); Data type mismatch

        System.out.println(s5);

        // 7) Contains

        String m1 = "SamarthKulkarni";

        System.out.println(m1.contains("z")); // false
        System.out.println(m1.contains("a")); // true

        System.out.println(m1.contains("xyz"));

        // 8) join
        String fruits = String.join(",", "Orange", "Apple", "Mango");
        System.out.println(fruits);



        // 9) replace

        String p1 = "HelloWorld";

        String p2 = p1.replace("o","x");
        System.out.println(p2);  //  HellxWxrld

        System.out.println(p1);


        // 10) Substring

        String f1 = "Samarth";
        System.out.println(f1.substring(2,4));

        System.out.println(f1.substring(2));

        // 11) toString()
        String myStr = "Hello, World!";
        System.out.println(myStr.toString());

        Integer a = 56;
        String result = a.toString();
        System.out.println(result.getClass());

        // 12) trim()

        String t1 = "   Samarth  ";
        System.out.println(t1);
        System.out.println(t1.trim());

        String t2 = "   Samarth Kulkarni   ";
        System.out.println(t2.trim());








    }
}
