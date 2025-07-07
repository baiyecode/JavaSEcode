package test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * ClassName: CollectionsDemo2
 * Package: test
 * Description: Collections工具类
 *
 * @Author 白夜
 * @Create 2025/7/4 15:27
 * @Version 1.0
 */
public class CollectionsDemo2 {
    public static void main(String[] args) {
        // 目标：Colllections工具类
        List<String> list = new ArrayList<>();
//        list.add("张无忌");
//        list.add("周芷若");
//        list.add("赵敏");
//        list.add("张强");
//        list.add("张三丰");
//        list.add("张翠山");
        // 1、Collections的方法批量加
        Collections.addAll(list,"张无忌","周芷若","赵敏","张强","张三丰","张翠山");
        System.out.println(list);

        // 2、打乱顺序
        Collections.shuffle(list);
        System.out.println(list);

        //3、排序
        List<Integer> list1 = new ArrayList<>();
        Collections.addAll(list1, 1, 5, 3, 9, 2, 10, 8);
        //Collections.sort(list1);//默认升序
        System.out.println(list1);

        //自定义排序
        Collections.sort(list1,(o1, o2) -> o2 - o1);//降序
        System.out.println(list1);



    }
}
