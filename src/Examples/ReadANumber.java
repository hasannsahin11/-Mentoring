package Examples;

import java.util.Scanner;

public class ReadANumber {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the number");
        double num = scan.nextDouble();

        if (num>0){
            if (Math.abs(num)<1){
                System.out.println("Positive small number.");
            }else if (num>1000000){
                System.out.println("Positive large number");
            } else {
                System.out.println("Positive number");
            }
        }

    }
}
