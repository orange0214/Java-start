package com.itheima;

public class Test5 {
    public static void main(String[] args) {
        for(int i = 101; i<= 200; i++) {
            if(check(i)){
                System.out.println(i);
            }
        }
    }

    public static boolean check(int data) {
        for(int i = 2; i <= data / 2; i++){
            if (data % i == 0){
                return false;
            }
        }
        return true;
    }

}
