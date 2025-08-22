package Input;

import java.util.Scanner;

public class NumberInput {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter any integer number!");
        int a = scanner.nextInt();

        System.out.println(a);

        System.out.println("Please enter any float number!");
        float b = scanner.nextFloat();

        System.out.println(b);

        System.out.println("Please enter any double number!");

        double d =scanner.nextDouble();

        System.out.println(d);
        scanner.nextDouble();
    }
}
