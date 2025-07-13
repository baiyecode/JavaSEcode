package fileoutputStream;

import java.io.FileOutputStream;
import java.io.OutputStream;

/**
 * ClassName: FileOutputStreamDemo1
 * Package: fileoutputStream
 * Description: 文件字节输出流
 *
 * @Author 白夜
 * @Create 2025/7/11 20:14
 * @Version 1.0
 */
public class FileOutputStreamDemo1 {
    public static void main(String[] args) throws Exception {
        // 目标：学会使用文件字节输出流。
        // 1、创建文件字节输出流管道与目标文件接通
        // 覆盖管道, 如果目标文件不存在，会自动创建一个目标文件, 如果目标文件存在，会清空目标文件
        //OutputStream os = new FileOutputStream("day03-file-io/src/baiye05-out.txt");
        //追加管道, 如果目标文件不存在，会自动创建一个目标文件, 如果目标文件存在，会追加数据
        OutputStream os = new FileOutputStream("day03-file-io/src/baiye05-out.txt", true); // 追加数据

        // 2、写入数据
        //  public void write(int b)
        os.write(97); // 写入一个字节数据
        os.write('b'); // 写入一个字符数据
//        os.write('徐'); // 写入一个字符数据 会乱码，因为是3个字节，写入的时候还是按一个字节输出，导致截断！
        os.write("\r\n".getBytes()); // 换行

        // 3、写一个字节数组出去
        // public void write(byte[] b)
        byte[] bytes = "我爱你中国666".getBytes();// 把字符串转换成字节数组
        os.write(bytes);
        //byte[] bytes2 ="\r\n".getBytes();
        //os.write(bytes2);
        os.write("\r\n".getBytes()); // 换行

        // 4、写一个字节数组的一部分出去
        // public void write(byte[] b, int pos, int len)
        os.write(bytes, 0, 3);//0-3个字节，也就是第一个汉字
        os.write("\r\n".getBytes()); // 换行

        os.close(); // 关闭管道 释放资源

    }
}
