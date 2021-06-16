package com.Homework.Homework07;

public class Homework07 {
    public static void main(String[] args) {
        Car car = new Car();
        car.new Air().flow(-10);
    }
}
class Car{
    private int temperature;
    class Air{
        public void flow(int temperature){
            if(temperature>40){
                System.out.println("吹冷风");
            }else if(temperature<0){
                System.out.println("吹热风");
            }else {
                System.out.println("不吹风");
            }

        }
    }
}
