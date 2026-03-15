package hashmap;
//import java.util.*;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class HashMapDemo {

    public static void main(String[] args) {

        HashMap<Integer, String> map = new HashMap<>();

        map.put(1, "Yash");
        map.put(2, "Sanju");
        map.put(3, "Vikram");

        System.out.println(map);

//        String Student = map.get(3);
        String Student = map.get(33);
        System.out.println(Student);


        System.out.println("Is map contain any key 4 : " + map.containsKey(4));
        System.out.println("Is map contain any key 1 : " + map.containsKey(1));
        System.out.println("Is map contain any key 8 : " + map.containsKey(8));
        System.out.println("Is map contain any key 2 : " + map.containsKey(2));

        System.out.println();

        System.out.println("Is map contain any Value Tushar " + map.containsValue("Tushar"));
        System.out.println("Is map contain any Value Yash " + map.containsValue("Yash"));
        System.out.println("Is map contain any Value Rohit " + map.containsValue("Rohit"));
        System.out.println("Is map contain any Value Sanju " + map.containsValue("Sanju"));

        System.out.println();

        Set<Integer> keys = map.keySet();
        for (int i : keys) {
            System.out.println(map.get(i));
        }

        System.out.println();

        Set<Map.Entry<Integer, String>> entries = map.entrySet();

        for (Map.Entry<Integer, String> entry : entries) {
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }

        System.out.println();

        for (Map.Entry<Integer, String> entry : entries) {
            entry.setValue(entry.getValue().toUpperCase());
        }
        System.out.println(map);
        System.out.println();

        System.out.println("Here we remove a key : " + map.remove(3));
        System.out.println("Now, mao is  " + map);

        System.out.println();

        boolean result = map.remove(2, "Sanju");

        System.out.println("Key 2, Sanju Removed ? " + result); // Because in map Sanju is in uppercase : SANJU....so, that's why it was not removed from map
        System.out.println(map);
    }
}
