package branch;

import java.util.Scanner;

/**
 * ClassName: IfDemo
 * Package: branch
 * Description:if分支结构
 *
 * @Author 白夜
 * @Create 2025/4/2 20:10
 * @Version 1.0
 */
public class IfDemo {
    public static void main(String[] args) {
        print1();
        print2();
        print3();

    }
    // 目标:认识if语句，搞清楚其写法和应用场景。(独立功能独立成方法)
    //第一种格式
    public static void print1() {
        int age  = 12;
        // if(条件表达式)后面不要加;加了就不能控制后面代码
        if (age >= 18) {
            System.out.println("已成年");
        }
        System.out.println("可以玩游戏");
        // 注意:if语句中如果只有一行代码，大括号可以省略不写,但是只能控制后面紧跟的一行代码
        //if (age >= 18)
        //    System.out.println("已成年");
    }
    //第二种格式
    // 需求:假如您的钱包金额是90元，现在要转出去80元，请用if分支实现
    // 要求:钱够就提示转账成功，钱不够提示余额不足
    public static void print2() {
        int money = 10;
        if (money >= 80) {
            System.out.println("转账成功");
        } else {
            System.out.println("余额不足");
        }
    }
    //第三种格式
    // 需求:有个绩效系统，每个月由主管给员工打分，
    // 会输出你这个月的绩效级别:A+ A B C D
    // 级别的区间情况:A+ 90-100 A 80-90 B 70-80 C 60-70 D 0-60
    public static void print3() {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入你的绩效分数");
        int score = sc.nextInt();
        if (score >= 90 && score <= 100) {
            System.out.println("A+");
        } else if (score >= 80 && score < 90) {
            System.out.println("A");
        } else if (score >= 70 && score < 80) {
            System.out.println("B");
        } else if (score >= 60 && score < 70) {
            System.out.println("C");
        } else if (score >= 0 && score < 60) {
            System.out.println("D");
        }
        else {
            System.out.println("输入有误");
        }
    }



}
