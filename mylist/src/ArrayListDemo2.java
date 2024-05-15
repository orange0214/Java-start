import java.util.ArrayList;

public class ArrayListDemo2 {
    public static void main(String[] args) {
        ArrayList<String> list= new ArrayList<>();

        boolean result = list.add("aaa");
        list.add("bbb");
        list.add("ccc");
//        System.out.println(result);
        System.out.println(list);

        // 删除元素
//        boolean removeResult = list.remove("Aaa");
//        String str = list.remove(0);

        // 修改元素
        String setResult = list.set(1, "ddd");

        System.out.println(setResult);
        System.out.println(list);

        // 查询元素
        String s = list.get(0);
        System.out.println(s);

        for (int i = 0; i < list.size(); i++) {
            String str = list.get(i);
            System.out.println(str);
        }
    }
}
