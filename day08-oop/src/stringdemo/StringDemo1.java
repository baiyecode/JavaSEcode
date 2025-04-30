package stringdemo;

import java.util.Scanner;

/**
 * ClassName: StringDemo1
 * Package: stringdemo
 * Description: 常用API String
 *
 * @Author 白夜
 * @Create 2025/4/30 15:32
 * @Version 1.0
 */
public class StringDemo1 {
    public static void main(String[] args) {
        //目标:掌握创建字符串对象，封装要处理的字符串数据，调用String提供的方法处理字符串。
        //1、推荐方式一: 直接“”就可以创建字符串对象，封装字符串数据。
        String s1 = "hello";
        System.out.println(s1);
        //System.out.println(s1.toString()); //String里已经重写了toString()方法
        System.out.println(s1.length());


        // 2、方式二:通过构造器初始化对象。
        String s2 = new String();//不推荐
        System.out.println(s2);//空字符串 ""

        String s3 = new String("hello");//不推荐
        System.out.println(s3);//hello

        char[] chs = {'h', 'e', 'l', 'l', 'o'};
        String s4 = new String(chs);
        System.out.println(s4);//hello

        byte[] bts = {97, 98, 99, 100, 101}; //ASCII码
        String s5 = new String(bts);
        System.out.println(s5);//abcde

        System.out.println("======================");
        //只有“”给出的字符串对象放在字符串常量池，相同内容只放一个。地址一样
        String s6 = "hello";
        String s7 = "hello";
        System.out.println(s6 == s7);//true

        //通过new方式创建字符串对象，每new一次都会产生一个新的对象放在堆内存中。地址不一样
        String s8 = new String("hello");
        String s9 = new String("hello");
        System.out.println(s8 == s9);//false


        System.out.println("======================");
        // 调用字符串的方法，处理字符串数据。
        // 简易版的登录
        String okusername = "admin";
        System.out.println("请输入用户名:");
        Scanner sc = new Scanner(System.in);
        String username = sc.next();

        //字符串对象的内容比较，千万不要用==,==默认比较地址，字符串对象的内容一样时地址不一定一样
        //判断你字符串内容，建议大家用String提供的equals方法，只关心内容一样，就返回true,不关心地址。
        if (username.equals(okusername)){
            System.out.println("登录成功");
        }else {
            System.out.println("登录失败");
        }


        System.out.println("======================");

        //12345678910 --> 123****8910
        System.out.println("请输入手机号:");
        String phone = sc.next();

        System.out.println("下面的手机号码已登录：");
        //substring(int beginIndex,int endIndex) 根据开始和结束索引进行截取，得到新的字符串(包前不包后)-->0,1,2
        //substring(int beginIndex) 从传入的索引处截取，截取到末尾，得到新的字符串返回
        String newPhone = phone.substring(0,3) + "****" + phone.substring(7);
        System.out.println(newPhone);


    }

}
