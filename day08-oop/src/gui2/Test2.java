package gui2;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * ClassName: Test2
 * Package: gui2
 * Description: 事件的几种常见写法
 * @Author 白夜
 * @Create 2025/4/30 21:17
 * @Version 1.0
 */
public class Test2 {
    public static void main(String[] args) {
        //1、创建一个窗口，有一个登录按钮。
        JFrame jf = new JFrame("登录窗口");//创建窗口
        jf.setSize(400, 300);//设置窗口大小
        jf.setLocationRelativeTo(null);//设置窗口居中
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//设置窗口关闭方式

        JPanel jPanel = new JPanel();//创建面板
        jf.add(jPanel);//将面板添加到窗口中

        JButton jb = new JButton("登录");//创建登录按钮
        jPanel.add(jb);//将登录按钮添加到面板中

        jb.addActionListener(new MyActionListener(jf));

        jf.setVisible(true);//显示窗口
    }
}


 // 事件处理实现类
class MyActionListener implements ActionListener {
    private JFrame jf;
    public MyActionListener(JFrame jf) {
        this.jf = jf;
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        JOptionPane.showMessageDialog(jf, "登录成功");
    }
}
