package com.itheima.a01staticdemo1;

public class Student {
    // 属性：姓名 年龄 性别
    private String name;
    private int age;
    private String gender;

    // 静态变量对所有类共享
    public static String teacherName;

    public Student() {}

    public Student(String name, int age, String gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public static String getTeacherName() {
        return teacherName;
    }

    public static void setTeacherName(String teacherName) {
        Student.teacherName = teacherName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    // 行为
    public void study(){
        System.out.println(name + "正在学习");
    }

    public void show(){
        System.out.println(name +  "," + age + "," +  gender + "," + teacherName);
    }
}
