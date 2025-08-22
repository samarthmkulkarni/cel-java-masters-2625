package Arrays;

public class ArraysAddElements {
    public static void main(String[] args) {
        int[] arrayOne = new int[10];
        // if size is 10, max index = 9

        //
        int N = 10;
        for(int k = 0 ; k<=9;k++){
            arrayOne[k] = N;
            N = N+10;
        }
// To print
        for(int k = 0 ; k<=9;k++){
            System.out.println(arrayOne[k]);
        }

    }
}
