package com.hspedu.Date_;

import java.time.LocalDate;

public class date01 {
    public static void main(String[] args) {
        LocalDate now = LocalDate.now();
        LocalDate localDate = now.plusDays(22);
        System.out.println(localDate.getMonth());
    }
}
