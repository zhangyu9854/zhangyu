package com.hspedu.System_;

import java.util.Arrays;

public class System_ {
    public static void main(String[] args) {
        int[] arr1={1,1,3};
        int[] arr2={2,34,4,45,53,44};
        System.arraycopy(arr1,1,arr2,1,2);
        System.out.println(Arrays.toString(arr2));
        System.out.println(System.currentTimeMillis());
    }
}
