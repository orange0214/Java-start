package com.itheima.ui;

import javax.swing.*;

public class GameJFrame extends JFrame {

    public GameJFrame(){
        // 初始化界面
        initJFrame();

        // 初始化菜单
        initJMenuBar();

        // 初始化图片
        initImage();

        // 让界面显示出来
        this.setVisible(true);
    }

    private void initImage() {
        
    }

    private void initJFrame(){
        // 设置界面的宽高
        this.setSize(603, 680);
        // 设置界面的标题
        this.setTitle("拼图单机版 v1.0");
        // 设置界面置顶
        this.setAlwaysOnTop(true);
        // 设置界面居中
        this.setLocationRelativeTo(null);
        // 设置游戏的关闭模式
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }

    private void initJMenuBar(){
        // 初始化菜单
        // 创建整个菜单对象
        JMenuBar jMenuBar = new JMenuBar();

        // 创建菜单上面两个选项的对象 (功能 关于我们)
        JMenu functionJMenu = new JMenu("功能");
        JMenu aboutJMenu = new JMenu("关于我们");

        // 创建选项下面的条目对象
        JMenuItem replayItem = new JMenuItem("重新游戏");
        JMenuItem reLoginItem = new JMenuItem("重新登录");
        JMenuItem closeItem = new JMenuItem("关门游戏");
        JMenuItem accountItem = new JMenuItem("公众号");

        // 将每一个选项下面的条目添加到选项当中
        functionJMenu.add(replayItem);
        functionJMenu.add(reLoginItem);
        functionJMenu.add(closeItem);

        aboutJMenu.add(accountItem);

        // 将菜单内的两个功能添加到整个Bar中
        jMenuBar.add(functionJMenu);
        jMenuBar.add(aboutJMenu);

        // 给整个界面设置菜单
        this.setJMenuBar(jMenuBar);
    }

}
