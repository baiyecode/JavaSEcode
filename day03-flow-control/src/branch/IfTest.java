package branch;

/**
 * ClassName: IfTest
 * Package: branch
 * Description:if练习
 *
 * @Author 白夜
 * @Create 2025/4/2 20:34
 * @Version 1.0
 */
public class IfTest {
    public static void main(String[] args) {
        main1();

    }
    //自动驾驶汽车过红绿灯
    //假设你正在开发一个自动驾驶汽车项目，该程序如何实现汽车安全通过这个路口?
    public static void main1() {
        boolean Green = false;
        boolean Red = true;
        boolean Yellow = false;
        if (Green) {
            System.out.println("绿灯亮，汽车通过路口");
        } else if (Red) {
            System.out.println("红灯亮，汽车停止");
        } else if (Yellow) {
            System.out.println("黄灯亮，汽车准备");
        } else {
            System.out.println("未知状态");
        }


    }
}
