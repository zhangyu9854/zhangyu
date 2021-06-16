package com.PloyParameter;

public class Ploy {
    public static void main(String[] args) {
        Worker tom = new Worker("tom", 2000);
        Manager jack = new Manager("jack", 3000, 200000);
        Ploy ploy = new Ploy();
        ploy.showEmpAnnual(jack);

    }
    public void showEmpAnnual(Employee e){
        System.out.println(e.getAnnual());
    }
}
