package Input;

import java.util.Scanner;

public class SampleInput {
    public static void main(String[] args) {

        // We have to use Scanner

        // We have to represent Scanner Class

        Scanner scanner = new Scanner(System.in);

        System.out.println("Please Enter Your Text!");

        String word = scanner.next();  // Take input until first space/word

        System.out.println(word);

        String line = scanner.nextLine(); // Take input for whole line / sentence

        System.out.println(line);


    }
}