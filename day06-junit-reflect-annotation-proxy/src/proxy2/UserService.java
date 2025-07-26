package proxy2;

/**
 * ClassName: UserService
 * Package: proxy2
 * Description:
 *
 * @Author 白夜
 * @Create 2025/7/26 16:19
 * @Version 1.0
 */
public interface UserService {

    /**
     *  用户业务接口
     */
    // 登录功能
    void login(String loginName,String passWord) throws Exception;
    // 删除用户
    void deleteUsers() throws Exception;
    // 查询用户，返回数组的形式。
    String[] selectUsers() throws Exception;
    String[] selectUsers2() throws Exception;

}
