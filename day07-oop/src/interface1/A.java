package interface1;

/**
 * ClassName: A
 * Package: interface1
 * Description:
 *
 * @Author 白夜
 * @Create 2025/4/22 20:43
 * @Version 1.0
 */

// 接口：用interface关键字修饰
public interface A {
    // JDK 8之前、接口中只能定义常量和抽象方法。
    // 1、常量:接口中定义常量可以省略public static final不写，默认会加上去。
    //public static final int AGE = 18;
    int AGE = 18;
    String NAME = "张三";
    // 2、抽象方法:接口中定义抽象方法可以省略public abstract不写，默认会加上去。
    //public abstract void eat();
    void eat();
    void run();
}
