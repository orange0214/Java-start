package com.itheima.a01innerclassdemo1;

public class Car {
    private String carName;
    private int carAge;
    private String carColor;

    public void show(){
        System.out.println(carName);
    }

    class Engine{
        String engineName;
        int engineAge;

        public void show(){
            System.out.println(engineName);
            System.out.println(carName);
        }
    }
}
