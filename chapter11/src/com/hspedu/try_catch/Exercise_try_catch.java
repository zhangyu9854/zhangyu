package com.hspedu.try_catch;

import java.util.Scanner;

public class Exercise_try_catch {
    public static void main(String[] args) {
        for (; ; ) {
            try {
                Scanner scanner = new Scanner(System.in);
                int cord = scanner.nextInt();
                System.out.println(cord);
            } catch (Exception e) {
                System.out.println("输入整数");
            }
        }
    }
}
