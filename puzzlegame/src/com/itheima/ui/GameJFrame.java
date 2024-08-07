package com.itheima.ui;

import javax.swing.*;
import java.util.Random;

public class GameJFrame extends JFrame {

    // 创建一个二维数组
    int[][] data = new int[4][4];

    public GameJFrame(){
        // 初始化界面
        initJFrame();

        // 初始化菜单
        initJMenuBar();

        // 初始化数据
        initData();

        // 初始化图片
        initImage();

        // 让界面显示出来
        this.setVisible(true);
    }

    private void initImage() {
        for (int j = 0; j < 4; j++) {
            for (int i = 0; i < 4; i++) {
                // 创建一个图片ImageIcon的对象
                // 创建一个JLabel的对象
                JLabel jLabel = new JLabel(new ImageIcon("D:\\Desktop\\BlackHorseUniversity\\Java-start\\puzzlegame\\image\\animal\\animal3\\"+data[i][j]+".jpg"));
                // 指定图片位置
                jLabel.setBounds(105 * i, 105 * j, 105, 105);
                // 把管理容器添加到界面中
                // this.add(jLabel);
                this.getContentPane().add(jLabel);
            }
        }
    }

    // 初始化数据
    private void initData() {
        // 把一个一维数组中的数据 0~15打乱顺序
        // 再按照4个一组的方式添加到二维数组中
        int[] tempArr = {0,1,2,3,4,5,6,7,8,9,10,11,12,13,14,15};
        Random r = new Random();
        for (int i=0; i<tempArr.length; i++) {
            int index = r.nextInt(tempArr.length);
            int temp = tempArr[i];
            tempArr[i] = tempArr[index];
            tempArr[index] = temp;
        }
        //  给二维数组添加数据
        int index = 0;
        for (int i = 0; i < 4; i ++){
            for (int j = 0; j < 4; j++) {
                data[i][j] = tempArr[index];
                index++;
            }
        }
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
        // 取消默认居中放置，按照X,Y轴的方式添加组件
        this.setLayout(null);
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
