package map;

import java.util.*;

/**
 * ClassName: MapTest6
 * Package: map
 * Description: 综合案例
 *
 * @Author 白夜
 * @Create 2025/7/2 15:26
 * @Version 1.0
 */
public class MapTest6 {
    public static void main(String[] args) {
        //案例：某个班级80名学生，现在需要组织秋游活动，
        //班长提供了四个景点依次是（A、B、C、D）,每个学生只能选择一个景点，
        //请统计出最终哪个景点想去的人数最多。

        //分析：将80个学生选择的数据拿到程序中去，[A, A, B , A, B,  C, D, ...]
        //准备一个Map集合用于存储统计的结果，Map<String，Integer>，键是景点，值代表投票数量。
        //遍历80个学生选择的景点，每遍历一个景点，就看Map集合中是否存在该景点，不存在存入“景点=1“，存在则其对应值+1 
        calc();
    }

    private static void calc() {
        // 1、把80个学生选择的景点数据拿到程序中来，才可以统计。
        List<String> locations = new ArrayList<>();
        String[] names = {"玉龙雪山", "长城", "少林寺", "丽江"};
        Random r = new Random();//创建随机数对象
        for (int i = 1; i <= 80; i++) {
            int index = r.nextInt(names.length); // 0  1  2  3
            locations.add(names[index]);
        }
        System.out.println(locations);

        // 2、统计每个景点被选择的次数

        // 最终统计的结果是一个键值对的形式，所以可以考虑定义一个Map集合来统计结果。
        Map<String, Integer> map = new HashMap<>(); // map = { }

        for (String location : locations) {
            // 判断当前景点是否已经存在
            if (map.containsKey(location)) {
                //Integer count = map.get(location);
                //count++;
                //map.put(location, count);
                // 这个景点之前出现过，其值+1
                map.put(location, map.get(location) + 1);
            } else {
                // 这个景点之前没有出现过，第一次出现，值为1
                map.put(location, 1);
            }
            // 简化写法！
            //map.put(location, map.containsKey(location) ? map.get(location) + 1 : 1);
        }

        map.forEach((k, v) -> System.out.println(k + "被选择了" + v + "次"));
    }
}
