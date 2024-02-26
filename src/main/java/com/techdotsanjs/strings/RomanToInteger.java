package com.techdotsanjs.strings;

import java.util.HashMap;

import static java.lang.Integer.parseInt;
import static java.util.Objects.isNull;

public class RomanToInteger {

    static HashMap<Character, Integer> romanSymbolMap = new HashMap<>();

    static {
        romanSymbolMap.put('I', 1);
        romanSymbolMap.put('V', 5);
        romanSymbolMap.put('X', 10);
        romanSymbolMap.put('L', 50);
        romanSymbolMap.put('C', 100);
        romanSymbolMap.put('D', 500);
        romanSymbolMap.put('M', 1000);
    }

    public static void main(String[] args) {
//        Example 1:
//        Input: s = "III"
//        Output: 3
//        Explanation: III = 3.
//
//        Example 2:
//        Input: s = "LVIII"
//        Output: 58
//        Explanation: L = 50, V = 5, III = 3.
//
//        Example 3:
//        Input: s = "MCMXCIV"
//        Output: 1994
//        Explanation: M = 1000, CM = 900, XC = 90 and IV = 4.

        String roman1 = "III";
        String roman2 = "LVIII";
        String roman3 = "MCMXCIV";
        System.out.println(romanToInt(roman3));
    }

    private static int romanToInt(String roman) {
        int result = 0;

        for (int i = 0; i < roman.length(); i++) {
            char current = roman.charAt(i);
            char next = roman.charAt(i + 1 < roman.length() ? i + 1 : i);
            Integer iCurrent = romanSymbolMap.get(current);
            Integer iNext = romanSymbolMap.get(next);
            if (isNull(iNext) || iCurrent < iNext) {
                result -= iCurrent;
            } else {
                result += iCurrent;
            }
        }
        return result;
    }
}
