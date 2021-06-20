package com.hspedu.Homework01;

public class ABC {
    public static void main(String[] args) {
        int temp1 = 0;
        int temp2 = 0;
        String email="123@3Aff3vv4zx4sg.";
        char[] chars1 = email.toCharArray();
        for (int i = 0; i < chars1.length; i++) {
            if (chars1[i] == '@') {
                temp1 = i;
            }
            if (chars1[i] == '.') {
                temp2 = i;
            }
        }
        System.out.println(temp1-temp2);
    }
}
