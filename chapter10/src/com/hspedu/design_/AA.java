package com.hspedu.design_;

public class AA extends AB{
    private int sum=0;
    public void job(){
        for (int i = 1; i < 800000; i++) {
            sum*=i;
        }

    }
}

