package object;

/**
 * ClassName: Student
 * Package: object
 * Description: 面向对象案例
 *
 * @Author 白夜
 * @Create 2025/4/9 20:12
 * @Version 1.0
 */
public class Student {
    //学生类，记录属性
    //封装:把数据和对数据的处理放到同一个类中去
     String name;
     double Chinese;
     double Math;
     public void printAllScore(){
         System.out.println(name + "的总成绩是" + (Chinese+ Math));

     }
     public void printAverageScore(){
         System.out.println(name + "的平均成绩是" + (Chinese+ Math) / 2);
     }

}
