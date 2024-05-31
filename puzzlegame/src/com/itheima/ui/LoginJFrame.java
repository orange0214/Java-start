package com.itheima.ui;

import javax.swing.*;

public class LoginJFrame extends JFrame {

    public LoginJFrame(){
        // 创建登录界面的时候，同时给这个界面设置一些信息
        this.setSize(488, 430);

        // 设置界面的标题
        this.setTitle("拼图 登录");
        // 设置界面置顶
        this.setAlwaysOnTop(true);
        // 设置界面居中
        this.setLocationRelativeTo(null);
        // 设置游戏的关闭模式
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        // 初始化菜单


        // 让界面显示出来
        this.setVisible(true);
    }

}
