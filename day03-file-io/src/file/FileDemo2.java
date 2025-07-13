package file;

import java.io.File;
import java.util.Arrays;

/**
 * ClassName: FileDemo2
 * Package: file
 * Description:
 *
 * @Author 白夜
 * @Create 2025/7/9 17:07
 * @Version 1.0
 */
public class FileDemo2 {
    public static void main(String[] args) throws Exception {

        // 目标：掌握File遍历一级文件对象的操作
        File dir = new File("J:\\java\\projects\\resourse\\baiye01.txt");
        File dir2 = new File("J:\\java\\projects\\resourse\\eee");

        /**
         * 当主调是文件，或者路径不存在时，返回null
         * 当主调是空文件夹时，返回一个长度为0的数组
         * 当主调是一个有内容的文件夹时，将里面所有一级文件和文件夹的路径放在File数组中返回
         * 当主调是一个文件夹，且里面有隐藏文件时，将里面所有文件和文件夹的路径放在File数组中返回，包含隐藏文件
         * 当主调是一个文件夹，但是没有权限访问该文件夹时，返回null
         */
        //File[] files = dir.listFiles();
        //System.out.println(files);//当主调是文件，或者路径不存在时，返回null
        File[] files = dir2.listFiles();
        System.out.println(Arrays.toString(files));//当主调是空文件夹时，返回一个长度为0的数组

    }
}
