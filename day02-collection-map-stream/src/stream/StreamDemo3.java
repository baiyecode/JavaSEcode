package stream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

/**
 * ClassName: StreamDemo3
 * Package: stream
 * Description: 常用方法
 *
 * @Author 白夜
 * @Create 2025/7/3 15:20
 * @Version 1.0
 */
public class StreamDemo3 {
    public static void main(String[] args) {
        // 目标：掌握Stream提供的常用的中间方法，对流上的数据进行处理（返回新流：支持链式编程）
        List<String> list = new ArrayList<>();
        list.add("张无忌");
        list.add("周芷若");
        list.add("赵敏");
        list.add("张强");
        list.add("张三丰");
        list.add("张翠山");

        //1、过滤方法  filter
        list.stream().filter(name -> name.startsWith("张") && name.length() == 3).forEach(name -> System.out.println(name));

        //2、排序方法
        List<Double> list1 = new ArrayList<>();
        list1.add(1.0);
        list1.add(5.0);
        list1.add(3.0);
        list1.add(3.0);
        list1.add(2.0);
        list1.add(4.0);
        list1.add(4.0);
        list1.stream().sorted().forEach(num -> System.out.println(num));//默认升序
        //list1.stream().sorted().forEach(System.out::println);//简化
        System.out.println("----------------------------------");
        list1.stream().sorted((s1, s2) -> Double.compare(s2, s1)).forEach(System.out::println);//降序

        System.out.println("----------------------------------");

        //排序后获取前几个元素
        list1.stream().sorted().limit(2).forEach(System.out::println);
        System.out.println("----------------------------------");

        //排序后跳过几个元素
        list1.stream().sorted().skip(3).forEach(System.out::println);

        System.out.println("----------------------------------");

        //去除流中重复元素
        // 如果希望自定义对象能够去重复，重写对象的hashCode和equals方法，才可以去重复！
        list1.stream().sorted().distinct().forEach(System.out::println);

        System.out.println("----------------------------------");

        // 映射/加工方法： 把流上原来的数据拿出来变成新数据又放到流上去。
        list1.stream().sorted().map(s -> "加10分后：" + (s + 10)).forEach(System.out::println);

        System.out.println("----------------------------------");
        //合并流 concat 只能合并两个
        Stream<String> s1 = Stream.of("张三丰", "张无忌", "张翠山", "张良", "张学友");
        Stream<Integer> s2 = Stream.of(111, 22, 33, 44);
        Stream<Object> s3  = Stream.concat(s1, s2);//合并
        System.out.println(s3.count());




    }
}
