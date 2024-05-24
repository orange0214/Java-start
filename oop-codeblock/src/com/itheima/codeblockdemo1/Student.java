package com.itheima.codeblockdemo1;

public class Student {

    private String name;
    private int age;

    static {
        System.out.println("静态代码块执行");
    }

    public Student() {
        System.out.println("空参构造");
    }

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }
}
