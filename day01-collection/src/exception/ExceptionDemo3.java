package exception;

/**
 * ClassName: ExceptionDemo3
 * Package: exception
 * Description: 自定义异常
 *
 * @Author 白夜
 * @Create 2025/5/12 20:55
 * @Version 1.0
 */
public class ExceptionDemo3 {
    public static void main(String[] args) {
        //自定义编译时异常
        System.out.println("程序开始了~~~~");
        try {
            checkAge(300);
            System.out.println("年龄合法");
        } catch (AgeIllegalException e) {
            e.printStackTrace();
            System.out.println("年龄不合法");
        }
        System.out.println("程序结束了~~~~");
    }

    //需求:我们公司的系统只要收到了年龄小于1岁或者大于200岁就是一个年龄非法异常。
    public static void checkAge(int age) throws AgeIllegalException {
        if (age < 1 || age > 200) {
            throw new AgeIllegalException("年龄非法,必须大于1岁，小于200岁");
        }
        System.out.println("年龄合法");
        System.out.println("年龄是:" + age);
    }
}
