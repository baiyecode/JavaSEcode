package printStream;

import java.io.FileOutputStream;
import java.io.PrintStream;

/**
 * ClassName: PrintStreamDemo1
 * Package: printStream
 * Description: 打印流 printStream printWriter
 *
 * @Author 白夜
 * @Create 2025/7/12 21:06
 * @Version 1.0
 */
public class PrintStreamDemo1 {
    public static void main(String[] args) {
        // 目标：打印流的使用。
        try (
//               PrintStream ps = new PrintStream("day03-file-io/src/ps.txt");
                // 追加数据只能通向低级的流然后在后面用true
                PrintStream ps = new PrintStream(new FileOutputStream("day03-file-io/src/ps.txt", true));
//               PrintWriter ps = new PrintWriter("day03-file-io/src/ps.txt");
        ){
            ps.println(97);
            ps.println('a');
            ps.println("黑马");
            ps.println(true);
            ps.println(99.9);
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
