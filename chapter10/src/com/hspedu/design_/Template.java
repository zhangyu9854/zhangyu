package com.hspedu.design_;

public class Template {
    public static void main(String[] args) {
        AA aa = new AA();
        aa.template();
        BB bb = new BB();
        bb.template();

    }
}
abstract class AB{
    public abstract void job();//先说明抽象方法

    public void template(){
    long state = System.currentTimeMillis();
    job();
    long end = System.currentTimeMillis();
        System.out.println(end-state);
    }
    public void ABC(){
        job();
        template();
    }
}
