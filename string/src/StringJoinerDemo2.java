import java.util.StringJoiner;

public class StringJoinerDemo2 {
    public static void main(String[] args) {
        // 1.创建对象
        StringJoiner sj = new StringJoiner(",","[","]");
        // 2.添加元素
        sj.add("aaa").add("bbb").add("ccc");
        // 3.打印
        System.out.println(sj);
        // 4.变成字符串
        String str = sj.toString();
        System.out.println(str);
    }
}
