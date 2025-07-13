package charset;

import java.util.Arrays;

/**
 * ClassName: CharSetDemo1
 * Package: charset
 * Description: 字符集的编码，解码
 *
 * @Author 白夜
 * @Create 2025/7/10 21:16
 * @Version 1.0
 */
public class CharSetDemo1 {
    public static void main(String[] args) throws Exception {
        // 目标：写程序实现字符编码和解码
        // 1、编码
        String name = "我爱你中国abc666";

        // byte[] bytes = name.getBytes(); // 平台默认的UTF-8编码的。
        byte[] bytes = name.getBytes("GBK"); // 指定GBK进行编码。
        //字节数组的长度  3 * 5 + 6 = 21  一个中文字符占3个字节，一个英文字符占1个字节，一个数字占1个字节。
        System.out.println(bytes.length);// 21
        System.out.println(Arrays.toString(bytes));//


        // 2、解码,不一致的编码和解码会乱码
        //String name2 = new String(bytes); // 平台的UTF-8解码的。
        String name2 = new String(bytes, "GBK");// 指定GBK进行解码
        System.out.println(name2);
    }
}
