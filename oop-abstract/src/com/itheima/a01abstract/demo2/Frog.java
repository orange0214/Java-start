package com.itheima.a01abstract.demo2;

public class Frog extends Animal{
    @Override
    public void eat(){
        System.out.println("山羊在吃草");
    }

    public Frog() {
    }

    public Frog(String name, int age) {
        super(name, age);
    }
}
