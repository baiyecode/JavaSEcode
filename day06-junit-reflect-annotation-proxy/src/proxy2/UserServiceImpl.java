package proxy2;

/**
 * ClassName: UserServiceImpl
 * Package: proxy2
 * Description:
 *
 * @Author 白夜
 * @Create 2025/7/26 16:20
 * @Version 1.0
 */
public class UserServiceImpl implements UserService{
    @Override
    public void login(String loginName, String passWord) throws Exception {
        //long start = System.currentTimeMillis(); // 记录开始时间 1970年1月1日0时0分0秒 走到此刻的总毫秒值
        // ----------------------
        if("admin".equals(loginName) && "123456".equals(passWord)){
            System.out.println("您登录成功，欢迎光临本系统~");
        }else {
            System.out.println("您登录失败，用户名或密码错误~");
        }
        Thread.sleep(1000);

        //long end = System.currentTimeMillis();
        //System.out.println("login方法耗时："+(end-start)/1000.0+"秒");
        // --------------------------
    }

    @Override
    public void deleteUsers() throws Exception{
        //long start = System.currentTimeMillis(); // 记录开始时间 1970年1月1日0时0分0秒 走到此刻的总毫秒值

        System.out.println("成功删除了1万个用户~");
        Thread.sleep(1500);

        //long end = System.currentTimeMillis();
        //System.out.println("deleteUser方法耗时："+(end-start)/1000.0+"秒");
    }

    @Override
    public String[] selectUsers() throws Exception{
        //long start = System.currentTimeMillis(); // 记录开始时间 1970年1月1日0时0分0秒 走到此刻的总毫秒值

        System.out.println("查询出了3个用户");
        String[] names = {"张全蛋", "李二狗", "牛爱花"};
        Thread.sleep(500);

        //long end = System.currentTimeMillis();
        //System.out.println("selectUsers方法耗时："+(end-start)/1000.0+"秒");

        return names;
    }

    @Override
    public String[] selectUsers2() throws Exception {
        System.out.println("查询出了3000个用户");
        String[] names = {"张全蛋2", "李二狗2", "牛爱花2"};
        Thread.sleep(2500);

        return names;
    }

}
