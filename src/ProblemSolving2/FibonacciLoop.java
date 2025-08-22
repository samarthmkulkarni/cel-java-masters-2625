package ProblemSolving2;

public class FibonacciLoop {


    public static void printSeries(int N)
    {
        // N is paremeter
        int num1 = 0;
        int num2 = 1;
        int next;

        for(int i =0;i<N;i++)
        {
            // Step 1 : Print Number 1
            System.out.print(num1+ " ");
            // Step 2 : Add Number1 And Number Into Next
            next = num1 + num2;
            // Step 3 : Replace value in Number1 by Number2
            num1 =num2;
            // Step 4: Replace value in Number2 by Next
            num2 = next;
        }
    }


    public static void main(String[] args) {

        int n = 6;
        // Call func here
        printSeries(n);

        // n is argument


    }

}
