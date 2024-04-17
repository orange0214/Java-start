package type;

public class OperatorDemo1 {
    public static void main(String[] args){
        // 目标: 掌握三元运算符的基本使用
        double score = 98.5;
        String rs = score >= 60 ? "成绩及格" : "成绩不及格";
        System.out.println(rs);

        // 目标: 找出2个整数中的较大值，并输出
        int a = 99;
        int b = 67;
        int result = a>b ? a:b;
        System.out.println(result);

        // 目标: 找出3个整数中的较大值，并输出
        int i = 10;
        int j = 45;
        int k = 34;
        int temp = i>j ? i:j;
        int max = k > temp ? k:temp;
        System.out.println(max);
    }
}
