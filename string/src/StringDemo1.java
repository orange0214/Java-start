public class StringDemo1 {
    public static void main(String[] args) {
        String s1 = "abc";
        System.out.println(s1);

        String s2 = new String();
        System.out.println("@"+s2+"!");

        // 传递字符串，根据传递的字符串内容创建新的字符串对象
        String s3 = new String("abc");

        // 传递字符数组，根据字符数组的内容创建新的字符串对象
        char[] chs = {'a', 'b', 'c'};
        String s4 = new String(chs);
        System.out.println(s4);
    }
}
