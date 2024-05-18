package com.itheima.a03oopextendsdemo3;

public class DogTest {
    public static void main(String[] args) {
        // 创建对象并调用方法
        Husky h = new Husky();
        h.eat();
        h.drink();
        h.lookHome();
        h.breakHome();

        ChineseDog cd = new ChineseDog();
        cd.eat();
        cd.drink();
        cd.lookHome();

    }
}
