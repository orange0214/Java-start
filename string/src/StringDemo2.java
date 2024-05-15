import java.util.Scanner;

public class StringDemo2 {
    public static void main(String[] args) {
        String userName = "root";
        String passWord = "password";

        for (int i = 0; i < 3; i++) {
            Scanner sc = new Scanner(System.in);
            System.out.println("请输入用户名: ");
            String inputUsername = sc.next();
            System.out.println("请输入密码");
            String inputPassword = sc.next();

            if(userName.equals(inputUsername) && passWord.equals(inputPassword)){
                System.out.println("用户登录成功");
            }else{
                System.out.println("用户登录失败, 您还剩下"+(2-i)+"次机会");
            }
        }
    }
}
