package com.itheima.define;

import java.util.Scanner;

public class ArrayDemo6 {
    public static void main(String[] args) {
        // 目标：完成排位打分的案例
        // 1.定义一个动态初始化的数组，存储六个排位的打分
        double[] arr = new double[6];

        Scanner sc = new Scanner(System.in);
        // 2.遍历数组中每个位置，录入评委的分数
        for (int i = 0; i < arr.length; i++){
            System.out.println("请您输入当前第" + (i+1) + "个评委的分数: ");
            double score = sc.nextDouble();
            arr[i] = score;
        }

        double sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }

        System.out.println("选手最终得分是:" + sum / arr.length);
    }
}
