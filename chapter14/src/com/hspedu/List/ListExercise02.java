package com.hspedu.List;

import java.util.LinkedList;
import java.util.List;

public class ListExercise02 {
    public static void main(String[] args) {
        List list = new LinkedList();
        list.add(new Book("三国",30,"罗贯中"));
        list.add(new Book("三国1",60,"罗贯中弟弟"));
        list.add(new Book("三国2",50,"罗贯中哥哥"));
        sortPrice(list);
        for (Object o : list) {
            System.out.println(o);
        }
    }
    public static List sortPrice(List list){
        int size = list.size();
        for (int i = 0; i <size-1 ; i++) {
            for (int j = 0; j < size-1-i; j++) {
                Book book1 = (Book) list.get(j);
                Book book2 = (Book) list.get(j+1);
                if (book1.getPrice()>book2.getPrice()){
                    list.set(j,book2);
                    list.set(j+1,book1);
                }
            }
        }
        return list;
    }
}
    class Book{
        private String name;
        private int price;
        private String author;

        public Book(String name, int price, String author) {
            this.name = name;
            this.price = price;
            this.author = author;
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

        public String getAuthor() {
            return author;
        }

        public void setAuthor(String author) {
            this.author = author;
        }

        @Override
        public String toString() {
            return
                    "名称:" + name + "\t" +
                    "价格:" + price +"\t"+
                    "作者:" + author + "\t"
                    ;
        }
    }

