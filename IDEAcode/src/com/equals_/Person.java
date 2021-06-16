package com.equals_;

public class Person {
    public static void main(String[] args) {
        person1 person1 = new person1("zhangyu", 20, '男');
        System.out.println(person1);
    }
}
    class person1{
        private String name;
        private int age;
        private char gender;

        public person1(String name, int age, char gender) {
            this.name = name;
            this.age = age;
            this.gender = gender;
        }

    }


