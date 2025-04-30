package gui;

import javax.swing.*;
import java.awt.*;

/**
 * ClassName: FlowLayoutDemo
 * Package: gui
 * Description: 流式布局管理器FlowLayout
 *
 * @Author 白夜
 * @Create 2025/4/30 20:13
 * @Version 1.0
 */
public class FlowLayoutDemo {
    public static void main(String[] args){
        JFrame  jf = new JFrame("FlowLayout流式布局管理器");
        jf.setSize(400,300);
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        jf.setLayout(new FlowLayout());//设置流式布局

        for (int i = 0; i < 5; i++) { // 循环添加按钮
            JButton jb = new JButton("Button"+i);
            jf.add(jb);
        }
        jf.setVisible(true);


    }
}
