package file;

import java.io.File;
import java.io.IOException;

/**
 * ClassName: FileDemo1
 * Package: file
 * Description: File常用方法
 *
 * @Author 白夜
 * @Create 2025/7/9 15:38
 * @Version 1.0
 */
public class FileDemo1 {
    public static void main(String[] args) throws Exception {
        // 目标：创建File创建对象代表文件（文件/目录），搞清楚其提供的对文件进行操作的方法。
        // 1、创建File对象，去获取某个文件的信息
        //File f1 = new File("J:\\java\\projects\\resourse\\baiye.png");
        File f1 = new File("J:/java/projects/resourse/baiye.png");

        System.out.println(f1.length()); // 字节个数
        System.out.println(f1.getName());
        System.out.println(f1.isFile()); // 是不是文件    true
        System.out.println(f1.isDirectory()); // 是不是文件夹    false

        // 2、可以使用相对路径定位文件对象
        // 只要带盘符的都称之为：绝对路径 J:/java/projects/resourse/baiye.png
        // 相对路径：不带盘符，默认是到你的idea工程下直接寻找文件的。一般用来找工程下的项目文件的。
        File f2 = new File("day03-file-io\\src\\baiye01.txt");
        System.out.println(f2.length());// 字节个数
        //System.out.println(f2.getAbsolutePath());// 获取绝对路径  返回字符串
        System.out.println(f2.getAbsoluteFile());// 获取绝对路径  返回File对象
        System.out.println(f2.getPath());// 获取相对路径

        // 3、创建对象代表不存在的文件路径。
        File f3 = new File("J:\\java\\projects\\resourse\\baiye01.txt");
        System.out.println(f3.exists()); // 判断是否存在
        System.out.println(f3.createNewFile()); // 把这个文件创建出来

        // 4、创建对象代表不存在的文件夹路径。
        File f4 = new File("J:\\java\\projects\\resourse\\aaa");
        System.out.println(f4.mkdir()); // mkdir只能创建一级文件夹

        File f5 = new File("J:\\java\\projects\\resourse\\kkk\\jjj\\mmm");
        System.out.println(f5.mkdirs()); // mkdir可以创建多级文件夹，很重要！

        // 5、创建File对象代表存在的文件，然后删除它
        File f6 = new File("J:\\java\\projects\\resourse\\baiye01.txt");
        System.out.println(f6.delete()); // 删除文件

        //删除后的文件不会进入回收站

        // 6、创建File对象代表存在的文件夹，然后删除它
        File f7 = new File("J:\\java\\projects\\resourse\\aaa");
        System.out.println(f7.delete());  // 只能删除空文件，不能删除非空文件夹  true

        File f8 = new File("J:\\java\\projects\\resourse\\kkk\\jjj\\mmm");
        System.out.println(f8.delete());  // 会删除最后一级的空文件夹  true

        File f9 = new File("J:\\java\\projects\\resourse");
        System.out.println(f9.delete()); // 不能删除非空文件夹  false


        // 8、可以获取某个目录下的全部一级文件名称
        File f10 = new File("J:\\java\\projects\\resourse");
        String[] names = f10.list();
        for (String name : names) {
            System.out.println(name);
        }
        //获取某个目录下的全部一级文件对象
        File[] files = f10.listFiles();
        for (File file : files) {
            System.out.println(file.getAbsoluteFile()); // 获取绝对路径
        }

    }
}
