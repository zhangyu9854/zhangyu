package com.Homework.Homework04;

public class Cellphone {

    public void testWork(AB ab, double n1, double n2) {
        ab.work(n1, n2);
    }

    interface AB {
        void work(double n1, double n2);
    }
}

