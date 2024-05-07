package com.itheima;

import java.sql.SQLOutput;
import java.util.Random;
import java.util.Scanner;

public class Test6 {
    public static void main(String[] args) {
        // 完成双色球系统的开发
        int[] numbers = userSelectNumbers();
        printArray(numbers);

        int[] luckNumbers = createLuckNumbers();
        printArray(luckNumbers);

        judge(numbers, luckNumbers);

    }

    // 设计一个方法，用于判断用户中奖情况
    public static void judge(int[] userNumbers, int[] luckNumbers){
        int redCount = 0;
        int blueCount = 0;

        // 遍历用户投注号码的前6个红球
        for (int i = 0; i < userNumbers.length-1; i++) {
            for (int j=0; j < luckNumbers.length-1; j++){
                if (userNumbers[i] == luckNumbers[j]){
                    redCount++;
                    break;
                }
            }
        }

        blueCount = userNumbers[6] == luckNumbers[6] ? 1:0;
        System.out.println("您命中的红球数量是:"+redCount);
        System.out.println("您命中的蓝球数量是:"+blueCount);

        if (redCount == 6 && blueCount == 1){
            System.out.println("1000w");
        } else if (redCount == 6 && blueCount == 0) {
            System.out.println("500w");
        } else if (redCount == 5 && blueCount == 1) {
            System.out.println("3000");
        } else if (redCount == 5 && blueCount == 0 || redCount == 4 && blueCount == 1){
            System.out.println("200");
        } else if (redCount == 4 && blueCount == 0 || redCount == 3 && blueCount == 1){
            System.out.println("10");
        } else if (redCount == 3 && blueCount == 1) {
            System.out.println("5");
        } else {
            System.out.println("感谢您为福利事业做出的巨大贡献~~~");
        }

    }

    public static void printArray(int[] arr) {
        System.out.print("[");
        for(int i=0; i<arr.length; i++){
            System.out.print(i==arr.length-1?arr[i]:arr[i]+",");
        }
        System.out.println("]");
    }

    public static int[] createLuckNumbers(){
        int[] numbers = new int[7];
        Random r = new Random();
        for (int i=0; i<numbers.length-1; i++) {
            while(true){
                int number = r.nextInt(33)+1;
                if(!exist(numbers, number)){
                    numbers[i] = number;
                    break;
                }
            }
        }
        numbers[6] = r.nextInt(16)+1;

        return numbers;
    }

//    1.设计一个方法，让用户投注一组号码并返回（前6个为红球，最后一个为蓝球）
    public static int[] userSelectNumbers(){
        // 2.创建一个整型数组，用于存储用户投注的7个号码
        int[] numbers = new int[7];
        // numbers = [0,0,0,0,0,0,0]

        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < numbers.length-1; i++) {
            while(true){
                // i = 0 1 2 3 4 5
                System.out.println("请您输入第" + (i+1)+"个红球号码 (1-33之间，不能重复)");
                int number = sc.nextInt();

                // 先判断用户输入的红球号码是否在1-33之间
                if (number < 1 || number > 33){
                    System.out.println("对不起，您输入的红球号码不在1-33之间，请确认");
                } else {
                    if(exist(numbers, number)){
                        System.out.println("对不起，您当前输入的红球号码与之前的输入重复，请确认");
                    } else {
                        // number符合条件，可以使用
                        numbers[i] = number;
                        break;
                    }
                }
            }
        }
        while(true){
            System.out.println("请您输入最后一个蓝球号码(1-16)");
            int number = sc.nextInt();
            if(number < 1 || number > 16){
                System.out.println("对不起，您输入的蓝球号码不对！");
            }else{
                numbers[6] = number;
                break;
            }
        }

        return numbers;
    }

    private static Boolean exist(int[] numbers, int number) {
        for (int i = 0; i < numbers.length; i++) {
            if(number == numbers[i]){
                return true;
            }
        }
        return false;
    }

}
