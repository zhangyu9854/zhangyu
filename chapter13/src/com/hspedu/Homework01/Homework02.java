package com.hspedu.Homework01;

import java.util.Scanner;

public class Homework02 {
    public static void main(String[] args) {
        try {
            userRegister("zhan","324444","1344");
            System.out.println("成功");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public static void userRegister(String name, String pwd, String email) {
        if (!(name.length() >= 2 && name.length() <= 4)) {
            throw new RuntimeException("长度为2、3、4");
        }
        if (!(pwd.length() == 6 && checkNum(pwd))) {
            throw new RuntimeException("密码错误");
        }
        if (checkEmail01(email)) {
            throw new RuntimeException("邮箱名错误");
        }

    }

    public static boolean checkNum(String pwd) {
        char[] chars = pwd.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            if (chars[i] > '9' && chars[i] < '0') {
                return false;
            }
        }
        return true;
    }

    public static boolean checkEmail(String email) {
        int temp1 = 0;
        int temp2 = 0;
        char[] chars1 = email.toCharArray();
        for (int i = 0; i < chars1.length; i++) {
            if (chars1[i] == '@') {
                temp1 = i;
            }
            if (chars1[i] == '.') {
                temp2 = i;
            }
        }
        if (!(temp1 != 0 && temp2 != 0)) {
            return true;
        } else {
            if (temp1 > temp2) {
                return true;
            }
            return false;
        }

    }
public static boolean checkEmail01(String email){
    int index01 = email.indexOf('@');
    int indexlast01 = email.lastIndexOf('@');
    int index02 = email.indexOf('.');
    int indexlast02 = email.lastIndexOf('.');
    if ((index01-indexlast01)==0&&(index02-indexlast02)==0){
        if (index01<index02){
            return false;
        }
    }return true;
}
}
