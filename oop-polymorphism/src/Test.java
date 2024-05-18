public class Test {
    public static void main(String[] args) {
        Student s = new Student("zhangsan", 18);
        Teacher t = new Teacher("wangjianguo", 40);
        Administrator a = new Administrator("Administrator", 35);

        register(s);
        register(t);
        register(a);
    }

    // 这个方法能接受老师，学生，管理员
    public static void register(Person p){
        p.show();
    }


}
