package Arrays;

public class ArrayUpdate {
    public static void main(String[] args) {


        int arrayOne[] = {10,20,30,40,50};

        System.out.println("Before Updating Array Element");
        System.out.println(arrayOne[2]);
        // Update element 30 by 3
        // index of 30 ==> 2
        int N = 3;
        arrayOne[2] = N;
//
        System.out.println("After Updating Array Element");
        System.out.println(arrayOne[2]);



    }
}
