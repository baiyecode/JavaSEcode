package executorService;


import java.util.concurrent.*;

/**
 * ClassName: ExecutorServiceDemo1
 * Package: executorService
 * Description: 创建线程池的方式一：使用ThreadPoolExecutor类,使用线程池处理Runnable任务
 *
 * @Author 白夜
 * @Create 2025/7/19 18:00
 * @Version 1.0
 */
public class ExecutorServiceDemo1 {
    public static void main(String[] args) {
        // 目标：创建线程池对象来使用。
        // 1、使用线程池的实现类ThreadPoolExecutor声明七个参数来创建线程池对象。
        ExecutorService pool = new ThreadPoolExecutor(3, 5,
                10, TimeUnit.SECONDS, new ArrayBlockingQueue<>(3),
                Executors.defaultThreadFactory(), new ThreadPoolExecutor.AbortPolicy() );
        /**
         * 参数一：corePoolSize : 指定线程池的核心线程的数量。（正式工：3）
         * 参数二：maximumPoolSize：指定线程池的最大线程数量。（最大员工数：5   临时工 ：2）
         * 参数三：keepAliveTime ：指定临时线程的存活时间。（临时工空闲多久被开除）
         * 参数四：unit：指定临时线程存活的时间单位(秒、分、时、天）
         * 参数五：workQueue：指定线程池的任务队列（如 ArrayBlockingQueue, LinkedBlockingQueue。）（客人排队的地方）
         * 参数六：threadFactory：指定线程池的线程工厂。（负责招聘员工的（hr））
         * 参数七：handler：指定线程池的任务拒绝策略（线程都在忙，任务队列也满了的时候，新任务来了该怎么处理）。
         */
        //ExecutorService pool = new ThreadPoolExecutor(3, 5,
        //        10, TimeUnit.SECONDS, new ArrayBlockingQueue<>(3),
        //        Executors.defaultThreadFactory(), new ThreadPoolExecutor.CallerRunsPolicy());

        /** 任务拒绝策略
         *    1、AbortPolicy：默认的拒绝策略，会抛出异常！
         *    2、CallerRunsPolicy：由主线程(main)负责调用任务的run()方法从而绕过线程池直接执行
         *    3、DiscardOldestPolicy：丢弃最老的未处理的任务
         *    4、DiscardPolicy：直接丢弃任务,不会抛出异常！不推荐使用
         */

        // 2、使用线程池处理任务！看会不会复用线程？
        Runnable target = new MyRunnable();
        pool.execute(target); // 提交第1个任务 创建第1个线程 自动启动线程处理这个任务
        pool.execute(target); // 提交第2个任务 创建第2个线程 自动启动线程处理这个任务
        pool.execute(target); // 提交第2个任务 创建第3个线程 自动启动线程处理这个任务
        pool.execute(target); //线程复用
        pool.execute(target);
        pool.execute(target);
        //新任务提交时发现核心线程都在忙，任务队列也满了，并且还可以创建临时线程，此时才会创建临时线程。
        pool.execute(target); // 到了临时线程的创建时机了
        pool.execute(target); // 到了临时线程的创建时机了
        //核心线程和临时线程都在忙，任务队列也满了，新的任务过来的时候才会开始拒绝任务。
        pool.execute(target); // 到了任务拒绝策略了，忙不过来

        // 3、关闭线程池 ：默认不关闭，但是一般不关闭线程池。
        // pool.shutdown(); // 等所有任务执行完毕后再关闭线程池！
//        pool.shutdownNow(); // 立即关闭，不管任务是否执行完毕！


    }
}
