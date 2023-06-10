package Examples;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class ArrayList01 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        addElement(list);
        displayElements(list);
        System.out.println(searchIndex(list));

    }
    public static void addElement(ArrayList list){
        Scanner scan = new Scanner(System.in);
        String answer;
        do {
            System.out.println("Enter the number you want to add to the list");
            int number = scan.nextInt();
            list.add(number);
            System.out.println("Do you want to add a new number? Y/N");
            scan.nextLine();
            answer = scan.nextLine();
        } while(answer.equalsIgnoreCase("Y"));

    }
    public static void displayElements(ArrayList<Integer>list){
        System.out.println("Please enter the index of the element you want to see");
        Scanner scan = new Scanner(System.in);
        int index = scan.nextInt();
        if (index>= list.size()){
            System.out.println("Index is not valid");
        }
        System.out.println(list.get(index));
    }
    public static String searchIndex(ArrayList<Integer> list){
        System.out.println("Which index would you like to get?");
        Scanner scan = new Scanner(System.in);
        int element = scan.nextInt();
        if (list.contains(element)){
            return "The element is in the index" + list.indexOf(element);
        } else {
            return "The element is not in the list";
        }
    }
}
