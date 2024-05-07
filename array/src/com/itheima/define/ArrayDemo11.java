package com.itheima.define;

public class ArrayDemo11 {
    public static void main(String[] args) {
        int[] arr = {10, 30, 50, 70};
        printArray(arr);
    }

    public static void printArray(int[] arr) {

        if(arr == null) {
            System.out.println(arr); // null
            return;
        }

        System.out.print("[");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(i == arr.length-1 ? arr[i] : arr[i] + ", ");
        }
        System.out.print("]");
    }
}
