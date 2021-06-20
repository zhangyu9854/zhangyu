package com.hspedu.Homework01;

public class Homework04 {
    public static void main(String[] args) {
        String str="fsagagag  ga..ag// 336473568";
        NumCount(str);
    }
    public static void NumCount(String str) {
        if (str == null) {
            return;
        }
        int index1 = 0;
        int index2 = 0;
        int index3 = 0;
        int index4 = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) >= '0' && str.charAt(i) <= '9') {
                index1++;
            } else if (str.charAt(i) >= 'a' && str.charAt(i) <= 'z') {
                index2++;
            } else if (str.charAt(i) >= 'A' && str.charAt(i) <= 'Z') {
                index3++;
            } else {
                index4++;
            }

        }
        System.out.println("数字有"+index1);
        System.out.println("小写字母有"+index2);
        System.out.println("大写字母有"+index3);
        System.out.println("其他字符有"+index4);
    }
}
