package singleinstance;

/**
 * ClassName: Test
 * Package: singleinstance
 * Description: 单例设计模式
 *
 * @Author 白夜
 * @Create 2025/4/20 20:27
 * @Version 1.0
 */
public class Test {


    public static void main(String[] args) {
        //设计单例类
        //确保某个类只能创建一个对象。
        A a1 = A.getInstance();
        A a2 = A.getInstance();
        System.out.println(a1);
        System.out.println(a2);
        System.out.println(a1 == a2);

        System.out.println("===============");

        B b1 = B.getInstance();
        B b2 = B.getInstance();
        System.out.println(b1);
        System.out.println(b2);
        System.out.println(b1 == b2);
    }

}
