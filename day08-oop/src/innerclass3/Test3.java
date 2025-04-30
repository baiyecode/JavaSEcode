package innerclass3;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * ClassName: Test3
 * Package: innerclass3
 * Description: 匿名内部类的使用场景
 *
 * @Author 白夜
 * @Create 2025/4/26 15:58
 * @Version 1.0
 */
public class Test3 {
    public static void main(String[] args) {
        //匿名内部类的使用场景
        // 需求:创建一个登录窗口，窗口上只有一个登录按钮
        JFrame jf = new JFrame("登录窗口");
        jf.setSize(400, 300);//设置窗口大小
        jf.setLocationRelativeTo(null);//设置窗口居中
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//设置窗口关闭方式


        JPanel jPanel = new JPanel();//创建面板
        jf.add(jPanel);//将面板添加到窗口中

        JButton jb = new JButton("登录");//创建登录按钮
        jPanel.add(jb);//将登录按钮添加到面板中

        //java要求必须给这个按钮添加一个点击事件监听器对象，这样就可以监听用户的点击操作，就可以做出反应。
        //jb.addActionListener(new clickListener());
        //匿名内部类
        //开发中不是我们要主动去写医名内部类，而是用别人的功能的时候，别人可以让我们写一个匿名内部类吗，我们才会写!
        jb.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("登录成功");
            }
        });
        //匿名内部类也是为了简化代码
        //jb.addActionListener(e -> System.out.println("登录成功"));



        jf.setVisible(true);//设置窗口可见
    }

}


//class clickListener implements ActionListener {
//    @Override
//    public void actionPerformed(ActionEvent e) {
//        System.out.println("登录成功");
//    }
//}
