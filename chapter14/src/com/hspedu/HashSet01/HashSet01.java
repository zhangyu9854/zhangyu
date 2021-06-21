package com.hspedu.HashSet01;

import java.util.HashSet;


public class HashSet01 {
    public static void main(String[] args) {
        HashSet set = new HashSet();
//        for (int i = 0; i <6 ; i++) {
//            System.out.println(set.add("演员"+i+"号"));
//        }
//        System.out.println(set.add("演员"+1+"号"));
//        System.out.println(set.add("演员"+2+"号"));
//        System.out.println(set.add("演员"+3+"号"));
//        System.out.println(set.add("演员"+4+"号"));
//        System.out.println(set.add("演员"+4+"号"));
//        System.out.println(set.add("演员"+5+"号"));
        set.add("java");
        set.add(new Dog("GGG"));
        set.add(new Dog("GGG"));
        System.out.println(set);
    }
}
class Dog{
    private String name;

    public Dog(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Dog{" +
                "name='" + name + '\'' +
                '}';
    }
}
