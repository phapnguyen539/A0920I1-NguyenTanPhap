package th_map;

import java.io.StringReader;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class TestMap {
    public static void main(String[] args) {
        Map<String, Integer> hashmap = new HashMap<>();
        hashmap.put("mari", 20);
        hashmap.put("peter", 21);
        hashmap.put("Tom", 19);
        for (String hash : hashmap.keySet()) {
            System.out.println(hash + hashmap.get(hash));
        }
        System.out.println("Hiển thị mục trong hashmap:");
        System.out.println(hashmap + "\n");

        Map<String, Integer> treemap = new TreeMap<>(hashmap);
        treemap.put("mari", 18);
        treemap.put("Tom", 16);
        treemap.put("Nam", 23);
        for (String tree : treemap.keySet()) {
            System.out.println(tree + treemap.get(tree));
        }
        Map<String, Integer> linkedHashMap = new LinkedHashMap<>(16, 0.75f, true);
        linkedHashMap.put("Smith", 30);
        linkedHashMap.put("Anderson", 31);
        linkedHashMap.put("Lewis", 29);
        linkedHashMap.put("Cook", 29);
        for (String key : linkedHashMap.keySet()) {
            System.out.println("\nThe age for " + "Lewis is " + linkedHashMap.get(linkedHashMap));
        }
    }
}