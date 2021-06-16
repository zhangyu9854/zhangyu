package com.Homework.Homework06;

public class Homework06 {
    public static void main(String[] args) {
        Person tang = new Person("唐僧",new Boat());
        tang.Overriver();
        tang.moment();
    }
}
interface Vehicles{
    void work();
}
class Horse implements Vehicles{
    @Override
    public void work() {
        System.out.println("骑马");
    }
}
class Boat implements Vehicles{
    @Override
    public void work() {
        System.out.println("坐船");
    }
}