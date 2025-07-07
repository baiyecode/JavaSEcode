package map;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * ClassName: MapDemo2
 * Package: map
 * Description: map集合常用方法
 *
 * @Author 白夜
 * @Create 2025/7/1 15:32
 * @Version 1.0
 */
public class MapDemo2 {
    public static void main(String[] args) {
              // 目标：理解Map集合的常用方法
        Map<String, Integer> map = new HashMap<>();
        map.put("张三", 23); //添加元素
        map.put("王五", 25);
        map.put("赵六", 26);
        map.put("张三", 27);
        System.out.println(map);

        //常用方法
        System.out.println(map.get("张三"));//获取元素
        System.out.println(map.containsKey("张三"));//判断集合中是否包含指定的键,有就返回true
        System.out.println(map.containsValue(23));//判断集合中是否包含指定的值,有就返回true
        System.out.println(map.isEmpty());//判断集合是否为空,集合为空返回true
        System.out.println(map.size());//集合大小
        System.out.println(map.remove("张三"));//删除元素

        //获取所有键的集合
        Set<String> keys = map.keySet();
        for (String key : keys) {
            System.out.println(key);
        }

        //获取所有值的集合
        //使用collection接收是因为值可能重复，所以不能使用Set，set集合不能重复
        Collection<Integer> values = map.values();
        for (Integer value : values) {
            System.out.println(value);
        }

        //清空集合
        map.clear();
        System.out.println(map);


    }
}
