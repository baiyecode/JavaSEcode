package threadapi;

/**
 * ClassName: ThreadApiDemo2
 * Package: threadapi
 * Description: sleep()方法
 *
 * @Author 白夜
 * @Create 2025/7/18 15:16
 * @Version 1.0
 */
public class ThreadApiDemo2 {
    public static void main(String[] args) {
        // 目标：搞清楚Thread类的Sleep方法（线程休眠）
        for (int i = 1; i <= 10; i++) {
            System.out.println(i);
            try {
                // 让当前执行的线程进入休眠状态，直到时间到了，才会继续执行。
                // 项目经理让我加上这行代码，如果用户交钱了，我就注释掉。
                Thread.sleep(1000); // 1000ms = 1s
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

    }
}
