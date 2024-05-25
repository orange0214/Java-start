package com.itheima.a01Interface.Demo7;
public interface InterA {

    public static void show1(){
        System.out.println("show1方法开始执行了");
        log();
    }

    public static void show2(){
        System.out.println("show2方法开始执行了");
        log();
    }

    // 静态的私有方法，给默认方法服务
    private static void log(){
        System.out.println("记录代码执行的细节");
    }

    // 普通的私有方法，给私有方法服务
    private void log1(){
        System.out.println("记录代码执行的细节");
    }

}
