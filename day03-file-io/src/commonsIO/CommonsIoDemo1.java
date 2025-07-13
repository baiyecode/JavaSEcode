package commonsIO;

import org.apache.commons.io.FileUtils;

import java.io.File;
import java.io.IOException;

/**
 * ClassName: CommonsIoDemo1
 * Package: commonsIO
 * Description: IO框架
 *
 * @Author 白夜
 * @Create 2025/7/12 22:20
 * @Version 1.0
 */
public class CommonsIoDemo1 {
    public static void main(String[] args) throws Exception {
        // 目标：IO框架
        FileUtils.copyFile(new File("day03-file-io\\src\\csb_out.txt"), new File("day03-file-io\\src\\csb_out2.txt"));

        //JDK 7提供的
//        Files.copy(Path.of("day03-file-io\\src\\csb_out.txt"), Path.of("day03-file-io\\src\\csb_out3.txt"));


        FileUtils.deleteDirectory(new File("J:\\java\\projects\\resourse\\kkk"));
    }

}
