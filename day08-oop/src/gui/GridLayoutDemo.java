package gui;

import javax.swing.*;
import java.awt.*;

/**
 * ClassName: GridLayoutDemo
 * Package: gui
 * Description: 网格布局管理器GridLayout
 *
 * @Author 白夜
 * @Create 2025/4/30 20:32
 * @Version 1.0
 */
public class GridLayoutDemo {
    public static void main(String[] args) {
        //创建一个窗口
        JFrame jf = new JFrame("GridLayout网格布局管理器");
        //设置窗口大小
        jf.setSize(400, 300);
        //设置窗口关闭
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        jf.setLayout(new GridLayout(3, 2));

        for (int i = 1; i <= 6; i++) {
            JButton jb = new JButton("按钮" + i);
            jf.add(jb);
        }
        jf.setVisible(true);

    }
}
