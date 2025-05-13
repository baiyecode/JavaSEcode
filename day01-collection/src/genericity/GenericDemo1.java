package genericity;

import java.util.ArrayList;

/**
 * ClassName: GenericDemo1
 * Package: genericity
 * Description: 泛型
 *
 * @Author 白夜
 * @Create 2025/5/13 17:26
 * @Version 1.0
 */
public class GenericDemo1 {
    public static void main(String[] args) {
        //认识泛型，理解泛型的作用
        //格式：<E>
        //泛型提供了在编译阶段约束所能操作的数据类型，并自动进行检查的能力，
        //这样可以避免强制类型转换，及其可能出现的异常。
        ArrayList<String> list = new ArrayList<>();
        list.add("hello");
        list.add("world");
        //list.add(10);
        //list.add(true);
        //list.add(new Person());
        //list.add(23.89);
        //list.add('a');



    //获取数据
    for (int i = 0; i < list.size(); i++) {
        //Object o = list.get(i);
        //强制类型转换
        //String s = (String) o;
        //System.out.println(o);

        String s = list.get(i);
        System.out.println(s);

    }

    }
}
