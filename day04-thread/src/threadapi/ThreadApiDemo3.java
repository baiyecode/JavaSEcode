package threadapi;

/**
 * ClassName: ThreadApiDemo3
 * Package: threadapi
 * Description: join()方法
 *
 * @Author 白夜
 * @Create 2025/7/18 15:19
 * @Version 1.0
 */
public class ThreadApiDemo3 {
    public static void main(String[] args) {
        // 目标：搞清楚线程的join方法：线程插队：让调用这个方法线程先执行完毕。
        MyThread2 t1 = new MyThread2();
        t1.start();

        for (int i = 1; i <= 5; i++) {
            System.out.println(Thread.currentThread().getName() +"线程输出：" + i);
            if(i == 1){
                try {
                    t1.join(); // 插队 让t1线程先执行完毕，然后继续执行主线程
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }
    }
}

class MyThread2 extends Thread {
    @Override
    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println(Thread.currentThread().getName() +"子线程输出：" + i);
        }
    }

}
