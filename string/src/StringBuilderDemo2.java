import java.util.Scanner;

public class StringBuilderDemo2 {
    public static void main(String[] args) {
        // 链式编程
        int len = getString().substring(1).replace("A", "Q").length();
        System.out.println(len);
    }

    public static String getString(){
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个字符串");
        String str = sc.next();
        return str;
    }

}

