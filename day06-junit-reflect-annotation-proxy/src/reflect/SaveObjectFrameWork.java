package reflect;

import java.io.FileOutputStream;
import java.io.PrintStream;
import java.lang.reflect.Field;

/**
 * ClassName: SaveObjectFrameWork
 * Package: reflect
 * Description: 使用反射做一个简易版的框架
 *
 * @Author 白夜
 * @Create 2025/7/24 16:15
 * @Version 1.0
 */
public class SaveObjectFrameWork {

    //需求：对于任意一个对象，该框架都可以把对象的字段名和对应的值，保存到文件中去。

    //实现步骤
    //1.定义一个方法，可以接收任意对象。
    //2.每收到一个对象后，使用反射获取该对象的Class对象，然后获取全部的成员变量。
    //3.遍历成员变量，然后提取成员变量在该对象中的具体值。
    //4.把成员变量名、和其值，写出到文件中去即可。


    // 保存任意对象的静态方法
    public static void saveObject(Object obj) throws Exception {
        // 创建打印流，刷新管道
        PrintStream ps = new PrintStream(new FileOutputStream("day06-junit-reflect-annotation-proxy\\src\\obj.txt", true));
        // obj 可能是学生  老师  狗
        // 只有反射可以直到对象有多少个字段：
        // 1. 获取Class对象
        Class c = obj.getClass();
        String simpleName = c.getSimpleName();
        ps.println("==============" + simpleName + "====================");
        // 2. 获取Class对象的所有字段。
        Field[] fields = c.getDeclaredFields();// 获取当前类声明的成员变量
        // 3. 遍历字段
        for (Field field : fields) {
            // 4. 获取字段的值
            // 4.1 获取字段名称
            String fieldName = field.getName();

            // 4.2 获取字段的值
            field.setAccessible(true); // 暴力反射
            Object fieldValue = field.get(obj) + "";

            // 5. 打印到文件中去
            ps.println(fieldName + "=" + fieldValue);
        }
        ps.close();// 关闭管道
    }

}
