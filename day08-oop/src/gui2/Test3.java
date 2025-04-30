package gui2;

/**
 * ClassName: Test3
 * Package: gui2
 * Description: 自定义窗口，让窗口对象实现事件接口
 *
 * @Author 白夜
 * @Create 2025/4/30 21:24
 * @Version 1.0
 */
public class Test3 {
    public static void main(String[] args) {
        // 目标:自定义一个登录界面，让界面对象本身也是事件监听器对象
        LoginFrame jf = new LoginFrame();
        jf.setVisible(true);
    }
}
