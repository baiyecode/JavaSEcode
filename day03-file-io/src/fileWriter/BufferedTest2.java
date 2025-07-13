package fileWriter;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * ClassName: BufferedTest2
 * Package: fileWriter
 * Description: 案例：出师表排序
 *
 * @Author 白夜
 * @Create 2025/7/12 17:00
 * @Version 1.0
 */
public class BufferedTest2 {
    public static void main(String[] args) {
        //需求：把《出师表》的文章顺序进行恢复到一个新文件中。
        //分析：
        //1、定义一个缓存字符输入流管道与源文件接通。
        //2、定义一个List集合存储读取的每行数据。
        //3、定义一个循环按照行读取数据，存入到List集合中去。
        //4、对List集合中的每行数据按照首字符编号升序排序。
        //5、定义一个缓存字符输出管道与目标文件接通。
        //6、遍历List集合中的每个元素，用缓冲输出管道写出并换行。


        try (
                //1、定义一个缓存字符输入流管道与源文件接通。
                BufferedReader br = new BufferedReader(new FileReader("day03-file-io\\src\\csb.txt"));

                //5、定义一个缓存字符输出管道与目标文件接通。
                BufferedWriter bw = new BufferedWriter(new FileWriter("day03-file-io\\src\\csb_out.txt"));
                )
            {

                //2、定义一个List集合存储读取的每行数据。
                List<String> list = new ArrayList<>();
                //3、定义一个循环按照行读取数据，存入到List集合中去。
                String line;
                while ((line = br.readLine()) != null) {
                    list.add(line);
                }
                //4、对List集合中的每行数据按照首字符编号升序排序。
                Collections.sort(list);// 排序

                //6、遍历List集合中的每个元素，用缓冲输出管道写出并换行。
                for (String s : list) {
                    bw.write(s);
                    bw.newLine();// 换行
                }
        } catch (Exception e) {
            e.printStackTrace();
        }

        System.out.println("程序结束！");
    }
}
