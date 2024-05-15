package com.itheima.a03staticdemo3;

import java.util.ArrayList;

public class StudentUtil {

    private StudentUtil() {}

    public static int getMaxAgeStudent(ArrayList<Student> list){
        // 1.定义一个参照物
        int max = list.get(0).getAge();
        // 2.
        for (int i = 1; i < list.size(); i++) {
            int temp = list.get(i).getAge();
            if (temp >   max){
                max = temp;
            }
        }
        return max;
    }

}
