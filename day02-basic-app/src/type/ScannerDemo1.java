package type;

import javax.sound.midi.Soundbank;
import java.util.Scanner;

public class ScannerDemo1 {
    public static void main(String[] args) {
        // 1.scanner: 得到一个键盘扫描器对象
        Scanner sc = new Scanner(System.in);

        // 2.开始调用sc的功能来接受用户键盘输入的数据
        System.out.println("请您输入您的年龄:");
        int age = sc.nextInt();// 等待用户输入一个整数，直到用户按下回车键拿到数据
        System.out.println("您的年龄是: "+age);

        System.out.println("请您输入您的名字:");
        String name = sc.next();// 等待用户输入一个String，直到用户按下回车键拿到数据
        System.out.println("您的年龄是: "+name);
    }
}
