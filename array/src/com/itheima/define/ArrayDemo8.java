package com.itheima.define;

import java.lang.reflect.Array;
import java.util.Arrays;

public class ArrayDemo8 {
    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 40, 50};

        for (int i = 0, j = arr.length-1; i < j; i++, j--) {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        }

        System.out.println(Arrays.toString(arr));
    }
}
