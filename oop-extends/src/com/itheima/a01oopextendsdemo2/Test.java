package com.itheima.a01oopextendsdemo2;

public class Test {
    public static void main(String[] args) {
        OverseaStudent stu = new OverseaStudent();
        stu.lunch();

    }
}

class Person {
    public void eat(){
        System.out.println("吃米饭，吃菜");
    }

    public void drink() {
        System.out.println("喝开水");
    }
}

class OverseaStudent extends Person{
    public void lunch(){
        this.eat();
        this.drink();

        super.eat();
        super.drink();
    }

    // 应用场景: 父类方法不能满足子类需求，需要将方法重写
    // 子类中重写的方法需要加上@Override
    @Override
    public void eat(){
        System.out.println("吃意大利面");
    }

    @Override
    public void drink(){
        System.out.println("喝凉水");
    }
}
