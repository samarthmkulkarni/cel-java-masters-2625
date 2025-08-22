package Arrays;

public class ArraysNewKeyword {
    public static void main(String[] args) {

        // Arrays using new keyword
        // int arrays and allocate size = 5

//        int[] arrayInteger = new int[5];
//        System.out.println(arrayInteger);
//
//        // If we have array size as 5
//        // min index = 0 and max index = 4
//        System.out.println(arrayInteger[5]);

        int[] arrayOne = new int[5];
         // [0,0,0,0,0]
// index - 0 to 4
        System.out.println(arrayOne[4]);

        boolean[] booleanArray = new boolean[3];
        // [false,false,false]
        System.out.println(booleanArray[2]);

        char[] charArray = new char[4];

        System.out.println(charArray[0]);

        String[] stringArray = new String[5];

        System.out.println(stringArray[0]);


    }
}
