package com.techdotsanjs.numbers;

public class NumberReverse {
    public static void main(String[] args) {
        int inputValue = 123456;
        System.out.println(reverse(inputValue));
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
