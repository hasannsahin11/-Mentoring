package Examples;

import java.util.Scanner;

public class SumNumbersGivenByUser {
    public static void main(String[] args) {
        // Write a code that gets numbers from the user and asks
        // if the user wants to put another number
        // After the user prints no the program
        // should print the sum of the numbers that are given by the user
        Scanner scan = new Scanner(System.in);
        int total =0;
        String answer ="Y";

        while(answer.equalsIgnoreCase("y")) {
            System.out.println("Enter a number: ");
            int num = scan.nextInt();
            total += num;

            System.out.println("Would you like to add another number? Y/N");
            answer = scan.nextLine();
            answer = scan.nextLine();
        }
        System.out.println(total);
    }
}
