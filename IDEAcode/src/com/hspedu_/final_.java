package com.hspedu_;

import java.util.Scanner;

public class final_ {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入半径");
        double r=scanner.nextDouble();
        size s = new size(r);
        System.out.println(r* s.getPai());

    }

}
class size{
    private double r;
    private final  double pai;
       {
        pai = 3.14;
    }

    public size(double r) {
        this.r = r;
    }

    public double getR() {
        return r;
    }

    public void setR(double r) {
        this.r = r;
    }

    public  double getPai() {
        return pai;
    }

}