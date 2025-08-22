package FlowControl.Practice;

public class SumOfDigits {
    public static void main(String[] args) {

        int n = 123;
        int sum = 0;

        // n % 10 --> rem
        // n = n/10


        for(int i = 1; i<=3;i++)
        {
            int rem =n%10;
            sum= sum+rem;
            n = n/10;
        }


        System.out.println(sum);


    }
}
