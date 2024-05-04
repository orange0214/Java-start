public class switchDemo2 {

    public static void main(String[] args) {
        String week = "周三";

        // switch适合值匹配
        switch(week){
            case "周一":
                System.out.println("埋头苦干，解决bug");
                break;
            case "周二":
                System.out.println("解决bug");
                break;
            default:
                System.out.println("您输入的信息不存在");
        }
    }
}
