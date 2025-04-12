package staticfield;

/**
 * ClassName: User
 * Package: staticfield
 * Description: 静态变量应用场景
 *
 * @Author 白夜
 * @Create 2025/4/11 17:44
 * @Version 1.0
 */
public class User {
    public static int count = 0;


    public User() {
        //User.count++;
        //注意:同一个类中访问静态成员可以省略类名不写
        count++;
    }
}
