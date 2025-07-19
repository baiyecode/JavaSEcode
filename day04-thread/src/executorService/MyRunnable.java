package executorService;

/**
 * ClassName: MyRunnable
 * Package: executorService
 * Description:
 *
 * @Author 白夜
 * @Create 2025/7/19 18:10
 * @Version 1.0
 */
// 1、定义一个线程任务类实现Runnable接口
public class MyRunnable implements Runnable{
    // 2、重写run方法，设置线程任务
    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println(Thread.currentThread().getName() + "输出：" + i);
            try {
                Thread.sleep(Integer.MAX_VALUE);//线程休眠
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

}
