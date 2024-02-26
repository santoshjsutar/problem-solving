package com.techdotsanjs;

import com.techdotsanjs.implementation.IArray;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {
        int a = 9;
        IArray iArray = new IArray(5).push(1).push(2).push(3).push(4).push(5);
        IArray result = new IArray(2);
//        for (int i = 0; i < iArray.size(); i++) {
//            for (int j = 1 + i; j < iArray.size(); j++) {
//                if (iArray.get(i) + iArray.get(j) == a) {
//                    result.push(i);
//                    result.push(j);
//                }
//            }
//        }
        IArray compliment = new IArray(iArray.size());
        for (int i = 0; i < iArray.size(); i++) {
            if (compliment.has(iArray.get(i))) {
                result.push(i);
            } else {
                compliment.push(a - iArray.get(i));
            }
        }
//        System.out.println(new App().isPalindrome("He  {ll;eh "));
    }

    public boolean isPalindrome(String s) {
        if (s.isEmpty()) {
            return true;
        }
        int start = 0;
        int last = s.length() - 1;
        while (start <= last) {
            char currFirst = s.charAt(start);
            char currLast = s.charAt(last);
            if (!Character.isLetterOrDigit(currFirst)) {
                start++;
            } else if (!Character.isLetterOrDigit(currLast)) {
                last--;
            } else {
                if (Character.toLowerCase(currFirst) != Character.toLowerCase(currLast)) {
                    return false;
                }
                start++;
                last--;
            }
        }
        return true;
    }
}
