package executorService;

import java.util.concurrent.Callable;

/**
 * ClassName: MyCallable
 * Package: executorService
 * Description:
 *
 * @Author 白夜
 * @Create 2025/7/19 20:21
 * @Version 1.0
 */
public class MyCallable implements Callable<String> {
    private int n;
    public MyCallable(int n) {
        this.n = n;
    }
    // 2、实现call方法，定义线程执行体
    public String call() throws Exception {
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += i;
        }
        return Thread.currentThread().getName() +"计算1-" + n + "的和是："  + sum;
    }

}
