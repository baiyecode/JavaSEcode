package polymorphism;

/**
 * ClassName: Test
 * Package: polymorphism
 * Description: 多态
 *
 * @Author 白夜
 * @Create 2025/4/16 20:07
 * @Version 1.0
 */
public class Test {
    public static void main(String[] args) {
        //目标:认识多态的代码。
        //1、对象多态、行为多态。
        Animal a = new Tortoise();
        a.run();//方法:编译看左边，运行看右边,
        //编译的时候如果animal没有run方法，编译不通过，但是运算后是运行的tortoise的run方法
        System.out.println(a.name);//动物
        //成员变量:编译看左边，运行也看左边

        Animal b = new Wolf();
        b.run();
        System.out.println(b.name);
    }
}
