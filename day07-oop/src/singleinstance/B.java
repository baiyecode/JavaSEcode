package singleinstance;

/**
 * ClassName: B
 * Package: singleinstance
 * Description: 懒汉式单例类
 *
 * @Author 白夜
 * @Create 2025/4/20 20:45
 * @Version 1.0
 */
public class B {
    //懒汉式单例 :用类的对象时，才开始创建对象
    //创建一个私有的静态变量
    private static B b;

    //私有化构造器
    private B() {
    }
    //创建一个公共的静态方法
    public static B getInstance() {
        //第一次拿对象时，会创建对象，给静态变量b记住。
        if (b == null) {
            b = new B();
        }
        return b;
    }
}
