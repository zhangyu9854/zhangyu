package com.hspedu.StringBufferExercise;

import java.util.Scanner;

public class StringBufferExercise02 {
    public static void main(String[] args) {
        String name="手机";
        String money="123564.59";
        Scanner scanner = new Scanner(System.in);
        String next = scanner.next();
        StringBuffer sb = new StringBuffer(next);
        int index1 = sb.indexOf(".");
        if (index1<0){
            System.out.println(next);;
        }else{
            for (int i = 1; index1-3*i > 0; i++) {
              sb.insert(index1-3*i, ',');
            }
            System.out.println(sb);
        }


    }
}
