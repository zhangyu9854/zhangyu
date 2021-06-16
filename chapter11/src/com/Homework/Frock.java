package com.Homework;

public class Frock {
    private static int currentNum=100000;
     public static int getNextNum() {
        return currentNum+=100;
    }
    private int serialNumber;

    public int getSerialNumber() {
        return serialNumber;
    }
    //构造器

    public Frock(int serialNumber) {

        this.serialNumber = getNextNum();

    }
}
