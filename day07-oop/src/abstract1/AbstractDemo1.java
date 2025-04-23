package abstract1;

/**
 * ClassName: AbstractDemo1
 * Package: abstract1
 * Description: 抽象类
 *
 * @Author 白夜
 * @Create 2025/4/20 21:42
 * @Version 1.0
 */
public class AbstractDemo1 {
    public static void main(String[] args) {
       //抽象类的特点
        //抽象类最主要的特点：抽象类不能创建对象，仅作为一种特殊的父类，让子类继承并实现
        //A a = new A(); //报错
        //a.run();

        B b = new B();
        b.setName("白夜");
        b.setAge(18);
        System.out.println(b.getName() + " " + b.getAge());
        b.eat();
        b.run();
    }
}
