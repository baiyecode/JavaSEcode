package hashset;

import java.util.HashSet;
import java.util.Set;

/**
 * ClassName: SetDemo2
 * Package: hashset
 * Description: HashSet集合去重操作
 *
 * @Author 白夜
 * @Create 2025/6/30 17:35
 * @Version 1.0
 */
public class SetDemo2 {
    public static void main(String[] args) {
        //目标：掌握HashSet集合去重操作。
        Student s1 = new Student("张三", 18, "北京", "123456");
        Student s2 = new Student("李四", 19, "上海", "989876");
        Student s3 = new Student("张三", 18, "北京", "123456");
        Student s4 = new Student("李四", 19, "上海", "989876");
        //虽然看起来一样，但是这是四个不同的对象

        //如果希望Set集合认为2个内容一样的对象是重复的，
        //必须重写对象的hashCode()和equals()方法
        Set<Student> set = new HashSet<>(); // HashSet 无序，不重复，无索引。
        set.add(s1);
        set.add(s2);
        set.add(s3);
        set.add(s4);
        System.out.println(set);

    }
}
