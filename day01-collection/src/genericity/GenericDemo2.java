package genericity;

/**
 * ClassName: GenericDemo2
 * Package: genericity
 * Description: 泛型类
 *
 * @Author 白夜
 * @Create 2025/5/13 20:08
 * @Version 1.0
 */
public class GenericDemo2 {
    public static void main(String[] args) {
        //自定义泛型类
        //需求:请您模拟ArrayList集合自定义一个集合MyArrayList.
        MyArrayList<String> list = new MyArrayList<>();
        list.add("张三");
        list.add("王五");
        list.add("李四");
        list.remove("张三");
        System.out.println(list);
    }
}
