package extends3modifier;

import extends2modifier.Fu;

/**
 * ClassName: Demo
 * Package: extends3modifier
 * Description:
 *
 * @Author 白夜
 * @Create 2025/4/15 20:39
 * @Version 1.0
 */
public class Demo {
    public static void main(String[] args) {
        Fu f = new Fu();
        //其他包的类中只能访问public修饰符
        //f.privateMethod();
        //f.Method();
        //f.protectedMethod();
        f.publicMethod();
    }
}
