package ProblemSolving1;

public class isArmstrong {


    public static void isArmstrong(int number)
    {
        int orignalNumber = number;
        int length = 0;
        int sum = 0;


        // calculate number of digit
        int tempNumb = number;
        while(tempNumb!=0)
        {
            length=length+1;
            tempNumb = tempNumb/10;
        }

        tempNumb = orignalNumber;   // 1
        while (tempNumb>0)
        {
            int digit = tempNumb%10;
          int powerResult =   power(digit,length) ;
          sum= sum + powerResult;// 3 to power 3

            tempNumb = tempNumb/10;
        }


        if(sum == orignalNumber)
        {
            System.out.println("This is Armstrong Number");
        }
        else {
            System.out.println("This is Not Armstrong Number");
        }


    }

    public static int power(int digit, int pow)
    {
        int result = 1;   // result = 4
        for(int i = 1;i <= pow;i++)   // digit 2  pow 2 // i =2
        {  // 2 * 1 = 2
            // 2 *2 = 4
            result = result * digit;
        }

        return result;
    }





    public static void main(String[] args) {
        int num = 153;

        isArmstrong(num);

    }

}
