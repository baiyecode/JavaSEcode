package interface3;

/**
 * ClassName: Test
 * Package: interface3
 * Description: 接口综合案例
 *
 * @Author 白夜
 * @Create 2025/4/23 15:12
 * @Version 1.0
 */
public class Test {
    public static void main(String[] args){
        // 目标:完成接口的小案例。
        //1、定义学生类，创建学生对象，封装学生数据，才能交给别人处理学生的数据
        //2、准备学生数据,目前我们自己造一些测试数据
        Student[] allStudents = new Student[10];
        allStudents[0] = new Student("小明",'男',100);
        allStudents[1] = new Student("小红",'女',90);
        allStudents[2] = new Student("小花",'女',80);
        allStudents[3] = new Student("小黄",'男',70);
        allStudents[4] = new Student("小绿",'男',60);
        allStudents[5] = new Student("小蓝",'女',50);
        allStudents[6] = new Student("小紫",'女',40);
        allStudents[7] = new Student("小黑",'男',30);
        allStudents[8] = new Student("小灰",'男',20);
        allStudents[9] = new Student("小粉",'女',10);


        //3、提供两套业务实现方案，支持灵活切换(解合)
        //定义一个接口(规范思想):必须完成打印全班学生信息，打印平均分。(ClassDataInter)
        //定义第一套实现类，实现接口:实现打印学生信息，实现打印平均分。
        //定义第二套实现类，实现接口:实现打印学生信息(男女人数)，实现打印平均分(去掉最高分和最低分)。
        ClassDataInterImpl1 cd1 = new ClassDataInterImpl1(allStudents);
        cd1.printAllStudentInfos();
        cd1.printAverageScore();
        System.out.println("======================================");
        ClassDataInterImpl2 cd2 = new ClassDataInterImpl2(allStudents);
        cd2.printAllStudentInfos();
        cd2.printAverageScore();

    }
}
