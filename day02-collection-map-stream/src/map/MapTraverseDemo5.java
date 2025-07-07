package map;

import java.util.HashMap;
import java.util.Map;
import java.util.function.BiConsumer;

/**
 * ClassName: MapTraverseDemo5
 * Package: map
 * Description:map集合的遍历方式三：Lambda
 *
 * @Author 白夜
 * @Create 2025/7/1 16:07
 * @Version 1.0
 */
public class MapTraverseDemo5 {
    public static void main(String[] args) {
        //目标：掌握Map集合的遍历方式三：Lambda。
        Map<String,Integer> map = new HashMap<>();
        map.put("嫦娥", 20);
        map.put("女儿国王", 31);
        map.put("嫦娥", 28);
        map.put("铁扇公主", 38);
        map.put("紫霞", 31);
        System.out.println(map); // {嫦娥=28, 铁扇公主=38, 紫霞=31, 女儿国王=31}


        //1、直接调用Map集合的forEach方法完成遍历
        //map.forEach(new BiConsumer<String, Integer>() {
        //    @Override
        //    public void accept(String key, Integer value) {
        //        System.out.println(key + "=" + value);
        //    }
        //});
        //2、Lambda表达式
        map.forEach((key,value)->{
            System.out.println(key + "=" + value);
        });

    }
}
