package Arrays;

public class ArraySum {
    public static void main(String[] args) {
        // Traversing Using Loops
        //                0    1  2    3  4     5(out of bound)
        int[] arrayOne = {10, 20, 30, 40, 50};
        int sum = 0 ;

        for (int k = 0; k <= 4; k++)  // 5 <=4 (False)
        {
            sum = sum +arrayOne[k];  // sum+=arrayOne[k]
        }

        System.out.println(sum);
    }
}
