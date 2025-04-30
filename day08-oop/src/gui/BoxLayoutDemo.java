package gui;

import javax.swing.*;

/**
 * ClassName: BoxLayoutDemo
 * Package: gui
 * Description:轴线布局管理器BoxLayout
 *
 * @Author 白夜
 * @Create 2025/4/30 20:38
 * @Version 1.0
 */
public class BoxLayoutDemo {
    public static void main(String[] args) {
        JFrame jf = new JFrame("BoxLayout布局管理器");
        jf.setSize(400,300);
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel  jp = new JPanel();
        jp.setLayout(new BoxLayout(jp,BoxLayout.Y_AXIS));//设置Y轴方向
        jp.add(new JButton("按钮1"));
        jp.add(Box.createVerticalStrut(20));//添加垂直间隔
        jp.add(new JButton("按钮2"));
        jp.add(Box.createVerticalStrut(20));
        jp.add(new JButton("按钮3"));
        jp.add(Box.createVerticalStrut(20));
        jp.add(new JButton("按钮4"));

        jf.add(jp);

        jf.setVisible(true);


    }
}
