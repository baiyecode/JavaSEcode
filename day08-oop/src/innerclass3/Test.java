package innerclass3;

/**
 * ClassName: Test
 * Package: innerclass3
 * Description: 匿名内部类
 *
 * @Author 白夜
 * @Create 2025/4/26 15:33
 * @Version 1.0
 */
public class Test {
    public static void main(String[] args) {
        //认识匿名内部类，了解基本作用
        //Animal a = new cat();
        //a.eat();
        // 匿名内部类实际上是有名字:外部类名$编号.class，比如Test$1.class
        // 匿名内部类本质是一个子类，同时会立即构建一个子类对象
        Animal a = new Animal() {
            @Override
            public void eat() {
                System.out.println("猫吃鱼");
            }
        };
        a.eat();
    }
}


//class cat extends Animal {
//    @Override
//    public void eat() {
//        System.out.println("猫吃鱼");
//    }
//}
