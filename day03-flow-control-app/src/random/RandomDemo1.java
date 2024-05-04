package random;

import java.util.Random;

public class RandomDemo1 {
    public static void main(String[] args) {
        // 使用Random生成随机数
        Random r = new Random();
        for (int i = 1; i <= 20; i++) {
            int data = r.nextInt(10);
            System.out.println(data);
        }

        System.out.println("---------------------------");

        // 生成1-10之间的随机数
        for (int i = 1; i <= 20; i++) {
            int data2 = r.nextInt(10)+1;
            System.out.println(data2);
        }
    }
}
