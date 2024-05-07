package com.itheima;

import java.util.Random;

public class Test2 {
    public static void main(String[] args) {
        String code = createCode(5);
        System.out.println(code);
    }

    public static String createCode(int n){
        Random r = new Random();
        String code = "";
        for (int i=1; i <= n; i++){
            // i = 1 2 3 4 5
            int type = r.nextInt(3);
            switch (type) {
                case 0:
                    // 随机一个数字字符
                    code += r.nextInt(10);
                    break;
                case 1:
                    // 随机一个大写字符 A 65 Z 65+25
                    char ch1 = (char) (r.nextInt(26)+65);
                    code += ch1;
                    break;
                case 2:
                    // 随机一个小写字符 a 97 z 97+25
                    char ch2 = (char) (r.nextInt(26)+97);
                    code += ch2;
                    break;
            }
        }
        return code;
    }
}
