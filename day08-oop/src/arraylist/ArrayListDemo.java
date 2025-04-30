package arraylist;

import java.util.ArrayList;

/**
 * ClassName: ArrayListDemo
 * Package: arraylist
 * Description: ArrayList集合的使用
 *
 * @Author 白夜
 * @Create 2025/4/30 16:24
 * @Version 1.0
 */
public class ArrayListDemo {
    public static void main(String[] args) {
        //目标:掌握ArrayList集合的基本使用
        //创建ArrayList对象，代表一个集合容器
        //添加泛型，指定集合中存储的数据类型 <String>
        ArrayList<String> list = new ArrayList<>();
        //1、添加数据
        list.add("张三");
        list.add("李四");
        //list.add(123);//错误，不能添加
        list.add("王五");
        list.add("赵六");
        System.out.println(list);
        //2、查找数据
        String s = list.get(2);//获取索引为2的元素
        System.out.println(s);

        //遍历集合
        for (int i = 0; i < list.size(); i++) {
            //0,1,2,3
            String s1 = list.get(i);
            System.out.println(s1);
        }

        //3、删除数据
        list.remove(1);//根据索引删除
        System.out.println(list);

        list.remove("王五");//根据元素直接删除
        System.out.println(list);

        //4、修改数据
        list.set(1,"赵四");//根据索引修改
        System.out.println(list);
    }
}
