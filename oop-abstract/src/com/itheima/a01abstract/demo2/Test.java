package com.itheima.a01abstract.demo2;

public class Test {
    public static void main(String[] args) {
        Frog f = new Frog("小绿", 1);

        System.out.println(f.getName() + ", " + f.getAge());
        f.drink();
        f.eat();
    }
}
