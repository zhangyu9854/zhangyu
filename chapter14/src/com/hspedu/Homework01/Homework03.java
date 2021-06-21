package com.hspedu.Homework01;


import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class Homework03 {
    public static void main(String[] args) {
        Map m = new HashMap();
        m.put("jack",650);
        m.put("tom",1200);
        m.put("smith",2900);
        m.replace("jack",2600);
        //Collection values = m.values();
        Set key = m.keySet();
        for (Object value : key) {
            //Integer integer=(Integer)value;
            //int price1=integer;
            m.put(value,(Integer)m.get(value)+100);
            System.out.println(m);
        }

        for (Object name : key) {
            System.out.println(name);
        }
        Iterator iterator = key.iterator();
        while (iterator.hasNext()) {
            Object name = iterator.next();
            System.out.println(name);
        }
    }
}
