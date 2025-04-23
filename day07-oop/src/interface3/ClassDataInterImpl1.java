package interface3;

/**
 * ClassName: ClassDataInterImpl1
 * Package: interface3
 * Description:
 *
 * @Author 白夜
 * @Create 2025/4/23 15:26
 * @Version 1.0
 */
public class ClassDataInterImpl1 implements ClassDataInter{

    //定义第一套实现类，实现接口:实现打印学生信息，实现打印平均分。
    private Student[] students;
    public ClassDataInterImpl1(Student[] students) {
        this.students = students;
    }
    @Override
    public void printAllStudentInfos() {
        System.out.println("全班信息如下：");
        for (int i = 0; i < students.length; i++) {
            Student s = students[i];
            System.out.println(s.getName() + "\t" + s.getSex() + "\t" + s.getScore());
        }

    }

    @Override
    public void printAverageScore() {
        System.out.println("全班平均成绩为：");
        double sum = 0;
        for (int i = 0; i < students.length; i++) {
            Student s = students[i];
            sum += s.getScore();
        }
        System.out.println("全班评均分为：" + sum / students.length);

    }
}
