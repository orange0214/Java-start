package com.itheima.a01Interface.Demo4;

public class BasketBallCoach extends Coach{

    @Override
    public void teach() {
        System.out.println("篮球教练正在教如何打篮球");
    }

    public BasketBallCoach() {
    }

    public BasketBallCoach(String name, int age) {
        super(name, age);
    }
}
