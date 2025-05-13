package exception;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FilterInputStream;
import java.io.InputStream;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * ClassName: ExceptionDemo1
 * Package: exception
 * Description: 异常
 *
 * @Author 白夜
 * @Create 2025/5/12 15:54
 * @Version 1.0
 */
public class ExceptionDemo1 {
    public static void main(String[] args) {
            //认识异常，理解异常作用
        show();
        //处理异常的两个方法：try...catch（捕获）和throws（抛出）
        //try {
        //    show1();
        //} catch (ParseException e) {
        //    e.printStackTrace();//打印异常信息
        //} catch (FileNotFoundException e) {
        //    e.printStackTrace();//打印异常信息
        //}

        try {
            show1();
        } catch (Exception e) {
            e.printStackTrace();//打印异常信息
        }
    }

    //定义一个方法认识编译异常。
    public static void show1() throws ParseException, FileNotFoundException {
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

    //定义一个方法认识运行时异常。
    public static void show() {
        System.out.println("程序开始...");
        //运行时异常特点：编译通过，运行时异常，继承：RuntimeException

        int a = 10;
        int b = 0;
        //int c = a / b;//ArithmeticException
        //System.out.println(c);

        int[] arr = {10, 20, 30};
        //System.out.println(arr[3]);//ArrayIndexOutOfBoundsException

        //出现异常后，程序终止。后面不会执行。
        System.out.println("程序结束...");


        //空指针异常
        String str = null;
        //System.out.println(str);
        //System.out.println(str.length());//NullPointerException
    }
}
