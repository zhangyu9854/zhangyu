package com.houserent.service;

import com.houserent.domain.House;

public class houseService {
    private House[] houses;
    //构造器
    public houseService(int size){
        houses=new House[size];
        houses[0]=new House(1,"jack","911","海淀区",2000,"未出租");
    }


    //del方法

    //add方法
    private int number=1;
    private int Idnum=1;

    public boolean add(House newHouse){
        if (houses.length<=number){
            System.out.println("满了");
            return false;
        }
        houses[number++]=newHouse;

        //设置ID自增长
        newHouse.setId(++Idnum);
        return true;
    }











    public House[] list(){
        return houses;
    }
}
