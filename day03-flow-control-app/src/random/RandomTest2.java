package random;

import java.util.Random;
import java.util.Scanner;

public class RandomTest2 {
    public static void main(String[] args) {
        // 随机产生一个1-100随机数
        Random r = new Random();
        int data = r.nextInt(100) + 1;

        Scanner sc = new Scanner(System.in);
        // 定义一个死循环持续猜测数据
        while (true) {
            System.out.println("输入您猜测的数据");
            int guessNumber = sc.nextInt();

            if (guessNumber > data){
                System.out.println("您猜测的数字过大");
            } else if (guessNumber < data) {
                System.out.println("您猜测的数字过小");
            } else {
                System.out.println("猜测成功");
                break;
            }
        }
    }
}
