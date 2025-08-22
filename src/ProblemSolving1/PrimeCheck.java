package ProblemSolving1;

public class PrimeCheck {

    public static boolean isPrime(int num)
    {
        if(num <=1)
        {
            return false;
        }

        if(num == 2)
        {
            return true;
        }

        for(int i = 2;i<num;i++)
        {
            if(num%i==0)
            {
                return false;
            }
        }

        return true;



    }


    public static void main(String[] args) {
        int n = 15;

        boolean result = isPrime(n);

        System.out.println(result);

    }

}
