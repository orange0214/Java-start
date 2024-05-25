package com.itheima.a01Interface.Demo6;

public class InterImpl implements Inter{

    @Override
    public void method() {
        System.out.println("实现类中的抽象方法");
    }

    public static void show(){
        System.out.println("实现类中的show方法");
    }

}