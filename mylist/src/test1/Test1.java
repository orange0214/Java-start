package test1;

import java.util.ArrayList;

public class Test1 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("aaa");
        list.add("bbb");
        list.add("ccc");

        System.out.print("[");
        for (int i = 0; i < list.size(); i++) {
            String s = list.get(i);
            if (i == list.size()-1){
                System.out.print(s);
                break;
            }
            System.out.print(s + ", ");
        }
        System.out.print("]");
    }

}
