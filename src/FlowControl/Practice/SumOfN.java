package FlowControl.Practice;

public class SumOfN {
    public static void main(String[] args) {
        int n = 5;
        int sum = 0;
        // 1 2 3 4 5
        for(int i = 1; i<=n;i++)
        {
            sum = sum + i;  // sum+=i
        }

        System.out.println(sum);

    }
}
