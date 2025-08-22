package Self;

public class LargestInArray {
    public static void main(String[] args) {
        int[] numbers = {25, 78, 13, 44, 97, 162, 31};

        int max = numbers[0]; // assume first element is max

        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] > max) {
                max = numbers[i];
            }
        }

        System.out.println("The largest element is: " + max);
    }
}

