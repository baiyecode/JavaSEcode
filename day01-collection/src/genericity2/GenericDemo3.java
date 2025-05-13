package genericity2;

import genericity.MyArrayList;

/**
 * ClassName: GenericDemo3
 * Package: genericity2
 * Description: 泛型接口
 *
 * @Author 白夜
 * @Create 2025/5/13 20:28
 * @Version 1.0
 */
public class GenericDemo3 {
    public static void main(String[] args) {
        // 目标:搞清楚泛型接口的基本作用
        // 需求:项目需要对学生数据/老师数据都要进行增删改查操作
        StudentData studentData = new StudentData();
        studentData.add(new Student());
        studentData.remove(new Student());
        studentData.update(new Student());
        Student s = studentData.query(1);
    }
}
