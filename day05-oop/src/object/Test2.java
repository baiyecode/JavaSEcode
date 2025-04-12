package object;

/**
 * ClassName: Test2
 * Package: object
 * Description:
 *
 * @Author 白夜
 * @Create 2025/4/9 20:14
 * @Version 1.0
 */
public class Test2 {
    public static void main(String[] args) {
        //请用面向对象编程的方式，存储如下两个学生的信息,并要求打印出每个学生的总成绩和平均成绩
        Student s1 = new Student();
        s1.name = "播妞";
        s1.Chinese = 100;
        s1.Math = 100;
        s1.printAllScore();
        s1.printAverageScore();
        System.out.println(s1);//对象地址




        Student s2 = new Student();
        s2.name = "播仔";
        s2.Chinese = 90;
        s2.Math = 70;
        s2.printAllScore();
        s2.printAverageScore();
        System.out.println(s2);

    }

}
