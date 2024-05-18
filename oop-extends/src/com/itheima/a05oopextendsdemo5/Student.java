package com.itheima.a05oopextendsdemo5;

public class Student {
    String name;
    int age;
    String school;

    public Student(){
        // 细节，虚拟机不会再添加super()
        this(null, 0, "传智大学");
    }

    public Student(String name, int age, String school){
        this.name = name;
        this.age = age;
        this.school = school;
    }
}
