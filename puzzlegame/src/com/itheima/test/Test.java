package com.itheima.test;

import java.util.ArrayList;
import java.util.Random;

public class Test {
    public static void main(String[] args) {
        // 需求:
        // 把一个一维数组中的数据 0~15打乱顺序
        // 再按照4个一组的方式添加到二维数组中
        int[] tempArr = {0,1,2,3,4,5,6,7,8,9,10,11,12,13,14,15};
        Random r = new Random();
        for (int i=0; i<tempArr.length; i++) {
            int index = r.nextInt(tempArr.length);
            int temp = tempArr[i];
            tempArr[i] = tempArr[index];
            tempArr[index] = temp;
        }
        // 创建一个二维数组
        int[][] data = new int[4][4];
        //  给二维数组添加数据
        int index = 0;
        for (int i = 0; i < 4; i ++){
            for (int j = 0; j < 4; j++) {
                data[i][j] = tempArr[index];
                index++;
            }
        }

        for (int i = 0; i < 4; i ++){
            for (int j = 0; j < 4; j++) {
                System.out.print(data[i][j] + " ");
            }
        }


    }
}
