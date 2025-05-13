package exception;

import java.util.Scanner;

/**
 * ClassName: ExceptionDemo6
 * Package: exception
 * Description:
 *
 * @Author 白夜
 * @Create 2025/5/12 21:47
 * @Version 1.0
 */
public class ExceptionDemo6 {
    public static void main(String[] args) {
        //异常处理方案2
        //最外层捕获异常后，尝试重新修复

        //接受用户的一个定价
        System.out.println("程序开始...");
        while (true) {
            try {
                outputPrice();
                System.out.println("价格是：" + outputPrice());
                break;
            } catch (Exception e) {
                System.out.println("价格输入有误，请重新输入：");
            }
        }
        System.out.println("程序结束...");
    }
    public static double outputPrice(){
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入价格：");
        double price = sc.nextDouble();
        return price;


    }
}
