package array;

import java.util.Scanner;

/**
 * ClassName: ArrayDemo2
 * Package: array
 * Description: 一维数组的动态初始化
 *
 * @Author 白夜
 * @Create 2025/4/5 20:30
 * @Version 1.0
 */
public class ArrayDemo2 {
    public static void main(String[] args) {
        //动态初始化数组
        print();
    }
    //假设班级有8名学生，请帮我开发程序可以录入8名学生的Java成绩
    //成绩类型是小数，并输出平均分，最高分和最低分，
    public static void print() {
        //1、定义数组,动态初始化，只确定数组的长度和类型，数组元素值不确定
        //数据类型[] 数组名 = new 数据类型[数组的长度];
        double[] scores = new double[8];
        Scanner sc = new Scanner(System.in);
        //2、遍历数组，让用户输入8个学生成绩
        for (int i = 0; i < scores.length; i++) {
            //i=0,1,2,3,4,5,6,7
            System.out.println("请输入第" + (i + 1) + "个学生的成绩");
            scores[i] = sc.nextDouble();
        }
        //输出平均分
        double allScore = scores[0];//总分
        double max = scores[0];//最高分
        double min = scores[0];//最低分
        for (int i = 1; i < scores.length; i++) {
            //i=1,2,3,4,5,6,7
            double score = scores[i];
            allScore += score;

            if (scores[i] > max) {
                max = scores[i];
            }

            if (scores[i] < min) {
                min = scores[i];
            }
        }
        System.out.println("平均分是：" + allScore / scores.length);
        System.out.println("最高分是：" + max);
        System.out.println("最低分是：" + min);

    }

}
