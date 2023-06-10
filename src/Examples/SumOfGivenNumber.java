package Examples;

import java.util.Scanner;

public class SumOfGivenNumber {
    public static void main(String[] args) {
        System.out.println("Enter the number");
        Scanner scan = new Scanner(System.in);
        int number = scan.nextInt();
        int total = 0;
        while (number != 0) {
            int digit = number % 10;
            total += digit;
            number = number / 10;
        }
        System.out.println("Sum of the digits is :" +total);
    }
}
