package Arrays.TwoDArrays;

public class TwoD_Array {
    public static void main(String[] args) {

        int[] OneDArray = {1,2,3};

        System.out.println(OneDArray);

        int[][] TwoDArray = { //0  1  2 -> columsn
                                {1,2,3},  // 0  rows
                                {4,5,6}   // 1  rows
                            };

        System.out.println(TwoDArray[1][2]);
    }
}
