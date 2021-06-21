package com.hspedu.TreeSet_;

import java.util.Comparator;
import java.util.TreeSet;

public class TreeSetExercise01 {
    public static void main(String[] args) {
        TreeSet treeSet = new TreeSet(new Comparator() {
            @Override
            public int compare(Object o1, Object o2) {
                return ((String)o1).length()-((String)o2).length();
            }
        });
        treeSet.add("jack");
        treeSet.add("back");
        treeSet.add("fack");
        treeSet.add("ack");
        treeSet.add("ck");
        System.out.println(treeSet);
    }
}
