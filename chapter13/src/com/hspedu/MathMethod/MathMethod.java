package com.hspedu.MathMethod;

public class MathMethod {
    public static void main(String[] args) {
        new MathMethod().randomint(2,24);

//        for (int i = 0; i < 3; i++) {
//            double random = Math.random();
//            long round = Math.round(random * 10);
//            System.out.println(round);
        }


    public void randomint(int a,int b){
        System.out.println((int)(a+Math.random()*(b-a+1)));
    }
}
