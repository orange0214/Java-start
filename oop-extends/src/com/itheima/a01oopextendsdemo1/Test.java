package com.itheima.a01oopextendsdemo1;

public class Test {
    public static void main(String[] args) {
        // 创建对象并调用方法

        // 创建布偶猫对象
        Ragdoll rd = new Ragdoll();
        rd.eat();
        rd.drink();
        rd.catchMouse();

        // 创建哈士奇对象
        Husky h = new Husky();
        h.breakHome();
        h.lookHome();
        h.drink();
        h.eat();
    }
}
