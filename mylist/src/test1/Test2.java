package test1;

import java.util.ArrayList;

public class Test2 {
    public static void main(String[] args) {
        // 1.创建集合
        ArrayList<Integer> list = new ArrayList<>();

        list.add(1);
        list.add(2);
        list.add(3);

        System.out.print("[");
        for (int i = 0; i < list.size(); i++) {
            Integer s = list.get(i);
            if (i == list.size()-1){
                System.out.print(s);
                break;
            }
            System.out.print(s + ", ");
        }
        System.out.print("]");
    }
}