package com.itheima.define;

public class ArrayDemo4 {
    public static void main(String[] args) {
        // 完成对数组元素求和
        // 1.定义一个数组存储五名员工的销售额
        int[] money = {16, 26, 36, 6, 100};

        int sum = 0;
        // 2.遍历数组中的每个数据
        for (int i = 0; i < money.length; i++) {
            sum += money[i];
        }
        System.out.println(sum);
    }
}
