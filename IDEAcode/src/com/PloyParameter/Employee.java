package com.PloyParameter;

public class Employee {
    private String name;
    private int sal;

    public static void main(String[] args) {
        "dd".equals("ddd");
    }
    public Employee(String name, int sal) {
        this.name = name;
        this.sal = sal;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSal() {
        return sal;
    }

    public void setSal(int sal) {
        this.sal = sal;
    }
    public int getAnnual(){
        return 12*sal;

    }
}
