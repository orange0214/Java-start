package com.itheima.a01innerclassdemo2;

public class Outer {
    String name;

    private class Inner{
        static int a = 10;
    }

    public Inner getInstance(){
        return new Inner();
    }

}
