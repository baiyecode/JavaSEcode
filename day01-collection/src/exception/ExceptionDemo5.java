package exception;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * ClassName: ExceptionDemo5
 * Package: exception
 * Description: 异常处理方案
 *
 * @Author 白夜
 * @Create 2025/5/12 21:43
 * @Version 1.0
 */
public class ExceptionDemo5 {
    public static void main(String[] args) {
        //异常处理方案1
        //底层异常层层往上抛出，最外层捕获异常，记录下异常信息，并响应适合用户观看的信息进行提示
        System.out.println("程序开始...");
        try {
            show();
            System.out.println("程序成功了...");
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("程序失败了...");
        }
        System.out.println("程序结束...");
    }

    public static void show() throws Exception{
        System.out.println("程序开始...");
        //编译时异常特点：编译阶段报错，编译不通过
        String str = "2025-5-12 16:04:23";
        // 把字符串时间解析成Java中的一个日期对象。
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Date date = sdf.parse(str);// 编译时异常，提醒程序员这里的程序很容易出错，请您注意!
        System.out.println(date);
        //有多个运行时异常时，可以直接抛出Exception，代表抛出所有异常
        InputStream is = new FileInputStream("d:/abc.txt");
    }
}
