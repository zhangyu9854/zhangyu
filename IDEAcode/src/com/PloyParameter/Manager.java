package com.PloyParameter;

public class Manager extends Employee{
    private int bonus;

    public Manager(String name, int sal, int bonus) {
        super(name, sal);
        this.bonus = bonus;
    }

    @Override
    public int getAnnual() {
        return super.getAnnual()+bonus;
    }
    public void manage(){
        System.out.println("管理方法");
    }
}
