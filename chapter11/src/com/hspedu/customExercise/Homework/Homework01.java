package com.hspedu.customExercise.Homework;

import java.util.Scanner;

public class Homework01 {
    public static void main(String[] args) {
        if (args.length != 2) {
            throw new ArrayIndexOutOfBoundsException("两个字符");
        }
        try {
            int input1 = Integer.parseInt(args[0]);
            int input2 = Integer.parseInt(args[1]);

            cal(input1, input2);
        } catch (NumberFormatException e) {
            System.out.println("字符格式不正确");
            ;
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println(e.getMessage());
        } catch (ArithmeticException e) {
            System.out.println("被除数不为0");
        }
    }


    public static void cal(int n1, int n2) {
        System.out.println(n1 / n2);
    }
}