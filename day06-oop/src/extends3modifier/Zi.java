package extends3modifier;

import extends2modifier.Fu;

/**
 * ClassName: Zi
 * Package: extends3modifier
 * Description:
 *
 * @Author 白夜
 * @Create 2025/4/15 20:41
 * @Version 1.0
 */
public class Zi extends Fu {
    public static void main(String[] args) {
        Zi zi = new Zi();
        //缺省访问权限，其他包中不能访问
        //zi.privateMethod();
        //zi.Method();
        //protected 可以在不同包中子孙类访问
        zi.protectedMethod();
        zi.publicMethod();


    }
}
