package com.hspedu.Homework01;



public class Homework03 {
    public static void main(String[] args) {
        String str="Wi Jik Clinton";
        NameSet(str);
    }

    public static void NameSet(String str){
        String[] s = str.split(" ");
        String format = String.format("%s,%s .%c",s[1], s[2], s[0].toUpperCase().charAt(0));
        System.out.println(format);
    }
}
