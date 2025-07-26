package proxy2;

import java.util.Arrays;

/**
 * ClassName: Test
 * Package: proxy2
 * Description:
 *
 * @Author 白夜
 * @Create 2025/7/26 16:21
 * @Version 1.0
 */
public class Test {
    /**
     * 目标：使用动态代理解决实际问题，并掌握使用代理的好处。
     */
    public static void main(String[] args) throws Exception{
        // 1、创建用户业务对象。
        UserService userService = ProxyUtil.createProxy(new UserServiceImpl());

        // 2、调用用户业务的功能。
        userService.login("admin", "123456");

        userService.deleteUsers();

        String[] names = userService.selectUsers();
        System.out.println("查询到的用户是：" + Arrays.toString(names));

        String[] names2 = userService.selectUsers2();
        System.out.println("查询到的用户是：" + Arrays.toString(names2));
    }

}
