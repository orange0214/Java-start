package com.itheima.a01innerclassdemo3;

public class Outer {
    private int a = 10;

    class Inner {
        private int a = 20;

        public void show(){
            int a = 30;
            // 方法中的a
            System.out.println(a);
            // 成员变量a
            System.out.println(this.a);
            // Outer类中成员变量a
            System.out.println(Outer.this.a);
        }
    }
}