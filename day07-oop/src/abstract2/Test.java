package abstract2;

/**
 * ClassName: Test
 * Package: abstract2
 * Description: 抽象类的好处
 *
 * @Author 白夜
 * @Create 2025/4/22 19:56
 * @Version 1.0
 */
public class Test {
    public static void main(String[] args) {
        //父类知道每个子类都要做某个行为，但每个子类要做的情况不一样，
        //父类就定义成抽象方法，交给子类去重写实现，我们设计这样的抽象类，就是为了更好的支持多态。
        Animal a = new Dog();
        a.cry();
    }
}
