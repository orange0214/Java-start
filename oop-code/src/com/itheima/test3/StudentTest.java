package com.itheima.test3;

import java.sql.SQLOutput;

public class StudentTest {
    public static void main(String[] args) {
        Student s = new Student("zhangsan", 23);
        System.out.println(s.getName());
        System.out.println(s.getAge());
    }
}
