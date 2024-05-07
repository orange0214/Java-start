package com.itheima.define;

public class ArrayDemo10 {
    public static void main(String[] args) {
        int[] arrs = new int[]{10, 11, 12};
        change(arrs);
        System.out.println(arrs[0]);
    }

    public static void change(int[] arrs) {
        arrs[0] = 200;
        System.out.println(arrs[0]);
    }
}
