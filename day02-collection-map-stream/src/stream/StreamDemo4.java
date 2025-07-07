package stream;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * ClassName: StreamDemo4
 * Package: stream
 * Description: 终结方法
 *
 * @Author 白夜
 * @Create 2025/7/3 16:22
 * @Version 1.0
 */
public class StreamDemo4 {
    public static void main(String[] args) {
        // 目标：掌握Stream流的统计，收集操作（终结方法）
        List<Teacher> teachers = new ArrayList<>();
        teachers.add(new Teacher("张三", 23, 5000));
        teachers.add(new Teacher("金毛狮王", 54, 16000));
        teachers.add(new Teacher("李四", 24, 6000));
        teachers.add(new Teacher("王五", 25, 7000));
        teachers.add(new Teacher("白眉鹰王", 66, 108000));
        teachers.add(new Teacher("陈昆", 42, 48000));

        //对此流运算后的元素进行遍历
        teachers.stream().filter(t -> t.getSalary() > 15000).forEach(System.out::println);

        System.out.println("--------------------------------------------------");

        //统计此流运算后的元素个数
        long count = teachers.stream().filter(t -> t.getSalary() > 15000).count();
        System.out.println(count);

        System.out.println("--------------------------------------------------");
        //获取薪水最高的老师
        Optional<Teacher> max = teachers.stream().max((t1, t2) -> Double.compare(t1.getSalary(), t2.getSalary()));
        Teacher maxTeacher = max.get();
        System.out.println(maxTeacher);
        //获取薪水最低的老师
        Optional<Teacher> min = teachers.stream().min((t1, t2) -> Double.compare(t1.getSalary(), t2.getSalary()));
        Teacher minTeacher = min.get();
        System.out.println(minTeacher);

        System.out.println("--------------------------------------------------");

        List<String> list = new ArrayList<>();
        list.add("张无忌");
        list.add("周芷若");
        list.add("赵敏");
        list.add("张强");
        list.add("张三丰");
        list.add("张三丰");
        list.add("张翠山");

        // 流只能收集一次

        // 收集到集合或者数组中去。

        //收集到list集合
        Stream<String> s1 = list.stream().filter(name -> name.startsWith("张"));
        List<String> List1 = s1.collect(Collectors.toList());
        System.out.println(List1);//[张无忌, 张强, 张三丰, 张三丰, 张翠山] list集合可以重复

        //收集到set集合
        Stream<String> s2 = list.stream().filter(name -> name.startsWith("张"));
        Set<String> set1 = s2.collect(Collectors.toSet());
        System.out.println(set1);//[张无忌, 张强, 张三丰, 张翠山] set集合不能重复

        //收集到数组中
        Stream<String> s3 = list.stream().filter(name -> name.startsWith("张"));
        Object[] array = s3.toArray();
        System.out.println("数组: " + Arrays.toString(array));

        System.out.println("===========================");

        //收集到map集合中 :键是老师名称，值是老师薪水
        Map<String, Double> map = teachers.stream().collect(Collectors.toMap(Teacher::getName, Teacher::getSalary));
        System.out.println(map);  //map集合是无序的
        //{李四=6000.0, 张三=5000.0, 王五=7000.0, 白眉鹰王=108000.0, 金毛狮王=16000.0, 陈昆=48000.0}



    }
}
