package com.hspedu.Homework01;

import java.util.ArrayList;
import java.util.Iterator;

public class Homework02 {
    public static void main(String[] args) {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList1 = new ArrayList();

        Car car1 = new Car("宝马", 2000000.);
        Car car2 = new Car("奔驰", 3000000.5);
        Car car3 = new Car("宾利", 33000000.5);

        arrayList.add(car1);
        arrayList.add(car2);
        arrayList1.add(car3);
        arrayList.addAll(arrayList1);
        arrayList.remove(1);
        System.out.println(arrayList.contains(1));
        System.out.println(arrayList.isEmpty());
        System.out.println(arrayList.size());
        System.out.println(arrayList);
        for (Object car : arrayList) {
            System.out.println(car);
        }
        Iterator iterator = arrayList.iterator();
        while (iterator.hasNext()) {
            Object car = iterator.next();
            System.out.println(car);
        }
    }
}
class Car{
    private String name;
    private Double price;

    public Car(String name, Double price) {
        this.name = name;
        this.price = price;
    }

    @Override
    public String toString() {
        return "\nCar{" +
                "name='" + name + '\'' +
                ", price=" + price +
                '}';
    }
}