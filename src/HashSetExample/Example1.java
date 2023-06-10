package HashSetExample;

import java.util.HashSet;

public class Example1 {
    // Write a method to fill a HashSet with 10 random numbers between 0-20. Then print the set
    public static void main(String[] args) {
        HashSet<Integer> numbers = new HashSet<>(10);
        fillMySet(numbers);

    }
    public static void fillMySet(HashSet<Integer>set) {
        while (set.size() < 10) {
            set.add((int) (Math.random() * 20) + 1);
        }
        System.out.println(set);
    }
}
