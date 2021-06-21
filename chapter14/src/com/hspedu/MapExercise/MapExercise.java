package com.hspedu.MapExercise;

import java.util.HashMap;
import java.util.Set;

public class MapExercise {
    public static void main(String[] args) {
        HashMap hashMap = new HashMap();
        hashMap.put("经理1", new Worker("JACK1", 20000., "经理"));
        hashMap.put("董事长", new Worker("JACK", 20002., "董事长"));
        hashMap.put("经理", new Worker("JACK", 20004., "经理"));

        Set keyset = hashMap.keySet();
        for (Object key : keyset) {
            Object worker = hashMap.get(key);
            Worker worker1 = (Worker) worker;
            if (worker1.getSal() > 18000.) {
                System.out.println(hashMap.get(key));
            }
        }
    }
}

class Worker {
    private String name;
    private Double sal;
    private String ID;

    public Worker(String name, Double sal, String ID) {
        this.name = name;
        this.sal = sal;
        this.ID = ID;
    }

    public String getName() {
        return name;
    }

    public Double getSal() {
        return sal;
    }

    public String getID() {
        return ID;
    }

    @Override
    public String toString() {
        return "Worker{" +
                "name='" + name + '\'' +
                ", sal=" + sal +
                ", ID='" + ID + '\'' +
                '}';
    }
}