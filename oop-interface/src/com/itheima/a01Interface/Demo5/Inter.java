package com.itheima.a01Interface.Demo5;

public interface Inter {

    public abstract void method();

    public default void show(){
        System.out.println("接口中默认方法");
    }
}
