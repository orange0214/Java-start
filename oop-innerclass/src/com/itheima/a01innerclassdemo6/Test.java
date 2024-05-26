package com.itheima.a01innerclassdemo6;

public class Test {
    public static void main(String[] args) {

        // 匿名内部类
        new Swim(){
            @Override
            public void swim(){
                System.out.println("重写了游泳方法");
            }
        };

        // 接口多态
        Animal a = new Animal(){
            @Override
            public void eat(){
                System.out.println("重写了eat方法");
            }
        };

        new Animal(){
            @Override
            public void eat(){
                System.out.println("重写了eat方法");
            }
        }.eat();

//        a.eat();

//        method(
//                new Animal(){
//                    @Override
//                    public void eat(){
//                        System.out.println("狗吃骨头");
//                    }
//                }
//        );

    }
//
//    public static void method(Animal a){
//        a.eat();
//    }
}
