package com.techdotsanjs.ignore;
import java.util.*;
import java.util.stream.Collectors;

public class OutputCode {
    public static void main(String[] args) {
        List<Object> num = new ArrayList<>();
        num.add(0);
        num.add(1);
        num.add(2);
        num.add(3);
        num.add(4);
        num.add("5");
        num.add(6);
        num.add("7");
        num.add(8);
        num.add(9);

        Object foundNum = num.stream().filter(i -> i.equals(2)).findFirst().orElse(null);

        List<Object> filterNum = num.stream().filter(i -> !i.equals(2)).collect(Collectors.toList());

        Map<Integer, Object> construct = new HashMap<>();
        for (int idx = 0; idx < num.size(); idx++) {
            construct.put(idx, num.get(idx));
        }

        System.out.println(foundNum);

        List<Integer> num1 = Arrays.asList(1, 2, 3, 4, 5);
        List<Integer> num2 = Arrays.asList(5, 6, 7, 8, 9);

        boolean flag = false;
        for (int i : num1) {
            if (num2.contains(i)) {
                flag = true;
            }
        }

        List<Integer> num3 = new ArrayList<>();
        num3.add(1);
        num3.add(2);
        num3.add(3);
        num3.add(4);
        num3.add(5);

        List<Map<Integer, Integer>> result = new ArrayList<>();
        for (int idx = 0; idx < num3.size(); idx++) {
            Map<Integer, Integer> map = new HashMap<>();
            map.put(idx, num3.get(idx));
            result.add(map);
        }

        System.out.println(result);
    }
}


