package gui2;

import javax.swing.*;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

/**
 * ClassName: Test
 * Package: gui2
 * Description: 事件处理
 *
 * @Author 白夜
 * @Create 2025/4/30 20:47
 * @Version 1.0
 */
public class Test {
    public static void main(String[] args){
        //GUI的事件处理机制
        //1、创建一个窗口，有一个登录按钮。
        JFrame jf = new JFrame("登录窗口"); //创建窗口
        jf.setSize(400, 300);//设置窗口大小
        jf.setLocationRelativeTo(null);//设置窗口居中
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//设置窗口关闭方式

        JPanel jPanel = new JPanel();//创建面板
        jf.add(jPanel);//将面板添加到窗口中

        JButton jb = new JButton("登录");//创建登录按钮
        jPanel.add(jb);//将登录按钮添加到面板中

        //给按钮绑定点击事件监听器对象
        //ActionListener 点击事件监听器
        //e 是 事件对象，用来获取事件相关信息
        jb.addActionListener(e -> {
            //System.out.println("登录成功");
            JOptionPane.showMessageDialog(jf, "登录成功");//弹出对话框
            jf.requestFocus();//让窗口获取焦点
        });



        //需求:监听用户键盘上下左右四个按键的事件。
        //给jf窗口整体绑定按健事件。
        jf.addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent e) {
                //获取用户按下的键的编码
                int keyCode = e.getKeyCode();
                //判断用户按的键是
                switch (keyCode){
                    case KeyEvent.VK_UP:
                        System.out.println("向上");
                        break;
                    case KeyEvent.VK_DOWN:
                        System.out.println("向下");
                        break;
                    case KeyEvent.VK_LEFT:
                        System.out.println("向左");
                        break;
                    case KeyEvent.VK_RIGHT:
                        System.out.println("向右");
                        break;
                }
            }
        });

        jf.setVisible(true);//显示窗口
        //设置组件是否可以获得焦点。这是一个属性配置，决定了组件是否具备接收焦点的资格。
        //顶层容器（如JFrame、JWindow）默认不可聚焦（setFocusable(false)）。
        //大多数交互组件（如JButton、JTextField）默认可聚焦。
        jf.setFocusable(true);

        //让窗口可以响应键盘事件，成为焦点窗口
        jf.requestFocus(); //主动触发组件立即获取焦点,组件必须已可见且可聚焦也就是在setVisible(true)之后调用

    }

}
