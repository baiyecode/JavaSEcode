package genericity4;

import java.util.ArrayList;
import java.util.Objects;

/**
 * ClassName: GenericDemo5
 * Package: genericity4
 * Description: 包装类
 *
 * @Author 白夜
 * @Create 2025/5/13 21:47
 * @Version 1.0
 */
public class GenericDemo5 {
    public static void main(String[] args) {
        // 目标:搞清楚泛型和集合不支持基本数据类型，只能支持对象类型(引用数据类型)。
        //ArrayList<int> list = new ArrayList<>();
        //编译时：泛型类型会被检查，确保类型安全。
        //运行时：所有泛型类型信息会被擦除，替换为 Object 类型
        //基本数据类型（如 int）不是对象，无法被 Object 引用。
        //list.add(12);
        //Object o = 12;


        //把基本数据类型变成包装类对象。
        //手工包装:
        //Integer i = new Integer(12);//过时
        //valueOf()里面已经封装缓存好一部分的对象了。
        // 已经封装好-128到127的Integer对象。可以直接拿，都是一样的，地址也一样,超过了才会新建
        Integer i1 = Integer.valueOf(12);
        Integer i2 = Integer.valueOf(12);
        System.out.println(i1 == i2);//true

        Integer i11 = Integer.valueOf(150);
        Integer i22 = Integer.valueOf(150);
        System.out.println(i11 == i22);//false


        //自动装箱: 自动将基本数据类型转换为对应的包装类对象。
        Integer a1 = 12;
        Integer a2 = 12;
        System.out.println(a1 == a2);//true
        Integer a11 = 150;
        Integer a22 = 150;
        System.out.println(a11 == a22);//false

        //自动拆箱: 自动将包装类对象转换为基本数据类型。
        int i = a1;
        System.out.println(i);

        ArrayList<Integer> list = new ArrayList<>();
        list.add(150);//自动装箱
        list.add(12);

        int i3 = list.get(0);//自动拆箱

        System.out.println("======================");

        //包装类的功能
        //1、把基本数据类型转换为字符串。
        int j = 12;
        String str = Integer.toString(j);// "12"
        System.out.println(str + 1);//121

        Integer i5 = j;//自动装箱
        String s1 = i5.toString();// "12"
        System.out.println(s1 + 1);//121

        //也可以用字符串拼接的方式。直接加空格
        String s = j + "";

        System.out.println("======================");

        //2、把字符串转换为基本数据类型。
        String s2 = "12";
        //String s2 = "12aaa";//转换失败,会报数字转换异常。
        //int i4 = Integer.parseInt(s2);
        //每个对象类型的parseXXX()方法，都是把字符串转换为对应的基本数据类型。都不一样
        //不如直接用valueOf()
        int i4 = Integer.valueOf(s2);
        System.out.println(i4 + 1);//13

        String s3 = "99.4";
        //double d = Double.parseDouble(s3);
        double d = Double.valueOf(s3);
        System.out.println(d + 1);//100.4
    }
}
