package Examples;

import java.util.Scanner;

public class GreaterNumberCount {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter 10 Numbers one by one to compare: ");
        int previousNumber = 0;
        int counter = 0;
        for (int i = 0; i < 10; i++) {
            System.out.println("Please enter number " +(i+1));

            int nextNumber = scan.nextInt();
            if (i==0){
                previousNumber = nextNumber;
            }
            if (nextNumber > previousNumber){
                counter++;
            }
            previousNumber = nextNumber;
        }
        System.out.println(counter);
    }
}