package com.hspedu.customExercise;

import java.util.Scanner;

public class CustomExercise {
    public static void main(String[] args) {
        boolean temp=false;
        for (;;) {
            Scanner scanner = new Scanner(System.in);

            int Age = scanner.nextInt();
            if (!(Age > 18 && Age < 120)) {
                throw new AgeException("输入有误");
            }
        }
        //System.out.println("成功");
    }
}
class AgeException extends RuntimeException{
    public AgeException(String message) {
        super(message);
    }
}
