package test4;

public class StudentTest {
    public static void main(String[] args) {

        // 1.创建一个数组用来存储学生对象
        Student[] arr = new Student[3];
        // 2.创建学生对象添加到数组中
        Student stu1 = new Student(1, "zhangsan", 23);
        Student stu2 = new Student(2, "lisi", 24);
        Student stu3 = new Student(3, "wangwu", 25);

        arr[0] = stu1;
        arr[1] = stu2;
        arr[2] = stu3;

        Student stu4 = new Student(4, "zhaoliu", 26);

        // 唯一性判断
        boolean flag = contains(arr, stu4.getId());
        if(flag){
            // 已存在，不用添加
            System.out.println("当前id重复，请修改id后进行添加");
        } else {
            // 不存在，添加进数组
            // 把stu4添加到数组中
            int count = getCount(arr);
            if(count == arr.length){
                // 1.数组已经存满
                // 创建新数组，新数组长度 = 老数组+1
                Student[] newArr = createNewArr(arr);
                // [stu1, stu2, stu3]
                newArr[count] = stu4;
                printArr(newArr);
            }else{
                // 2.数组没有存满，直接添加
                arr[count] = stu4;
                printArr(arr);
            }
        }

        int index = getIndex(arr, 2);
        System.out.println("index: "+index);
        if(index != -1){
            arr[index] = null;
            printArr(arr);
        }else{
            System.out.println("当前id不存在，删除失败");
        }

    }

    public static void printArr(Student[] arr){
        for (int i = 0; i < arr.length; i++) {
            Student stu = arr[i];
            if(stu != null){
                System.out.println(stu.getId()+", "+stu.getName()+", "+ stu.getAge());
            }
        }
    }

    public static Student[] createNewArr(Student[] arr){
        Student[] newArr = new Student[arr.length + 1];
        for (int i = 0; i < arr.length; i++) {
             newArr[i] = arr[i];
        }
        return newArr;
    }

    public static int getCount(Student[] arr){
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] != null){
                count++;
            }
        }
        return count;
    }

    public static boolean contains(Student[] arr, int id){
        for (int i = 0; i < arr.length; i++) {
            Student stu = arr[i];
            if(stu != null){
                int sid = stu.getId();
                if(sid == id){
                    return true;
                }
            }
        }
        return false;
    }

    public static int getIndex(Student[] arr, int id){
        for (int i = 0; i < arr.length; i++) {
            Student stu = arr[i];
            if(stu != null){
                int sid = stu.getId();
                if(sid == id){
                    return i;
                }
            }
        }
        return -1;
    }
}
