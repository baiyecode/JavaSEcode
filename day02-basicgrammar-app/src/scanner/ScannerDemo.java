package scanner;
//1、导包,告诉我们自己的程序，去JDK哪里找Scanner程序用
import java.util.Scanner;

/**
 * ClassName: ScannerDemo
 * Package: scanner
 * Description:输入输出
 *
 * @Author 白夜
 * @Create 2025/3/29 20:42
 * @Version 1.0
 */
public class ScannerDemo {
    public static void main(String[] args) {
        print();
    }
    //需求:我是一个零基础小白，请帮我写一个程序，可以让用户键盘输入用户名和年龄，然后打印出来
    public static void print(){
        //2.创建对象（抄写这一行代码，得到一个Scanner扫描器对象)
        Scanner sc = new Scanner(System.in);
        //3.获取用户输入的内容
        //让程序在这一行暂停，等到用户输入一个字符串名称，直到按了回车键之后，把名字交给变量name记住再往下走
        System.out.println("请输入用户名：");
        String name = sc.next();
        //让程序在这一行暂停，等到用户输入一个整数，直到按了回车键之后，把名字交给变量age记住再往下走
        System.out.println("请输入年龄：");
        int age = sc.nextInt();
        //4.打印输出
        System.out.println("用户名：" + name + "，年龄：" + age);
    }


}
