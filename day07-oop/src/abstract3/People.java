package abstract3;

/**
 * ClassName: People
 * Package: abstract3
 * Description:
 *
 * @Author 白夜
 * @Create 2025/4/22 20:13
 * @Version 1.0
 */
public abstract class People {
    //模板方法设计模式
    //模板方法封装了每个实现步骤，但允许子类提供特定步骤的实现。
    public final void write() {
        System.out.println("\t\t\t《我的爸爸》");
        System.out.println("\t我爸爸是一个好人，我特别喜欢他，他对我很好，我来介绍一下:");
        writeMain();
        System.out.println("\t我爸爸真好，你有这样的爸爸吗?");
    }
    public abstract void writeMain();
}
