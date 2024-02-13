package com.techdotsanjs.strings;

public class StringReverse {
    public static void main(String[] args) {
        String inputValue = "santosh";
        System.out.println(reverse(inputValue));
    }

    private static String reverse(String value) {
        StringBuilder result = new StringBuilder();
        for (int i = value.length() - 1; i >= 0; i--) {
            result.append(value.charAt(i));
        }
        return result.toString();
    }
}
