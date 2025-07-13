package dataStream;

import java.io.DataInputStream;
import java.io.FileInputStream;

/**
 * ClassName: DateStreamDemo2
 * Package: dataStream
 * Description:
 *
 * @Author 白夜
 * @Create 2025/7/12 21:29
 * @Version 1.0
 */
public class DateStreamDemo2 {
    public static void main(String[] args) {
        // 目标：特殊数据流的使用。
        try (
                DataInputStream dis = new DataInputStream(new FileInputStream("day03-file-io\\src\\data.txt"));
        ){
            System.out.println(dis.readByte());
            System.out.println(dis.readUTF());
            System.out.println(dis.readInt());
            System.out.println(dis.readDouble());
        }catch (Exception e){
            e.printStackTrace();
        }

    }
}
