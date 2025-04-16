package polymorphism3;

/**
 * ClassName: Test
 * Package: polymorphism
 * Description:
 *
 * @Author 白夜
 * @Create 2025/4/16 20:07
 * @Version 1.0
 */
public class Test {
    public static void main(String[] args) {
        // 目标:认识多态的代码。
        //1、多态的好处1:右边对象是解耦合的。
        Animal a = new Tortoise();
        //Animal a = new Wolf();
        a.run();
        //a.eat();    多态下的一个问题:多态下不能调用于类独有功能。

        //强制类型转换:可以解决多态下调用子类独有功能
        //子类 变量名 = (子类类型)父类变量名
        Tortoise t1 = (Tortoise) a;
        t1.cutHead();
        //有继承关系就可以强制转换，编译阶段不会报错!
        //运行时可能会出现类型转换异常:ClassCastException
        //Wolf w1 = (Wolf) a;




        System.out.println("-------------------------");
        //Animal w = new Wolf();
        Wolf w = new Wolf();
        go(w);
        //Animal t = new Tortoise();
        Tortoise t = new Tortoise();
        go(t);


    }
    //宠物游戏:所有动物都可以送给这个方法开始跑步。
    //2、多态的好处  父类类型的变量作为参数，可以接收一个子类对象
    public static void go(Animal a){
        System.out.println("开始~~~~");
        a.run();
        //a.eat();    //多态下的一个问题:多态下不能调用于类独有功能。

        //java建议强制转换前，应该判断对象的真实类型，再进行强制关型转换
        //强制类型转换:可以解决多态下调用子类独有功能
        if(a instanceof Tortoise){
            Tortoise t = (Tortoise) a;
            t.cutHead();
        }else if(a instanceof Wolf){
            Wolf w = (Wolf) a;
            w.eat();
        }
    }
}
