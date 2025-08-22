package Functions.Recursion;

public class InfiniteRecursion {



    static void sampleFunction(int a)
    {
        if(a>0) {
            System.out.println("I am in Sample Function");
            System.out.println(a);
            sampleFunction(--a);
        }
    }

    public static void main(String[] args) {
        int n = 5;
        sampleFunction(n);
    }
}