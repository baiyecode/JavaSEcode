package singleinstance;

/**
 * ClassName: A
 * Package: singleinstance
 * Description: 饿汉式单例类
 *
 * @Author 白夜
 * @Create 2025/4/20 20:27
 * @Version 1.0
 */
public class A {
    //设计成单例设计模式
    //饿汉式单例：在获取类的对象时，对象早就创建好了

    //2、设计一个静态的私有化的成员变量，用于保存唯一对象
    //public static final A a = new A();//也可以
    private static A a = new A();
    //A类型 变量名字为a，保存唯一对象new A();
    //public static int a1 = 0;

    //1、私有化构造器:确保单例类对外不能创建太多对象，单例才有可能性。
    private A() {

    }
    //3、设计一个静态的公共方法，用于返回唯一对象
    public static A getInstance() {
        return a;
    }






}
