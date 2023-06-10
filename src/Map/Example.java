package Map;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Example {
    // Write a program that creates a map with Integer 10 keys and 10 values.
    // Fill this map with random numbers between 0-100. And then find the sum of the keys
    // and values separately
    public static void main(String[] args) {
        Map<Integer, Integer> myMap = new HashMap<>();
        Set<Integer> myKeys = new HashSet<>();
        while (myKeys.size() < 10) {
            myKeys.add((int) (Math.random() * 100));
        }
        for (Integer keys: myKeys) {
            myMap.put(keys,(int)(Math.random()*100));
        }
        System.out.println(myMap);
        int sumKeys = 0;
        int sumValues = 0;
        for (Map.Entry<Integer,Integer>entry : myMap.entrySet()){
            sumKeys += entry.getKey();
            sumValues += entry.getValue();
        }
        System.out.println(sumKeys);
        System.out.println(sumValues);
    }
}
// myMap.put((int)(Math.random()*100),(int)(Math.random()*100));