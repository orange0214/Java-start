package com.itheima;

import java.util.Scanner;

public class Test3 {
    public static void main(String[] args) {
        double score = getAverageScore(3);
        System.out.println(score);
    }

    public static double getAverageScore(int number) {
        int[] scores = new int[number]; // 6

        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < scores.length; i++) {
            System.out.println("请录入"+(i+1)+"个评委的分数: ");
            scores[i] = sc.nextInt();
        }

        int sum = 0;
        int max = scores[0];
        int min = scores[0];

        // 遍历数组找出数据
        for (int score : scores) {
            sum += score;
            if(score > max){
                max = score;
            }
            if(score < min){
                min = score;
            }
        }

        sum -= max;
        sum -= min;

        return 1.0 * sum / (number-2);
    }
}
