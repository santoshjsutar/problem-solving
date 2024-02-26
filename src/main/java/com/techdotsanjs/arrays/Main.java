package com.techdotsanjs.arrays;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        String s = "heleh";
        System.out.println("isPalindrome(s): " + isPalindrome(s));

        List<Object> val = Arrays.asList(2, 23, "as", Arrays.asList(1, 4, 9, Arrays.asList(98, 90, Arrays.asList("r", 45))), 87, 19);
        List<Object> r = new ArrayList<>();
        flattenValue(val, r);
        System.out.println(r);

        List<String> arr = Arrays.asList("Alice", "Bob", "Cloe", "Alice");
        System.out.println(mapper(arr));
    }
    public static Map<String, Integer> mapper(List<String> arr) {
        Map<String, Integer> mapObj = new HashMap<>();
        for (String i : arr) {
            mapObj.put(i, mapObj.getOrDefault(i, 0) + 1);
        }
//        return mapObj;

        // The following code is an alternative using a regular HashMap
        Map<String, Integer> obj = new HashMap<>();
        for (String i : arr) {
            obj.put(i, obj.getOrDefault(i, 0) + 1);
        }
//        return obj;

        // The following code is an alternative using Java 8 Stream API
        return arr.stream().reduce(
            new HashMap<String, Integer>(),
            (acc, item) -> {
                acc.put(item, acc.getOrDefault(item, 0) + 1);
                return acc;
            },
            (acc1, acc2) -> {
                acc2.forEach((k, v) -> acc1.merge(k, v, Integer::sum));
                return acc1;
            }
        );

    }
    public static boolean isPalindrome(String s) {
        for (int i = 0; i < s.length() / 2; i++) {
            if (s.charAt(i) != s.charAt(s.length() - i - 1)) {
                return false;
            }
        }
        return true;
    }

    public static void flattenValue(Object value, List<Object> r) {
        if (value instanceof List<?>) {
            for (Object item : (List<?>) value) {
                flattenValue(item, r);
            }
        } else {
            r.add(value);
        }
    }
}


