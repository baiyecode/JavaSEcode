package gui;

import javax.swing.*;

/**
 * ClassName: JFrameDemo1
 * Package: gui
 * Description: GUI编程
 *
 * @Author 白夜
 * @Create 2025/4/30 20:06
 * @Version 1.0
 */
public class JFrameDemo1 {
    public static void main(String[] args) {
            // 目标:块速入门一下GUI Swing的编程。
            //1、创建一个窗口，有一个登录按钮。
            JFrame jf = new JFrame("登录窗口");//创建窗口
            jf.setSize(400, 300);//设置窗口大小
            jf.setLocationRelativeTo(null);//设置窗口居中
            jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//设置窗口关闭方式

            JPanel jPanel = new JPanel();//创建面板
            jf.add(jPanel);//将面板添加到窗口中

            JButton jb = new JButton("登录");//创建登录按钮
            jPanel.add(jb);//将登录按钮添加到面板中

            jb.addActionListener(e -> {
                System.out.println("登录成功");
            });//添加点击监听器

            jf.setVisible(true);//显示窗口


    }
}
