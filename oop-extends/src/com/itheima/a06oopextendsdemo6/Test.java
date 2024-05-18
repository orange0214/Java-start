package com.itheima.a06oopextendsdemo6;

public class Test {
    public static void main(String[] args) {
        Manager m = new Manager("hiema001", "张三", 15000, 8000);
        System.out.println(m.getId()+", "+m.getName()+", "+m.getSalary() +", "+m.getBonus());
        m.work();
        m.eat();

        Cook c = new Cook("hiema002", "李四", 8000);
        System.out.println(c.getId()+", "+c.getName()+", "+c.getSalary());
        c.work();
        c.eat();

    }
}
