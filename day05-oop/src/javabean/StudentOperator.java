package javabean;

/**
 * ClassName: StudentOperator
 * Package: javabean
 * Description:
 *
 * @Author 白夜
 * @Create 2025/4/11 16:08
 * @Version 1.0
 */
public class StudentOperator {
        // 实体类在开发中的应用场景。
        //创建一个学生的操作对象专门负责对学生对象的数据进行业务处理。
    private Student s;// 记录要操作使用的学生对象
    //有参数构造器
    public StudentOperator(Student s){
        this.s = s;
    }

    //打印学生总成绩
    public void printAllScore(){
        System.out.println(s.getName()+"的总成绩为："+(s.getChinese()+s.getMath()));
    }

    //打印学生平均成绩
    public void printAverageScore(){
        System.out.println(s.getName()+"的平均成绩为："+(s.getChinese()+s.getMath())/2);
    }

}
