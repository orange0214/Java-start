package com.itheima.a01Interface.Demo1;

public class Dot extends Animal implements Swim{

    public Dot() {
    }

    public Dot(String name, int age) {
        super(name, age);
    }

    @Override
    public void eat(){
        System.out.println("狗吃骨头");
    }

    @Override
    public void swim(){
        System.out.println("狗在狗刨");
    }
}
