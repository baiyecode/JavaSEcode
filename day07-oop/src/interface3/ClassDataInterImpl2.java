package interface3;

/**
 * ClassName: ClassDataInterImpl2
 * Package: interface3
 * Description:
 *
 * @Author 白夜
 * @Create 2025/4/23 15:28
 * @Version 1.0
 */
public class ClassDataInterImpl2 implements ClassDataInter{
    //定义第二套实现类，实现接口:实现打印学生信息(男女人数)，实现打印平均分(去掉最高分和最低分)。
    private Student[] students;
    public ClassDataInterImpl2(Student[] students) {
        this.students = students;
    }
    @Override
    public void printAllStudentInfos() {
        //实现打印学生信息(男女人数)
        System.out.println("学生信息如下：");
        int maleCount = 0; //男生人数
        int femaleCount = 0; //女生人数
        for (int i = 0; i < students.length; i++) {
            Student s = students[i];
            System.out.println(s.getName() + "\t" + s.getSex() + "\t" + s.getScore());
            if (s.getSex() == '男') {
                maleCount++;
            } else {
                femaleCount++;
            }
        }
        System.out.println("男:" + maleCount + "人，女:" + femaleCount + "人");


    }

    @Override
    public void printAverageScore() {
        //实现打印平均分(去掉最高分和最低分)
        System.out.println("平均分如下：");
        Student s1 = students[0];
        double sum = 0;
        double max = s1.getScore();
        double min = s1.getScore();
        for (int i = 1; i < students.length; i++) {
            Student s = students[i];
            sum += s.getScore();
            if (s.getScore() > max) {
                max = s.getScore();
            }
            if (s.getScore() < min) {
                min = s.getScore();
            }
        }
        System.out.println("最高分：" + max);
        System.out.println("最低分：" + min);
        System.out.println("平均分：" + (sum - max - min) / (students.length - 2));

    }
}
