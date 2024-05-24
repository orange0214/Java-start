package com.itheima.test;

import com.itheima.test.domain.Teacher;

public class Test {
    public static void main(String[] args) {
        Student s = new Student();
        s.setName("张三");
        s.setAge(23);

        System.out.println(s.getName() + s.getAge());

        Teacher t = new Teacher();

    }
}
