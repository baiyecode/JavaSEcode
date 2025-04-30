package methodreference1;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * ClassName: Student
 * Package: innerclass3
 * Description:
 *
 * @Author 白夜
 * @Create 2025/4/29 17:57
 * @Version 1.0
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Student {
    private String name;
    private int age;
    private double height;
    private char sex;


    //静态方法
    public static int compareByAge(Student o1, Student o2) {
         return o1.getAge() - o2.getAge();

    }

    //实例方法
    public int compareByHeight(Student o1, Student o2) {
        //按照高度升序排序
        //使用Double.compare()方法比较两个double值返回int类型（+1，-1）
        return Double.compare( o1.getHeight(),o2.getHeight());

    }
}