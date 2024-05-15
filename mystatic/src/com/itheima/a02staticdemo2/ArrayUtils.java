package com.itheima.a02staticdemo2;

public class ArrayUtils {
    // 私有化构造方法
    // 不让外界创建他的对象
    private ArrayUtils(){}

    public static String printArr(int[] arr){
        StringBuilder sb = new StringBuilder();
        sb.append('[');
        for (int i = 0; i < arr.length; i++) {
            // i 索引 arr[i] 元素
            if(i==arr.length-1){
                sb.append(arr[i]);
            }else{
                sb.append(arr[i]).append(", ");
            }
        }
        sb.append("]");
        return sb.toString();
    }

    public static double getAverage(double[] arr){
        double sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        return sum/arr.length;
    }
}
