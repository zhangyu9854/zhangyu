package com.hspedu.ArraysMethod;

import java.util.Arrays;
import java.util.Comparator;

public class ArrayExercise {
    public static void main(String[] args) {
        Book[] books = new Book[4];
        books[0] = new Book("红罗梦", 100);
        books[1] = new Book("金瓶梅", 90);
        books[2] = new Book("青年文摘", 5);
        books[3] = new Book("java", 300);
        sort1(books, new Comparator() {
            @Override
            public int compare(Object o1, Object o2) {
                int i1 = (Integer) o1;
                int i2 = (Integer) o2;
                return i1 - i2;//小--》大
            }
        });
        System.out.println(Arrays.toString(books));
    }

    public static void sort1(Book[] books, Comparator c) {
        for (int j = 0; j < books.length - 1; j++) {
            for (int i = 0; i < books.length - 1 - j; i++) {
                if (c.compare(books[i].getPrice(), books[i + 1].getPrice()) > 0) {
                    Book temp = books[i];
                    books[i] = books[i + 1];
                    books[i + 1] = temp;
                }
            }
        }

    }
}

class Book {
    private String name;
    private int  price;

    public Book(String name, int price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Book{" +
                "name='" + name + '\'' +
                ", price=" + price +
                '}';
    }
}