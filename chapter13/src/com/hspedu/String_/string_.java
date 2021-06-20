package com.hspedu.String_;

public class string_ {
    public static void main(String[] args) {

       String n1="hsp";
       String n2="hsp";
        String tgtStr = n1.toString();
        System.out.println(tgtStr);

        StringBuffer stringBuffer01 = new StringBuffer("ggggggggg");
        stringBuffer01 = stringBuffer01.insert(1, 'z');
        System.out.println(stringBuffer01);
        System.out.println(n1==n2);

        System.out.println(n1.substring(0,2));
        System.out.println(n1+n2+"dddz");



    }
}
