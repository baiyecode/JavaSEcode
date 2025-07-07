package hashset;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

/**
* ClassName: SetDemo1
* Package: hashset
* Description: 集合的特点
*
* @Author 白夜
* @Create 2025/6/30 15:22
* @Version 1.0
*/public class SetDemo1 {
    public static void main(String[] args) {
        //目标：认识Set家族集合特点
        //Set集合，特点：无序，不重复，无索引。
        //Set<String> set = new HashSet<>();//经典代码 HashSet 无序，不重复，无索引。
        Set<String> set = new LinkedHashSet<>();//LinkedHashSet 有序，不重复，无索引。
        set.add("张三");
        set.add("张三");
        set.add("王五");
        set.add("张三");
        set.add("李四");
        System.out.println(set);


        //TreeSet集合特点
        Set<Double> set1 = new TreeSet<>();//TreeSet 排序（默认大小升序），不重复，无索引。
        set1.add(3.14);
        set1.add(5.0);
        set1.add(1.0);
        set1.add(2.0);
        System.out.println(set1);//[1.0, 2.0, 3.14, 5.0]

        String s1 = "abc";
        String s2 = "cde";
        //同一个对象多次调用hashCode()方法返回的哈希值是相同的。
        //不同的对象，它们的哈希值大概率不相等，但也有可能会相等(哈希碰撞，int范围有限)。
        System.out.println(s1.hashCode());
        System.out.println(s1.hashCode());
        System.out.println(s2.hashCode());
        System.out.println(s2.hashCode());

    }
}
