package lock3;

/**
 * ClassName: DrawThread
 * Package: lock3
 * Description:
 *
 * @Author 白夜
 * @Create 2025/7/19 16:01
 * @Version 1.0
 */
public class DrawThread extends  Thread{
    private Account acc; // 记住线程对象要处理的账户对象。

    public DrawThread(String name, Account acc) {
        super(name);
        this.acc = acc;
    }

    @Override
    public void run() {
        // 小明 小红 取钱
        acc.drawMoney(100000);
    }

}
