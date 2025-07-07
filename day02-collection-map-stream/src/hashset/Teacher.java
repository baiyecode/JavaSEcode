package hashset;

import jdk.jfr.DataAmount;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * ClassName: Teacher
 * Package: hashset
 * Description:
 *
 * @Author 白夜
 * @Create 2025/6/30 18:03
 * @Version 1.0
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Teacher implements Comparable<Teacher>{
    private String name;
    private int age;
    private double salary;//工资

    @Override
    public String toString() {
        return "Teacher{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", salary=" + salary +
                '}' + "\n";
    }

    @Override
    public int compareTo(Teacher o) {
        //按照年龄排序
//        if(this.getAge() > o.getAge()) return 1;
//        if(this.getAge() < o.getAge()) return -1;
//        return 0;
//        return 1;
        //return this.getAge() - o.getAge();//升序
        return o.getAge() - this.getAge();//降序

    }
}
