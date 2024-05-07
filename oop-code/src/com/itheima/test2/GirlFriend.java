package com.itheima.test2;

public class GirlFriend {
    // 成员变量
    private String name;
    private int age;
    private String gender;

    // 行为
    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getGender(){
        return gender;
    }

    public void setAge(int age) {
        if(age >= 18 && age <= 50){
            this.age = age;
        } else {
            System.out.println("数据非法");
        }
    }

    public int getAge(){
        return age;
    }

    public void setName(String name){
        // this: 表示成员位置
        this.name = name;
    }

    public String getName(){
        return name;
    }

    public void sleep(){
        System.out.println("女朋友在睡觉");
    }
    public void eat(){
        System.out.println("女朋友在吃饭");
    }
}
