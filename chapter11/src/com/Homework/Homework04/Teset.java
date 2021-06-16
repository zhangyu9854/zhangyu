package com.Homework.Homework04;

public class Teset {
    public static void main(String[] args) {
        Cellphone cellphone = new Cellphone();

        cellphone.testWork(new Cellphone.AB() {
            @Override
            public void work(double n1, double n2) {
                System.out.println(n2 - n1);
            }
        }, 2.1, 3.2);
    }
}
