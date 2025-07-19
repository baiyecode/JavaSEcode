package create;

/**
 * ClassName: ThreadDemo2_2
 * Package: create
 * Description: 实现Runnable接口来创建线程的简化写法
 *
 * @Author 白夜
 * @Create 2025/7/15 15:50
 * @Version 1.0
 */
public class ThreadDemo2_2 {
    public static void main(String[] args) {
        // 目标：掌握多线程的创建方式二：使用Runnable接口的匿名内部类来创建
        Runnable r = new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 5; i++) {
                    System.out.println("子线程1输出：" + i);
                }
            }
        };
        Thread t1 = new Thread(r); // public Thread(Runnable r)
        t1.start();
        //简化
        new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 5; i++) {
                    System.out.println("子线程2输出：" + i);
                }
            }
        }).start();
        //lambda简化
        new Thread(() -> {
            for (int i = 0; i < 5; i++) {
                System.out.println("子线程3输出：" + i);
            }
        }).start();

        for (int i = 0; i < 5; i++) {
            System.out.println("主线程输出：" + i);
        }

    }

}
