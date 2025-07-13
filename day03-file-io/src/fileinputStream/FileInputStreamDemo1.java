package fileinputStream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;

/**
 * ClassName: FileInputStreamDemo1
 * Package: fileinputStream
 * Description: 文件字节输入流
 *
 * @Author 白夜
 * @Create 2025/7/11 17:55
 * @Version 1.0
 */
public class FileInputStreamDemo1 {
    public static void main(String[] args) throws Exception {
        // 目标：掌握文件字节输入流读取文件中的字节数组到内存中来。
        // 1、创建文件字节输入流管道于源文件接通
        // InputStream is = new FileInputStream(new File("day03-file-io\\src\\baiye02.txt"));
        InputStream is = new FileInputStream("day03-file-io\\src\\baiye02.txt"); // 简化写法

        // 2、开始读取文件中的字节并输出： 每次读取一个字节
        // 定义一个变量记住每次读取的一个字节
        int b;
        while ((b = is.read()) != -1) {
            System.out.print((char) b);//转化为字符输出，read()返回类型为int
        }
        // 每次读取一个字节的问题：性能较差,读取汉字输出一定会乱码！
        //因为汉字是3个字节，会拆分开汉字的字节来输出然后乱码

        is.close();// 关闭管道

    }
}
