package com.hspedu.ArraysMethod;

import java.util.Arrays;

public class ArraysMethod02 {
    public static void main(String[] args) {
        Integer[] integers = {3, 3, 4, 5};
        Arrays.fill(integers,1);
        int[] arr={1,-2,3,0,67};
        int[] arr1=Arrays.copyOf(arr,7);
        System.out.println(Arrays.toString(integers));
    }
}
