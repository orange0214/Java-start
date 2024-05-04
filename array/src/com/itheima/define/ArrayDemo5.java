package com.itheima.define;

public class ArrayDemo5 {
    public static void main(String[] args) {
        // 掌握定义数组的方式二：动态初始化数组
        // 1.数据类型
        int[] arr = new int[3];

        arr[0] = 1;
        arr[1] = 2;
        arr[2] = 3;

        for (int i : arr) {
            System.out.println(i);
        }
    }

}
