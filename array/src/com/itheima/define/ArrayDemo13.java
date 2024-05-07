package com.itheima.define;

public class ArrayDemo13 {
    public static void main(String[] args) {
        fire();
    }

    public static void fire(){
        System.out.println("发射了一枚武器给默认国家");
    }

    public static void fire(String country){
        System.out.println("发射了一枚武器给" + country);
    }

    public static void fire(String country, int number){
        System.out.println("发射了" + number + "枚武器给" + country);
    }

}
