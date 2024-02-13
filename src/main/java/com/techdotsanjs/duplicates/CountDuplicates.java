package com.techdotsanjs.duplicates;

import java.util.HashMap;
import java.util.Map;

public class CountDuplicates {
    public static void main(String[] args) {
        System.out.println(getDuplicates(new String[]{"one", "two", "three", "four", "two"}));
    }

    private static Map<String, Integer> getDuplicates(String[] values) {
        Map<String, Integer> counts = new HashMap<>();
        for (String value : values) {
            if (counts.containsKey(value)) {
                counts.put(value, counts.get(value) + 1);
            } else {
                counts.put(value, 1);
            }
        }
        return counts;
    }
}
