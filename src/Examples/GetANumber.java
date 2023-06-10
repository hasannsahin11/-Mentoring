package Examples;

import java.util.Scanner;

public class GetANumber {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Pos or Neg?");
        int num = scan.nextInt();

        if (num>0){
            System.out.println("The number is positive");
        } else if (num<0){
            System.out.println("The number is negative");
        } else {
            System.out.println("The number is ZERO");
        }
    }
}
