package com.itheima.a01Interface.Demo4;

public class Test {
    public static void main(String[] args) {
        // 创建运动员或者教练的对象
        PingPangSporter pps = new PingPangSporter("刘诗雯", 20);
        PingPangCoach ppc = new PingPangCoach("刘国梁", 50);
        pps.study();
        pps.speakEnglish();
        ppc.teach();
        ppc.speakEnglish();

    }
}
