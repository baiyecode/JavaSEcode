package copy;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;

/**
 * ClassName: CopyDemo1
 * Package: copy
 * Description: 复制文件
 *
 * @Author 白夜
 * @Create 2025/7/11 20:22
 * @Version 1.0
 */
public class CopyDemo1 {
    public static void main(String[] args) throws Exception {
        // 目标：使用字节流完成文件的复制操作。
        // 源文件：J:\java\projects\resourse\baiye.png
        // 目标文件：D:\Microsoft Edge\baiye_new.jpg （复制过去的时候必须带文件名的，无法自动生成文件名。）
        copyFile("J:\\java\\projects\\resourse\\baiye.png", "D:\\Microsoft Edge\\baiye_new.jpg");
    }

    // 复制文件
    public static void copyFile(String srcPath, String destPath)  {
        // 1、创建一个文件字节输入流管道与源文件接通
        InputStream fis = null;
        OutputStream fos = null;
        try {
            fis = new FileInputStream(srcPath);
            fos = new FileOutputStream(destPath);
            // 2、读取一个字节数组，写入一个字节数组  1024 + 1024 + 3
            byte[] buffer = new byte[1024];
            int len;
            while ((len = fis.read(buffer)) != -1) {
                fos.write(buffer, 0, len); // 读取多少个字节，就写入多少个字节
            }
            System.out.println("复制成功！");
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            // 最后一定会执行一次：即便程序出现异常！
            // 3、释放资源
            try {
                if(fos != null) fos.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
            try {
                if(fis != null) fis.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }


}
