package extends2modifier;

/**
 * ClassName: Test
 * Package: extends2modifier
 * Description: 权限修饰符
 *
 * @Author 白夜
 * @Create 2025/4/15 20:31
 * @Version 1.0
 */
public class Test {
    //认识四种访问权限修饰符
    public static void main(String[] args) {
        Fu fu = new Fu();
        //privateMethod()方法，本类内部可以访问，其他类不可以访问
        //fu.privateMethod();
        //同一个包下的其他类可以访问缺省，protected,public修饰符
        fu.Method();
        fu.protectedMethod();
        fu.publicMethod();

    }
}
