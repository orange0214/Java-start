package com.itheima.a01Interface.Demo5;

public class InterImpl implements Inter, InterB{

    @Override
    public void method() {
        System.out.println("实现类重写的抽象方法");
    }

    @Override
    public void show(){
        System.out.println("重写show方法");
    }

}
