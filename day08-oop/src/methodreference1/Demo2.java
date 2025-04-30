package methodreference1;

import java.util.Arrays;

/**
 * ClassName: Demo2
 * Package: methodreference1
 * Description: 实例方法引用
 *
 * @Author 白夜
 * @Create 2025/4/29 18:07
 * @Version 1.0
 */
public class Demo2 {
    public static void main(String[] args) {
        // 实例方法引用
        // 格式： 对象名::实例方法

        test1();
    }

    public static void test1() {
        //准备一个学生类型的数组，存放6个学生对象。
        Student[] students = new Student[6];
        students[0] = new Student("赵敏",27,1.68,'女');
        students[1] = new Student("周芷若",20,1.70,'女');
        students[2] = new Student("张无忌",25,1.69,'男');
        students[3] = new Student("赵敏",28,1.68,'女');
        students[4] = new Student("小昭",18,1.68,'女');
        students[5] = new Student("灭绝",35,1.68,'女');

        //  需求: 按身高升序排序
        Student t = new Student();
        //Arrays.sort(students, (o1, o2) -> t.compareByHeight(o1, o2));
        //如果某个Lambda表达式里只是通过对象名称调用一个实例方法，并且“→”前后参数的形式一致，就可以使用实例方法引用。
        //实例方法引用
        //格式： 对象名::实例方法
        Arrays.sort(students, t::compareByHeight);



        //遍历数组中学生对象并输出
        for (int i = 0; i < students.length; i++) {
            Student s = students[i];
            System.out.println(s);
        }

    }

}
