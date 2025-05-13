package exception;

/**
 * ClassName: ExceptionDemo4
 * Package: exception
 * Description:
 *
 * @Author 白夜
 * @Create 2025/5/12 21:06
 * @Version 1.0
 */
public class ExceptionDemo4 {
    public static void main(String[] args) {
        //自定义运行时异常
        System.out.println("程序开始了~~~~");
        //try {
        //    checkAge(300);
        //    System.out.println("年龄合法");
        //} catch (AgeIllegalRuntimeException e) {
        //    e.printStackTrace();
        //    System.out.println("年龄不合法");
        //}
        checkAge(300);//运行时异常可以不处理，
        System.out.println("程序结束了~~~~");
    }

    //需求:我们公司的系统只要收到了年龄小于1岁或者大于200岁就是一个年龄非法异常。
    public static void checkAge(int age) {//方法默认抛出运行时异常
        if (age < 1 || age > 200) {
            //编译时异常
            throw new AgeIllegalRuntimeException("年龄非法,必须大于1岁，小于200岁");
        }
        System.out.println("年龄合法");
        System.out.println("年龄是:" + age);
    }
}
