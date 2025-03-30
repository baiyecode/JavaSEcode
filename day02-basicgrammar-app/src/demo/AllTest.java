package demo;

import java.util.Scanner;

/**
 * ClassName: AllTest
 * Package: demo
 * Description: 综合案例
 *
 * @Author 白夜
 * @Create 2025/3/30 16:34
 * @Version 1.0
 */
public class AllTest {
    //开发一个简单的健康计算器应用程序，它可以接受用户的输入(如年龄、性别、体重、身高)，
    // 并计算出用户的BMI(身体质量指数)和基础代谢率(BMR)。
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入您的年龄：");
        int age = sc.nextInt();
        System.out.println("请输入您的性别（男或女）：");
        String sex = sc.next();
        System.out.println("请输入您的体重（千克kg）：");
        double weight = sc.nextDouble();
        System.out.println("请输入您的身高(米）：");
        double height = sc.nextDouble();
        double bmi = BMI(weight, height);
        System.out.println("您的BMI为：" + bmi);
        double bmr = BMR(age, sex, height, weight);
        System.out.println("您的基础代谢率(BMR)为：" + bmr);
    }
    //计算BMI
        public static double BMI(double weight, double height) {
                return weight / (height * height);
            }
    //计算BMR
        public static double BMR(int age, String sex, double height, double weight) {
                double bmr;
                if ("男".equals(sex)) {
                    bmr = 66 + (13.7 * weight) + (5 * height) - (6.8 * age);
                } else {
                    bmr = 655 + (9.6 * weight) + (1.8 * height) - (4.7 * age);
                }
                return bmr;
            }

}

