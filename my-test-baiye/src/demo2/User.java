package demo2;

/**
 * ClassName: User
 * Package: demo2
 * Description:
 *
 * @Author 白夜
 * @Create 2025/7/28 21:00
 * @Version 1.0
 */
// 用户实体类
public class User {
    private String username;
    private String password;

    public User(String username, String password) {
        this.username = username;
        this.password = password;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    @Override
    public String toString() {
        return username + "," + password;
    }

    // 从文件格式字符串创建User对象
    public static User fromString(String line) {
        String[] parts = line.split(",");
        if (parts.length == 2) {
            return new User(parts[0], parts[1]);
        }
        return null;
    }
}
