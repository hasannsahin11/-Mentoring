package Examples;

import java.util.Scanner;

public class NeptuneClass {
        public static void main(String[] args) {
            Scanner scan = new Scanner(System.in);

            System.out.println("What is the farthest planet in the solar system? ");
            System.out.println("a) Venus");
            System.out.println("b) Pluto");
            System.out.println("c) Neptune");

            System.out.println("Enter your password: ");
            char answer = scan.next().charAt(0);


            if (answer == 'a' || answer == 'c'){
                System.out.println(answer + " is wrong.");
            } else if (answer == 'b'){
                System.out.println(answer + " is correct.");
            } else {
                System.out.println(answer + " is not valid answer.");
            }
        }
    }
