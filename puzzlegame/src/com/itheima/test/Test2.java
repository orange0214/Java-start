package com.itheima.test;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Test2 {
    public static void main(String[] args) {
        JFrame jFrame = new JFrame();

        jFrame.setSize(603, 680);
        // 设置界面的标题
        jFrame.setTitle("拼图单机版 v1.0");
        // 设置界面置顶
        jFrame.setAlwaysOnTop(true);
        // 设置界面居中
        jFrame.setLocationRelativeTo(null);
        // 设置游戏的关闭模式
        jFrame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        // 取消默认居中放置，按照X,Y轴的方式添加组件
        jFrame.setLayout(null);

        JButton jtb = new JButton("点我啊");
        jtb.setBounds(0,0,100,50);
        // jtb:组件对象, 表示要给哪个组件添加事件
        // addActionListener: 表示我要给组件的哪个事件监听
        // jtb.addActionListener(new MyActionListener());

        jtb.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("我被点击了。");
            }
        });

        jFrame.getContentPane().add(jtb);

        jFrame.setVisible(true);
    }
}
