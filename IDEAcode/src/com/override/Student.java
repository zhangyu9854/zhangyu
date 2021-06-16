package com.override;

public class Student extends Person {
    private int ID;
    private double score;

    public Student(String name, int age, int ID, double score) {
        super(name, age);
        this.ID = ID;
        this.score = score;
    }
    public String say(){
        return super.say()+ID+score;
    }
}
