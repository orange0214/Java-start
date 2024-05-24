package com.itheima.test;

public class Test {
    public static void main(String[] args) {

    }

}

class Fu{
    public void show(){
        System.out.println("父类的show方法");
    }
}

class Zi extends Fu{
    @Override
    public void show(){
        System.out.println("子类的show方法");
    }
}
