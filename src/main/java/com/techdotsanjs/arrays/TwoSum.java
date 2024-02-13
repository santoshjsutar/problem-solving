package com.techdotsanjs.arrays;

import java.util.Arrays;

public class TwoSum {

    public static void main(String[] args) {
        int[] numbers = {1, 3, 7, 9, 2};
        int sum = 16;
        System.out.println("Brute: " + Arrays.toString(twoSumBrute(numbers, sum)));
        System.out.println("Optimized: " + Arrays.toString(twoSumOptimized(numbers, sum)));
    }

    private static int[] twoSumBrute(int[] values, int sum) {
        for (int i = 0; i < values.length; i++) {
            for (int j = i + 1; j < values.length; j++) {
                if (values[i] + values[j] == sum) {
                    return new int[]{values[i], values[j]};
                }
            }
        }
        return null;
    }

    ;

    private static int[] twoSumOptimized(int[] values, int sum) {
        return new int[]{};
    }

    ;
}
