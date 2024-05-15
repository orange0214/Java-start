public class StringBuilderDemo1 {
    public static void main(String[] args) {
        // 1.创建对象
        StringBuilder sb = new StringBuilder("abc");

        // 2.添加元素
        sb.append(1);
        sb.append(2.3);
        sb.append(true);

        // 3.反转
        sb.reverse();

        // 4.获取长度
        int length  = sb.length();

        // 5.将StringBuilder变回字符串
        String str = sb.toString();


        // 2.打印
        System.out.println(str);

    }
}
