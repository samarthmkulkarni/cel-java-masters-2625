package Self;

public class FibonacciLoop {

    public static void printFibonacciSeries(int n)
    {
        int num1 = 0;
        int num2 = 1;

        for(int i = 1;i<=n;i++)
        {
            System.out.println(num1);
            int next = num1 + num2;
            num1 = num2;
            num2 = next;
        }

    }

    public static void main(String[] args) {

printFibonacciSeries(10);

    }
}
