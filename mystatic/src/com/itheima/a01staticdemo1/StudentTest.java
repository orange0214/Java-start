package com.itheima.a01staticdemo1;

public class StudentTest {
    public static void main(String[] args) {
        // 1.创建第一个学生对象
        Student s1  =  new Student();

        s1.setName("张三");
        s1.setAge(23);
        s1.setGender("男");
        Student.teacherName = "阿伟老师";

        s1.study();
        s1.show();

        // 2.创建第二个学生对象
        Student s2 = new Student();

        s2.setName("李四");
        s2.setAge(24);
        s2.setGender("女");

        s2.study();
        s2.show();
    }
}
