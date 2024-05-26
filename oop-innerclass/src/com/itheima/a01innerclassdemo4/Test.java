package com.itheima.a01innerclassdemo4;

public class Test {
    public static void main(String[] args) {
        // 创建静态内部类的对象
        Outer.Inner.show2();

        Outer.Inner oi = new Outer.Inner();
        oi.show1();
    }
}
