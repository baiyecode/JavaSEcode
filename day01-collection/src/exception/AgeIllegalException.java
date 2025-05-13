package exception;

/**
 * ClassName: AgeIllegalException
 * Package: exception
 * Description:
 *
 * @Author 白夜
 * @Create 2025/5/12 20:57
 * @Version 1.0
 */

//自定义异常类
public class AgeIllegalException extends Exception{
    //编译时异常类，继承Exception类，重写无参构造和有参构造
    public AgeIllegalException() {
    }
    public AgeIllegalException(String message) {
        super(message);
    }
}
