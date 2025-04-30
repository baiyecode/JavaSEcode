package gui;

import javax.swing.*;
import java.awt.*;

/**
 * ClassName: BorderLayoutDemo
 * Package: gui
 * Description: 方向布局管理器BorderLayout
 *
 * @Author 白夜
 * @Create 2025/4/30 20:28
 * @Version 1.0
 */
public class BorderLayoutDemo {
    public static void main(String[] args) {
        JFrame jf = new JFrame("BorderLayout边界布局管理器");
        jf.setSize(400, 300);
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        jf.setLayout(new BorderLayout());
        jf.add(new JButton("North"), BorderLayout.NORTH);
        jf.add(new JButton("South"), BorderLayout.SOUTH);
        jf.add(new JButton("East"), BorderLayout.EAST);
        jf.add(new JButton("West"), BorderLayout.WEST);
        jf.add(new JButton("Center"), BorderLayout.CENTER);

        jf.setVisible(true);
    }
}
