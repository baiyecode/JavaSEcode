package extends1demo;

/**
 * ClassName: People
 * Package: extendsdemo
 * Description: 继承
 *
 * @Author 白夜
 * @Create 2025/4/15 20:03
 * @Version 1.0
 */
public class People {
    //父类
    //继承的好处：代码复用，减少重复代码量，提高开发效率
    private String name;
    private char sex;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public char getSex() {
        return sex;
    }

    public void setSex(char sex) {
        this.sex = sex;
    }
}
