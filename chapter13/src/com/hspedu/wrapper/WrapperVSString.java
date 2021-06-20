package com.hspedu.wrapper;

public class WrapperVSString {
    public static void main(String[] args) {
        Double i=110.;
        String str1 = i.toString();
        String str2 = String.valueOf(i);
        String str3=i+"";
        System.out.println(str1+"+"+str2+"+"+str3);
    }
}
