package com.hspedu.wrapper;

public class Integer01 {
    public static void main(String[] args) {
        int n1 = 100;
        Integer integer=n1;
        Double d=100d;
        Object obj1=true?new Integer(1):new Double(2.0);
        System.out.println(obj1);

    }
}
