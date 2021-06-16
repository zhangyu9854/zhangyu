package com.hspedu;

public class StaticMethod {
    public static void main(String[] args) {
        Student jack = new Student("jack");
        jack.paysum(100);
        Student tom = new Student("tom");
        tom.paysum(300.2);
        //Student.showpay();
        tools.calsum(2,3);

    }
}
class tools{
    public static void calsum(double n1,double n2){
        System.out.println(n1 + n2);
    }
}

class Student{
    private String name;
    private static double money=0;

    public Student(String name) {
        this.name = name;
    }
    public static void paysum(double money){
        Student.money+=money;
    }
    public static void showpay(){
        System.out.println(Student.money);
    }
}
