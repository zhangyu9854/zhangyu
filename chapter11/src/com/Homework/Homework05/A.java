package com.Homework.Homework05;

public class A {

    private final String name = "jack";

    public void F1() {
        class B {
            private String name = "tom";

            public void show() {
                System.out.println(A.this.name);
            }
        }
        B b = new B();
        b.show();
    }


}
