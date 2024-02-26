package com.techdotsanjs.ignore;

import java.util.*;
import java.util.concurrent.atomic.AtomicBoolean;

public class MainRunner {
    public static void main(String[] args) {
//        System.out.println(hasPairWithSum(new int[]{1, 4, 3, 4}, 8));
//        findFibonacci(20);
        int[] num = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
        List<Map<Integer, Integer>> construct = new ArrayList<>();

        for (int i = 0; i < num.length; i++) {
            Map<Integer, Integer> map = new HashMap<>();
            map.put(i, num[i]);
            construct.add(map);
        }

        System.out.println(construct);
    }


    private static void findFibonacci(int numberOfSeries) {
        // 0 1 1 2 3 5 8 13 21 34 55
        int firstValue = 0, secondValue = 1, thirdValue;
//        List<Integer> fSeries = new ArrayList<>(List.of(firstValue, secondValue));
        int[] fSeries = new int[numberOfSeries];
        fSeries[0] = firstValue;
        fSeries[1] = secondValue;
        for (int i = 2; i < numberOfSeries; i++) {
            thirdValue = firstValue + secondValue;
            fSeries[i] = thirdValue;
            firstValue = secondValue;
            secondValue = thirdValue;
        }
        System.out.println(fSeries);
    }

    private static void findPalindrom(String value) {
        char[] valueCharacters = value.toCharArray();
        char[] resultValue;
        for (int i = value.length(); i > 0; i--) {
        }
    }

    private static boolean hasPairWithSumWorst(int[] numbers, int sum) {
        boolean result = false;
        for (int i = 0; i < numbers.length; i++)
            for (int j = i + 1; j < numbers.length; j++)
                if (numbers[i] + numbers[j] == sum) result = true;
        return result;
    }

    private static boolean hasPairWithSum(int[] numbers, int sum) {
        Set<Integer> compliments = new HashSet<>();
//        AtomicBoolean result = new AtomicBoolean(false);
        boolean result = false;
        for (int number : numbers) {
            if (compliments.contains(number)) {
                result = true;
            }
            compliments.add(sum - number);
        }
//        Arrays.stream(numbers).forEach(number -> {
//            if (compliments.contains(number)) {
//                result.set(true);
//            }
//            compliments.add(sum - number);
//        });
//        return result.get();
        return result;
    }

    private static boolean hasPairWithSumIfSorted(int[] numbers, int sum) {
        int low = 0;
        int hi = numbers.length - 1;

        while (low < hi) {
            if (numbers[low] + numbers[hi] == sum) return true;
            else if (numbers[low] + numbers[hi] > sum) hi--;
            else if (numbers[low] + numbers[hi] < sum) low++;
        }
        return false;
    }


}
