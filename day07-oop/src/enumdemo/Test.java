package enumdemo;

/**
 * ClassName: Test
 * Package: enumdemo
 * Description: 枚举类
 *
 * @Author 白夜
 * @Create 2025/4/20 20:57
 * @Version 1.0
 */
public class Test {
    public static void main(String[] args) {
        // 枚举类的特点
        //枚举类是最终类，不能被继承
        A a1 = A.X;
        //已经重写了toString方法，所以打印的时候会打印枚举类的名字
        System.out.println(a1);// X

        System.out.println(a1.name());// X
        System.out.println(a1.ordinal());// 0 ,索引

    }

}
