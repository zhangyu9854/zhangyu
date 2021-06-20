package com.hspedu.Homework01;

import java.util.Arrays;

public class Homework01 {
    public static void main(String[] args) {
        String str = "abcdef";
        try {
            System.out.println(reverse(str, 1, 14));
        } catch (Exception e) {
            e.getMessage();
        }
    }

    public static String reverse(String str, int start, int end) {
        char[] chars = str.toCharArray();

        for (int i = 0; ; i++) {
            if (start + i < end - i) {
                char temp = chars[start + i];
                chars[start + i] = chars[end - i];
                chars[end - i] = temp;
            } else {
                break;
            }
        }
        return Arrays.toString(chars);
    }
}
