package com.houserent.view;

import com.houserent.Utility.Utility;
import com.houserent.domain.House;

public class houseview {
    private boolean temp = true;
    private char key;

    //房屋删除
    public int delhouse(){
        System.out.println("=====房屋删除=====");
        System.out.println("输入删除房间的Id,若为-1表示退出");
        int delId = Utility.readInt(2);
        if (delId==-1){
            System.out.println("退出");
        }


    }
    //房屋出租添加
    public boolean addHouse(){
        System.out.println("=====房屋添加=====");
        System.out.println("姓名");
        String name = Utility.readString(8, "");
        System.out.println("电话");
        String phone = Utility.readString(12);
        System.out.println("地址");
        String address = Utility.readString(4);
        System.out.println("月租");
        int rent = Utility.readInt(8);
        System.out.println("状态（未/已出租）");
        String state = Utility.readString(6);
        House newHouse = new House(0, name, phone, address, rent, state);


    }
    //


    public void mainMenu(){
        do {
            System.out.println("----房屋出租系统-----");
            System.out.println("1 新增房源");
            System.out.println("2 查找房屋");
            System.out.println("3 删除房屋");
            System.out.println("4 修改房屋信息");
            System.out.println("5 房屋列表");
            System.out.println("6 退    出");

            System.out.println("请输入1-6");
            key= Utility.readChar();
            switch (key){
                case '1':
                    System.out.println("1 新增房源");
                    break;
                case '2':
                    System.out.println("2 查找");
                    break;
                case '3':
                    System.out.println("3 修改");
                    break;
                case '4':
                    System.out.println("4 删除");
                    break;
                case '5':
                    System.out.println("5 房屋列表");
                    break;
                case '6':
                    System.out.println("6 退出");
                    break;
            }


        }while (temp);
    }

}
