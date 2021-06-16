package com.Homework.Homework03;

public abstract class Animal {
    abstract void shout();
}
class Cat extends Animal{
    @Override
    void shout() {

    System.out.println("猫叫");
    }
}
class Dog extends Animal{
    @Override
    void shout() {
        System.out.println("狗叫");
    }
}