package com.hspedu.Final;

import java.util.Scanner;

public class FinalExercise {
    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("请输入半径");
//        double r = scanner.nextDouble();
//        size s = new size(r);
//        System.out.println(r * s.getPai());
        size size1 = new size(2,3.0);
        System.out.println(size1.delsize());
    }

}

class size {
    private double r;
    private double pai;

    public size(double r,  double pai) {
        this.r = r;
        this.pai = pai;
    }

    public double getR() {
        return r;
    }

    public void setR(double r) {
        this.r = r;
    }

    public double getPai() {
        return pai;
    }
    public double delsize(){
       return pai*getR()*getR();
    }


}

