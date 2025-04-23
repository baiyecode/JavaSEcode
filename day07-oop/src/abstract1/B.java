package abstract1;

/**
 * ClassName: B
 * Package: abstract1
 * Description:
 *
 * @Author 白夜
 * @Create 2025/4/20 21:51
 * @Version 1.0
 */
public class B extends A{

    //一个类继承抽象类，必须重写完抽象类的全部抽象方法，否则这个类也必须定义成抽象类
    @Override
    public void run() {
        System.out.println("B类重写了run方法");
    }
}
