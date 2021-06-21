package com.hspedu.ArrayListSource;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Vector;


public class ArrayListSource {
    public static void main(String[] args) {
        Vector vector = new Vector();
        for (int i = 1; i < 10; i++) {
            vector.add(i);
            System.out.println(vector);
        }
        vector.add(23);
        vector.add(233);
    }
}
