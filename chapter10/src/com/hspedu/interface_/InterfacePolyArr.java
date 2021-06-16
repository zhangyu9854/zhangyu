package com.hspedu.interface_;

public class InterfacePolyArr {
    public static void main(String[] args) {
        Usb[] usb=new Usb[2];
        usb[0]=new Phone();
        usb[1]=new Camera();
        for (int i = 0; i < usb.length; i++) {
            usb[i].work();
            if (usb[i] instanceof Phone) {
                ((Phone) usb[i]).call();//动态绑定机制
            }
        }
    }
}
interface Usb{
    void work();
}
class Phone implements Usb{
    @Override
    public void work() {
        System.out.println("phone");
    }
    public void call(){
        System.out.println("call");
    }
}
class Camera implements Usb{
    @Override
    public void work() {
        System.out.println("Camera");
    }
}

