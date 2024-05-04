public class switchDemo3 {
    public static void main(String[] args) {
        String week = "周三";

        switch (week) {
            case "周一":
                System.out.println("埋头苦干，解决bug");
                break;
            case "周二":
            case "周三":
            case "周四":
                System.out.println("请程序员帮忙");
                break;
            case "周五":
                System.out.println("整理代码");
        }
    }
}
