package com.itheima.test2;

public class GirlFriendTest {
    public static void main(String[] args) {
        // 创建GF对象
        GirlFriend gf1 = new GirlFriend();
        gf1.setName("lss");
        gf1.setGender("女");
        gf1.setAge(18);
        System.out.println(gf1.getName());

        gf1.eat();
        gf1.sleep();
    }
}
