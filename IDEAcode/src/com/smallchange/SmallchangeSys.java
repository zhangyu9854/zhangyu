package com.smallchange;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class SmallchangeSys {
    public static void main(String[] args) {
        boolean temp=true;
        Scanner scanner = new Scanner(System.in);
        String key;
        double money=0;
        double balance=0;
        Date date=null;

        SimpleDateFormat scd=new SimpleDateFormat("yyyy-mm-dd hh:mm");
        String details="---------零钱通明细如下-----------"+"\n";
        do {
            System.out.println("=========零钱通菜单===========");
            System.out.println("===1 零钱通明细");
            System.out.println("===2 收益入账");
            System.out.println("===3 消费");
            System.out.println("===4 退   出");

            System.out.println("请选择（1-4）");
            key=scanner.next();






            switch (key){
                case "1":
                    System.out.println(details);
                    break;
                case "2":
                    System.out.println("收益入账金额");
                    money=scanner.nextDouble();
                    balance+=money;
                    date = new Date();

                    details+="\n收益入账\t"+money+"\t"+scd.format(date)+"\t"+balance;

                    break;
                case "3":
                    System.out.println("===3 消费");
                    break;
                case "4":
                    System.out.println("===4 退   出");
                    temp=false;
                    break;
                default:
                    System.out.println("输入有误，");
            }




        }while (temp);
        System.out.println("---退出零钱通---");
    }
}
