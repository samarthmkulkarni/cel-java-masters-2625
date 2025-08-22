package FlowControl;

public class Vote
{
    public static void main(String[] args)
    {
       // main
       int defaultAge = 18;
       int myAge = 15;

       // syntax
       // if (condition ?) {   } else {   }

       if(myAge >= defaultAge)   // 15 >= 18 -> Flase
       {
         // if condition is true
         System.out.println("Eligible");
       }
       else
       {
           // if condition is false
           System.out.println("Not Eligible");
       }

    }

}
