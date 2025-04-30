package methodreference1;

import java.util.Arrays;

/**
 * ClassName: Demo1
 * Package: methodreference1
 * Description: 静态方法引用
 *
 * @Author 白夜
 * @Create 2025/4/29 17:52
 * @Version 1.0
 */
public class Demo1 {
    public static void main(String[] args) {
        // 静态方法引用
        // 格式： 类名::静态方法名

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

        // 需求:按钮年龄升序排序。可以调用sun公司写好的API直接对数组进行排序
        //Arrays.sort(students, (o1, o2) -> o1.getAge() - o2.getAge());

        //Arrays.sort(students, (o1, o2) -> Student.compareByAge(o1, o2));

        //如果某个Lambda表达式里只是调用一个静态方法，并且“→”前后参数的形式一致，就可以使用静态方法引用
        //静态方法引用 格式： 类名::静态方法名
        Arrays.sort(students, Student::compareByAge);

        //遍历数组中学生对象并输出
        for (int i = 0; i < students.length; i++) {
            Student s = students[i];
            System.out.println(s);
        }

    }
}
