package interface1;

/**
 * ClassName: Test
 * Package: interface1
 * Description:接口
 *
 * @Author 白夜
 * @Create 2025/4/22 20:43
 * @Version 1.0
 */
public class Test {
    public static void main(String[] args) {
        //认识接口，理解接口的特点
        // 接口不能创建对象
        System.out.println(A.NAME);
    }
}

//接口是用来被类实现(implements)的，实现接口的类称为实现类，
//一个类可以同时实现多个接口。
class Test1 implements A,B{

    @Override
    public void eat() {
        System.out.println("eat");

    }

    @Override
    public void run() {
        System.out.println("run");

    }
}
