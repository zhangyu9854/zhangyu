package com.hspedu.ArraysMethod;

import java.util.Arrays;
import java.util.Comparator;

public class ArrayExercisePlus2 {
    public static void main(String[] args) {
        Book[] books = new Book[4];
        books[0] = new Book("红罗梦", 100);
        books[1] = new Book("金瓶梅", 90);
        books[2] = new Book("青年文摘", 5);
        books[3] = new Book("javac", 300);
        Arrays.sort(books, new Comparator<Book>() {
            @Override
            public int compare(Book o1, Book o2) {
                return o1.getName().length()- o2.getName().length();
            }
        });
        System.out.println(Arrays.toString(books));

    }
}
