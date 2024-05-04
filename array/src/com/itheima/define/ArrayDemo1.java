package com.itheima.define;

public class ArrayDemo1 {
    public static void main(String[] args) {
        // 目标: 静态初始化数组

        // 数据类型[] 数组名 = new 数据类型[]{ele1, ele2, ele3......}
        int[] ages = new int[]{12, 24, 36};
        double[] scores = new double[]{89.9, 99.5, 59.5};

        // 简化写法 dataType[] arrayName = {...}  BEST
        int[] ages2 = {12, 24, 36};

        // dataType arrayName[]
        int ages3[] = {12, 24, 36};
    }
}
