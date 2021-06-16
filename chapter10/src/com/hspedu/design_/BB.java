package com.hspedu.design_;

public class BB extends AB {
    private int sum=0;
    public void job(){
        for (int i = 1; i < 5000000; i++) {
            sum*=i;
        }

    }
}
