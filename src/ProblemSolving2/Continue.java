package ProblemSolving2;

public class Continue {

    public static void main(String[] args) {


        int[] arrayOne = {0,1,2,3,4,5,6};

        for(int i = 0; i<7;i++)
        {
            if(i == 3)
            {
                continue;
            }
            System.out.println(arrayOne[i]);
        }

    }

}
