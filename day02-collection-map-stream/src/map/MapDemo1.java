package map;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

/**
 * ClassName: MapDemo1
 * Package: map
 * Description: Map集合
 *
 * @Author 白夜
 * @Create 2025/7/1 15:21
 * @Version 1.0
 */
public class MapDemo1 {
    public static void main(String[] args) {
        // 目标：认识Map集合的体系特点。
        // 1、创建Map集合
        // Map特点/HashMap特点：无序，不重复，无索引，键值对都可以是null, 值不做要求（可以重复）
        // LinkedMap特点：有序，不重复，无索引，键值对都可以是null, 值不做要求（可以重复）
        // TreeMap: 按照键可排序，不重复，无索引,键不允许为 null，但值可以为 null
        //Map<String, Integer> map = new HashMap<>();//无序，不重复，无索引
        Map<String,Integer> map = new LinkedHashMap<>();//有序，不重复，无索引
        map.put("张三", 23);
        map.put("王五", 25);
        map.put("赵六", 26);
        map.put("张三", 27);//键重复,值会覆盖
        map.put(null,null);//可以是 null
        System.out.println(map);

    }
}
