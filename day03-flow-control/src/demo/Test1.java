package demo;

import java.util.Scanner;

/**
 * ClassName: Test1
 * Package: demo
 * Description: 案例1：简易计算器
 *
 * @Author 白夜
 * @Create 2025/4/3 19:46
 * @Version 1.0
 */
public class Test1 {
    public static void main(String[] args) {
        //简易计算器开发
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入第一个数字:");
        double num1 = scanner.nextDouble();
        System.out.println("请输入第二个数字:");
        double num2 = scanner.nextDouble();
        System.out.println("请输入运算符(+、-、*、/):");
        String operator = scanner.next();
        double result = calculator(num1, num2, operator);
        System.out.println("运算结果为:" + result);



    }
    //目标: 设计一个可以执行基本数学运算(加、减、乘、除)的计算器程序
    //功能描述:
    //用户输入两个数字一个运算符(+、-、*、/)，
    //根据所选运算符执行相应的数学运算，显示运算结果。
    public static double calculator(double num1, double num2, String operator) {
        double result = 0;
        switch (operator) {
            case "+":
                result = num1 + num2;
                break;
            case "-":
                result = num1 - num2;
                break;
            case "*":
                result = num1 * num2;
                break;
            case "/":
                if (num2 == 0) {
                    System.out.println("除数不能为0");
                    return 0;
                }else {
                    result = num1 / num2;
                }
                break;
            default:
                System.out.println("运算符输入错误");
        }
        return result;
    }

}
