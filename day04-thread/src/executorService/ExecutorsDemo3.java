package executorService;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

/**
 * ClassName: ExecutorsDemo3
 * Package: executorService
 * Description: 通过Executors工具类创建线程池
 *
 * @Author 白夜
 * @Create 2025/7/19 21:39
 * @Version 1.0
 */
public class ExecutorsDemo3 {
    public static void main(String[] args) {
        // 目标：通过线程池工具类：Executors，调用其静态方法直接得到线程池
        //创建固定线程数量的线程池，没有临时线程，如果某个线程因为执行异常而结束，那么线程池会补充一个新线程替代它。
        ExecutorService pool = Executors.newFixedThreadPool(3);
        //线程数量随着任务增加而增加，如果线程任务执行完毕且空闲了60s则会被回收掉。
        //ExecutorService pool2 = Executors.newCachedThreadPool();
        //创建只有一个单线程的线程池，保证任务按照顺序执行，如果某个线程因为执行异常而结束，那么线程池会补充一个新线程替代它。
        //ExecutorService pool3 = Executors.newSingleThreadExecutor();
        //创建一个线程池，可以实现在给定的延迟后运行任务，或者定期执行任务。
        //ExecutorService pool4 = Executors.newScheduledThreadPool(3);

        Future<String> f1 = pool.submit(new MyCallable(100));
        Future<String> f2 = pool.submit(new MyCallable(200));
        Future<String> f3 = pool.submit(new MyCallable(300));
        Future<String> f4 = pool.submit(new MyCallable(400));

        try {
            System.out.println(f1.get());
            System.out.println(f2.get());
            System.out.println(f3.get());
            System.out.println(f4.get());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
