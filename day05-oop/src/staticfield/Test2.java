package staticfield;

/**
 * ClassName: Test2
 * Package: staticfield
 * Description:理解静态变量的使用场景
 *
 * @Author 白夜
 * @Create 2025/4/11 17:45
 * @Version 1.0
 */
public class Test2 {
    public static void main(String[] args) {
        // 静态变量的使用场景
        //直接创建对象没有用变量去记录相当于直接不要了
        //User user = new User(); //使用user变量记录
        new User();
        new User();
        new User();
        new User();
        System.out.println(User.count);// 4



    }
}
