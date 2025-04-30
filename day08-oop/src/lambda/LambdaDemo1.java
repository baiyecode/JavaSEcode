package lambda;


/**
 * ClassName: LambdaDemo1
 * Package: lambda
 * Description: lambda表达式
 *
 * @Author 白夜
 * @Create 2025/4/29 15:29
 * @Version 1.0
 */
public class LambdaDemo1 {
    public static void main(String[] args) {
        // lambda表达式的格式和用法
        // (被重写方法的形参列表) -> { 被重写方法的方法体代码 }
        Animal a = new Animal() {
            @Override
            public void eat() {
                System.out.println("猫吃鱼~~~~");
            }
        };
        a.eat();

        //错误示例，Lambda并不是可以简化全部的名内部类，Lambda只能简化医数式接日的医名内那头
        //Animal a1 = () -> {
        //      System.out.println("猫吃鱼~~~~");
        // };
        //a.eat();


        Swim s = new Swim() {
            @Override
            public void swimming() {
                System.out.println("学生蛙泳~~~");
            }
        };

        s.swimming();
       //Lambda表达式只能替代函数式接口的匿名内部类
        Swim s1 = () -> {
            System.out.println("学生蛙泳~~~");
        };
        s1.swimming();

    }
}


abstract class Animal{
    public abstract void eat();
}

//函数式接口: 有且仅有一个抽象方法的接口。
@FunctionalInterface  // 函数式接口的注释
interface Swim{
    void swimming();
}