package code;

/**
 * ClassName: CodeDemo1
 * Package: code
 * Description: 静态代码块
 *
 * @Author 白夜
 * @Create 2025/4/25 19:42
 * @Version 1.0
 */
public class CodeDemo1 {

    public static String schoolName;
    public static String[] cards = new String[54];
    //静态代码块:有static修饰，属于类，与类一起优先加载，自动执行一次
    //基本作用:可以完成对类的静态资源的初始化
    //静态代码块的执行顺序:先加载静态代码块，再加载main方法
    static {
        System.out.println("静态代码块执行了");
        schoolName = "清华大学";
        cards[0] = "A";
        cards[1] = "2";
        cards[2] = "3";
        //....
    }
    public static void main(String[] args) {
        //认识代码块的基本作用
        System.out.println("main方法执行了");
    }
}
