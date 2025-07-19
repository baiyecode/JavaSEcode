package threadapi;

/**
 * ClassName: ThreadApiDemo1
 * Package: threadapi
 * Description: Thread的常用方法
 *
 * @Author 白夜
 * @Create 2025/7/18 15:03
 * @Version 1.0
 */
public class ThreadApiDemo1 {
    public static void main(String[] args) {
        // 目标：搞清楚线程的常用方法。
        Thread t1 = new MyThread("1号线程");
        // t1.setName("1号线程");
        t1.start();
        System.out.println(t1.getName()); // 线程默认名称是：Thread-索引

        Thread t2 = new MyThread("2号线程");
        // t2.setName("2号线程");
        t2.start();
        System.out.println(t2.getName()); // 线程默认名称是：Thread-索引

        // 哪个线程调用这个代码，这个代码就拿到哪个线程
        Thread m = Thread.currentThread(); // 主线程
        m.setName("主线程");
        System.out.println(m.getName()); // main

        //封装Runnable对象成为线程对象，并指定线程名称
        //Thread t1 = new Thread(r, "1号子线程"); // public Thread(Runnable r,String name)
    }
}

// 1、定义一个子类继承Thread类，成为一个线程类。
class MyThread extends Thread {
    public MyThread(String name) {
        super(name); // public Thread(String name)
    }

    // 2、重写Thread类的run方法
    @Override
    public void run() {
        // 3、在run方法中编写线程的任务代码（线程要干的活儿）
        for (int i = 0; i < 5; i++) {
            System.out.println(Thread.currentThread().getName() +"子线程输出：" + i);
        }
    }

}
