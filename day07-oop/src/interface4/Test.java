package interface4;

/**
 * ClassName: Test
 * Package: interface4
 * Description: jdk8后接口新增的三种方法
 *
 * @Author 白夜
 * @Create 2025/4/23 15:45
 * @Version 1.0
 */
public class Test {
    public static void main(String[] args) {
        A a = new AImpl();
        a.eat();
        A.sleep();//只能使用当前接口名来调用


    }
}

class AImpl implements A {

    //default方法可以被重写
    @Override
    public void eat() {
        System.out.println("AImpl的eat方法");
    }
}
