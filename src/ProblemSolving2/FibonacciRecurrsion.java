package ProblemSolving2;

public class FibonacciRecurrsion {

    public static void printSeries(int n, int num1, int num2)
    {

        if(n == 0)
        {
            return;
        }

        System.out.println(num1);
        printSeries(n-1, num2, num1+num2);
    }


    public static void main(String[] args) {
        int n = 100;
        printSeries(n,0,1);
    }

}
