package com.itheima.a01innerclassdemo2;

public class Test {
    public static void main(String[] args) {
        // 要创建的是内部类的对象
        // Inner
        // 增加外部类标识
        Outer o = new Outer();
        o.name = "name";
        // 内部类对象
        System.out.println(o.getInstance());

        // name是成员变量，只能通过对象进行调用
        System.out.println(o.name);

    }
}
