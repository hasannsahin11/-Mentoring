package Examples;

import java.util.Scanner;

public class RandomNumberExamp {
    public static void main(String[] args) {
       int randomNumber = (int)(Math.random()*100)+1;
       int attempts = 1;
       Scanner scan = new Scanner(System.in);
       while(attempts<11) {
           System.out.println("Try to guess the random number");
           int answerOfUser = scan.nextInt();
           if (answerOfUser == randomNumber){
               System.out.println("Congrats! You win.");
               break;
           } else if (answerOfUser > randomNumber) {
               System.out.println("Too high.");
               System.out.println("You have " + (10-attempts) + " attempts left.") ;
           } else {
               System.out.println("Too low.");
               System.out.println("You have " + (10 - attempts) + " attempts left.");
           }
           if (attempts==10){
               System.out.println("Sorry! You lost.");
           }
           attempts++;
       }
    }
}
