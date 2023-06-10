package Map;

import java.util.HashMap;
import java.util.Map;

public class Example1 {
    /* Modify and return the given map as follows: if the key "a" has a value, set the key "b" to have that value,
    and set the key "a" to have the value "". Basically "b" is a bully, taking the value and replacing it with the empty string.

    mapBully({"a": "candy", "b": "dirt"}) → {"a": "", "b": "candy"}
    mapBully({"a": "candy"}) → {"a": "", "b": "candy"}
    mapBully({"a": "candy", "b": "carrot", "c": "meh"}) → {"a": "", "b": "candy", "c": "meh"}*/
    public static void main(String[] args) {
        Map<String,String>myMap = new HashMap<>();
        myMap.put("a","candy");
        myMap.put("b","dirt");
        myMap.put("c","meh");

        if (!myMap.get("a").equals("")){
            myMap.put("b",myMap.get("a"));
            myMap.put("a","");
        }
        System.out.println(myMap);
    }
}
