package innerclass3;

import java.util.Arrays;
import java.util.Comparator;

/**
 * ClassName: Test4
 * Package: innerclass3
 * Description: 数组排序中匿名内部类的使用
 *
 * @Author 白夜
 * @Create 2025/4/26 17:28
 * @Version 1.0
 */
public class Test4 {
    public static void main(String[] args) {
        //目标:完成给数组排序、理解其中名内部类的用法。
        //准备一个学生类型的数组，存放6个学生对象。
        Student[] students = new Student[6];
        students[0] = new Student("赵敏",27,1.68,'女');
        students[1] = new Student("周芷若",20,1.70,'女');
        students[2] = new Student("张无忌",25,1.69,'男');
        students[3] = new Student("赵敏",28,1.68,'女');
        students[4] = new Student("小昭",18,1.68,'女');
        students[5] = new Student("灭绝",35,1.68,'女');

        // 需求:按钮年龄升序排序。可以调用sun公司写好的API直接对数组进行排序
        //public static void sort(T[] a, Comparator<T> c) {
        //      参数一: 需要排序的数组
        //      参数二:需要给sort声明一个Comparator比较器对象(指定排序的规则)
        //      Comparator接口的实现类对象，匿名内部类
        Arrays.sort(students, new Comparator<Student>() {
            //指定排序规则:
            //如果你认为左边对象大于右边对象那么返回正整数。
            //如果你认为左边对象于右边对象那么返回负数。
            //如果两边相等那么返回0。
            @Override
            public int compare(Student o1, Student o2) {
                return o1.getAge() - o2.getAge();//年龄升序排序
                //return o2.getAge() - o1.getAge();//年龄降序排序
            }
        });
        //遍历数组中学生对象并输出
        for (int i = 0; i < students.length; i++) {
            Student s = students[i];
            System.out.println(s);
        }
    }
}
