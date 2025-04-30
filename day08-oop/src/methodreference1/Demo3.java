package methodreference1;

import java.util.Arrays;

/**
 * ClassName: Demo3
 * Package: methodreference1
 * Description: 特定类的方法引用
 *
 * @Author 白夜
 * @Create 2025/4/29 19:52
 * @Version 1.0
 */
public class Demo3 {
    public static void main(String[] args) {
        // 目标:特定类型的方法引用。
        //需求:有一个字符申数组，里面有一些人的名字都是，英文名称，请按照名字的首字母升序排序。
        String[] names = {"Tom", "Jerry", "caocao","andy", "Jack", "Bobi","Tony","Angela","曹操"};
        //把数组进行排序
        //Arrays.sort(names);// 默认按照ASCII排序，按照首字母升序排序
        //System.out.println(Arrays.toString(names));
        //要求:忽略首字母的大小进行升序排序(java官方默认是搞不定的，需要我们自己指定比较规则)
        //Arrays.sort(names, new Comparator<String>() {
        //    @Override
        //    public int compare(String o1, String o2) {
        //        return o1.compareToIgnoreCase(o2);// String类型的方法，忽略大小写进行排序
        //    }
        //});

        //lambda表达式简化
        //Arrays.sort(names,(o1,o2) -> o1.compareToIgnoreCase(o2) );

        //特定类型（String)的方法引用。
        //如果某个Lambda表达式里只是调用一个特定类型的实例方法，并且前面参数列表中的第一个参数是作为方法的主调，
        //后面的所有参数都是作为该实例方法的入参的，则此时就可以使用特定类型的方法引用。
        Arrays.sort(names,String::compareToIgnoreCase);





        System.out.println(Arrays.toString(names));


    }

}

