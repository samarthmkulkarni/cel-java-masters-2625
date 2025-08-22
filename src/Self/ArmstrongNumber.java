package Self;

public class ArmstrongNumber {

    public static boolean isArmstrong(int number) {
        int length = 0;
        int tempNum = number;
        int sum = 0;

        // Count number of digits
        while (tempNum != 0) {
            length++;
            tempNum /= 10;
        }

        tempNum = number;

        // Calculate sum of digits raised to the power of 'length'
        while (tempNum > 0) {
            int digit = tempNum % 10;
            sum += power(digit, length);
            tempNum /= 10;
        }

        if (sum == number) {
            System.out.println("This is an Armstrong Number");
            return true;
        } else {
            System.out.println("This is NOT an Armstrong Number");
            return false;
        }
    }

    public static int power(int num, int pow) {
        int result = 1;
        for (int i = 0; i < pow; i++) {
            result *= num;
        }
        return result;
    }

    public static void main(String[] args) {
        int num = 153;
        System.out.println(isArmstrong(num));
    }
}
