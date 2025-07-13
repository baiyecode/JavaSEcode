package recursion;

import java.io.File;

/**
* ClassName: FileSearchTest4
* Package: recursion
* Description: 文件搜索
*
* @Author 白夜
* @Create 2025/7/10 17:18
* @Version 1.0
*/
public class FileSearchTest4 {
    public static void main(String[] args) {
        // 目标：完成文件搜索。找出D:盘下的QQ.exe的位置。
        try {
            File dir = new File("D:/");
            searchFile(dir , "QQ.exe");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /**
     * 搜索文件
     * @param dir 搜索的目录
     * @param fileName 搜索的文件名称
     */
    public static void searchFile(File dir, String fileName) throws Exception {
        // 1、判断极端情况 为空，不存在，是文件
        if(dir == null || !dir.exists() || dir.isFile()){
            return; // 不搜索
        }

        // 2、获取目录下的所有一级文件或者文件夹对象
        File[] files = dir.listFiles();

        // 3、判断当前目录下是否存在一级文件对象，存在才可以遍历
        // 如果files为null，则是文件夹没有权限访问，存在的话要length大于0，不是空的文件夹
        if(files != null && files.length > 0){
            // 4、遍历一级文件对象
            for (File file : files) {
                // 5、判断当前一级文件对象是否是文件
                if(file.isFile()){
                    // 6、判断文件名称是否和目标文件名称一致
                    // contains() 方法判断字符串中是否包含指定的子串
                    if(file.getName().contains(fileName)){
                        System.out.println("找到目标文件：" + file.getAbsolutePath());
                        // 运行目标文件
                        //Runtime r = Runtime.getRuntime();
                        // exec() 方法启动一个子进程执行指定的字符串命令
                        //r.exec(file.getAbsolutePath());
                    }
                }else{
                    // 7、如果当前一级文件对象是文件夹，则继续递归调用
                    searchFile(file, fileName);
                }
            }
        }
    }


}
