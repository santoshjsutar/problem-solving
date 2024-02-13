package com.techdotsanjs.reverse;

public class NumberReverse {
    public static void main(String[] args) {
        System.out.println(reverse(123456));
    }

    private static int reverse(int value) {
        int result = 0;
        while (value != 0) {
            int remainder = value % 10;
            result = result * 10 + remainder;
            value = value / 10;
        }
        return result;
    }
}
