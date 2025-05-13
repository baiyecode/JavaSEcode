package exception;

/**
 * ClassName: AgeIllegalRuntimeException
 * Package: exception
 * Description:
 *
 * @Author 白夜
 * @Create 2025/5/12 21:04
 * @Version 1.0
 */
public class AgeIllegalRuntimeException extends RuntimeException{
    //自定义运行时异常，继承RuntimeException，构造方法重写
    public AgeIllegalRuntimeException(){

    }
    public AgeIllegalRuntimeException(String message){
        super(message);
    }
}
