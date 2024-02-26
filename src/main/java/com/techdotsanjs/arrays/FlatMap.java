package com.techdotsanjs.arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FlatMap {

    public static void main(String[] args) {
//        List<Integer> oddNumbers = Arrays.asList(1, 3, 5);
//        List<Integer> evenNumbers = Arrays.asList(2, 4, 6, 8);
//        List<List<Integer>> listOfOddEvenNumbers =
//                Arrays.asList(oddNumbers, evenNumbers);
//        flattenArray(listOfOddEvenNumbers);
        List<Object> val = Arrays.asList(2, 23, "as", Arrays.asList(1, 4, 9, Arrays.asList(98, 90, Arrays.asList("r", 45))), 87, 19);
        List<Object> r = new ArrayList<>();
        flattenArray(val, r);

    }

    private static void flattenArray(Object value, List<Object> r) {
        if (value instanceof List<?>) {
            for (Object item : (List<?>) value) {
                flattenArray(item, r);
            }
        } else {
            r.add(value);
        }
    }
}
