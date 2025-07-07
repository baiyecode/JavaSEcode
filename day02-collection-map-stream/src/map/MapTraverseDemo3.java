package map;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * ClassName: MapTraverseDemo3
 * Package: map
 * Description: map集合的遍历方式一：键找值
 *
 * @Author 白夜
 * @Create 2025/7/1 15:47
 * @Version 1.0
 */
public class MapTraverseDemo3 {
    public static void main(String[] args) {
        //目标：掌握Map集合的遍历方式一：键找值。
        // 1、创建Map集合
        Map<String, Integer> map = new HashMap<>();
        map.put("嫦娥", 20);
        map.put("女儿国王", 31);
        map.put("嫦娥", 28);
        map.put("铁扇公主", 38);
        map.put("紫霞", 31);
        System.out.println(map); // {嫦娥=28, 铁扇公主=38, 紫霞=31, 女儿国王=31}
        //简化写法：键找值
        //for (String key : map.keySet()) {
        //    Integer value = map.get(key);
        //    System.out.println(key + "=" + value);
        //}
        //2、获取所有的键
        Set<String> keys = map.keySet();
        //3、遍历键
        for (String key : keys) {
            //4、根据键获取值
            Integer value = map.get(key);
            System.out.println(key + "=" + value);
        }



    }
}
