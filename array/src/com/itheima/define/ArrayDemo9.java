package com.itheima.define;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class ArrayDemo9 {
    public static void main(String[] args) {
        int[] code = new int[5];

        Scanner sc = new Scanner(System.in);
        for(int i = 0; i < 5; i++){
            System.out.println("请您输入当前员工的工号: ");
            code[i] = sc.nextInt();
        }

        Random r = new Random();
        for (int i = 0; i < code.length; i++) {
            // 每遍历一次获取一个随机数
            int random = r.nextInt(code.length);
//            System.out.println(random);
            int temp = code[i];
            code[i] = code[random];
            code[random] = temp;
        }

        System.out.println(Arrays.toString(code));

    }
}
