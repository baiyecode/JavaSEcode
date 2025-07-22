package api;

/**
 * ClassName: Test2
 * Package: api
 * Description: 字符串的高效操作方案
 *
 * @Author 白夜
 * @Create 2025/7/22 15:57
 * @Version 1.0
 */
public class Test2 {
    public static void main(String[] args) {
        // 目标：高效拼接字符串。
        // + 号拼接字符串内容，如果是大量拼接，效率极差！
        // String的对象时不可变变量： 共享数据性能可以，但是修改数据性能差！
//        String s = "";
//        for (int i = 0; i < 1000000 ; i++) {
//            s = s + "abc";
//        }
//        System.out.println(s);

        // 定义字符串可以使用String类型，但是操作字符串建议大家用StringBuilder(性能好)
        StringBuilder sb = new StringBuilder(); // StringBuilder对象是可变内容的容器  sb = "";
        for (int i = 0; i < 1000000 ; i++) {
            sb.append("abc");// StringBuilder对象，拼接字符串
        }
        System.out.println(sb);
        // StringBuilder只是拼接字符串的手段，结果还是要恢复成字符串(目的)
        String s = sb.toString();// 把StringBuilder转换成String
        System.out.println(s);

        StringBuilder sb2 = new StringBuilder();
        // 支持链式编程
        String result = sb2.append("张三").append("李四").append("王五").toString();
        System.out.println(result);

    }
}
