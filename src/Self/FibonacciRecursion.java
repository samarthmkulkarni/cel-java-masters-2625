package Self;

public class FibonacciRecursion {


    public static void fibonacciPrint(int n,int first, int second)
    {
        if(n == 0) return;

        System.out.println(first);

        fibonacciPrint(n-1,second ,first+second);



    }

    public static void main(String[] args) {

        int n = 10;
        fibonacciPrint(n,0,1);
    }

}
