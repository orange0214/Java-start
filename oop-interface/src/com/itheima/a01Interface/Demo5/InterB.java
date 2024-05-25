package com.itheima.a01Interface.Demo5;

public interface InterB {
    public abstract void method();

    public default void show(){
        System.out.println("接口中的默认方法show");
    }


}
