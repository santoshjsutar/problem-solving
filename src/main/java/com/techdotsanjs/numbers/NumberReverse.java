package com.techdotsanjs.numbers;

public class NumberReverse {
    public static void main(String[] args) {
//        int inputValue = 123456;
//        int inputValue = 121;
        int inputValue = -121;
        System.out.println(reverse(inputValue));
        System.out.println(isPalindrome(inputValue));
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

    private static boolean isPalindrome(int value) {
        if (value < 0 || value != 0 && value % 10 == 0)
            return false;
        int reverse = 0;
        int temp = value;
        while (temp != 0) {
            reverse = reverse * 10 + (temp % 10);
            temp = temp / 10;
        }
        return value == reverse;
    }
}
