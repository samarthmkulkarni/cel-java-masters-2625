package ExceptionHandling;

public class IndexOutBound {
    public static void main(String[] args) {
                   //   0   1  2  3  4 | 5,6 - out of bound
        int[] samarth = {1, 2, 3, 4, 5};

        System.out.println(samarth[5]);

        String s = "Samarth";
        System.out.println(s.charAt(7));

    }
}
