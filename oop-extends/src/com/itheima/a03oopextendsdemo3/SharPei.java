package com.itheima.a03oopextendsdemo3;

public class SharPei extends Dog{

    // 因为沙皮狗吃的是狗粮和骨头
    // 父类中方法不能满足需求，需要进行重写

    @Override
    public void eat() {
        super.eat();
        System.out.println("狗啃骨头");
    }
}
