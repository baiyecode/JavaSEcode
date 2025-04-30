package gui2;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * ClassName: LoginFrame
 * Package: gui2
 * Description:
 *
 * @Author 白夜
 * @Create 2025/4/30 21:25
 * @Version 1.0
 */
public class LoginFrame extends JFrame implements ActionListener {
    //自定义一个登录界面，让界面对象本身也是事件监听器对象
    public LoginFrame() {
        //也可以是this.setTitle("登录界面");没冲突this可以省略，
        setTitle("登录界面");
        setSize(400, 300);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        init(); // 初始化窗口组件
    }

    private void init() {
        JPanel jp = new JPanel();
        add(jp);
        // 添加登录按钮
        JButton jb = new JButton("登录");
        jp.add(jb);
        jb.addActionListener(this);//添加点击监听器
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        JOptionPane.showMessageDialog(this, "登录成功");

    }
}
