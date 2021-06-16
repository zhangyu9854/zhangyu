package com.hspedu.AbstractExercise01;

public class AbExercise {
    public static void main(String[] args) {
        Manager jack = new Manager("JACK", "经理", 20000, 30000);
        jack.work();
        CommonEmployee tom = new CommonEmployee("tom", "员工", 10000);
        tom.work();
    }
}
