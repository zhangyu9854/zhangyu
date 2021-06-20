package com.hspedu.ArraysMethod;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Comparator;

public class ArraysSortCustom {
    public static void main(String[] args) {
        int[] arr={1,-2,3,0,67};
        //Arrays.sort(arr);
        bubble02(arr, new Comparator() {
            @Override
            public int compare(Object o1, Object o2) {
                int i1=(Integer) o1;
                int i2=(Integer) o2;
                return i1-i2;
            }
        });
        System.out.println("呀呀呀呀呀"+ Arrays.toString(arr));
    }
    public static void bubble02(int[] arr, Comparator c){
        for (int i = 0; i <arr.length-1 ; i++) {
            for (int j = 0; j < arr.length-1-i; j++) {
                if(c.compare(arr[j],arr[j+1])<0){
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }

            }

        }
        System.out.println(arr);
    }
}
