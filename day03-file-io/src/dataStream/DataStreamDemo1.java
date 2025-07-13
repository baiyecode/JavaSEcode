package dataStream;

import java.io.DataOutputStream;
import java.io.FileOutputStream;

/**
 * ClassName: DataStreamDemo1
 * Package: dataStream
 * Description: 特殊数据流
 *
 * @Author 白夜
 * @Create 2025/7/12 21:27
 * @Version 1.0
 */
public class DataStreamDemo1 {
    public static void main(String[] args) {
        // 目标：特殊数据流的使用。
        try (
                //必须包装低级数据流
                DataOutputStream dos = new DataOutputStream(new FileOutputStream("day03-file-io\\src\\data.txt"));
        ){
            dos.writeByte(34);
            dos.writeUTF("你好");
            dos.writeInt(3665);
            dos.writeDouble(9.9);
        }catch (Exception e){
            e.printStackTrace();
        }

    }
}
