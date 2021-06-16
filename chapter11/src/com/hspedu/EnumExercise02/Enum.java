package com.hspedu.EnumExercise02;

public class Enum {
    public static void main(String[] args) {

        for (Week week3 : Week.values()) {
            System.out.println(week3);
        }
    }
}
interface AB{
    void ab();}
enum Week implements AB{

    MONDAY("星期一"), TUESDAY("星期二"), WEDNESDAY("星期三");
    private String name;

    private Week(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return name;
    }

    @Override
    public void ab() {

    }
}
