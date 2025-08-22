package ProblemSolving1;

public class LargestInArray {

    public static void main(String[] args) {
     //                   0  1  2  3  4
        int[] arrayOne = {25,78,87,5,4};


        int maximum = arrayOne[0];   // 25

        for(int i = 1;i<=4;i++)
        {
            if(maximum < arrayOne[i])
            {
                // 25<78
                maximum = arrayOne[i];
            }
        }

        System.out.println(maximum);



    }


}
