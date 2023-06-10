package HashSetExample;

import java.util.HashSet;

public class Example2 {
    // Write a method to fill a HashSet with 15 random numbers between 0-10. Then print the set
    public static void main(String[] args) {
        HashSet<Integer> numbers = new HashSet<>();
        fillMySet(numbers);

    }
    public static void fillMySet(HashSet<Integer>set) {
        while (set.size() < 15) {
            set.add((int) (Math.random() * 10) + 1);
            System.out.println("*");
        }
        System.out.println(set);
    }
}
