package code;

/**
 * ClassName: CodeDemo2
 * Package: code
 * Description:实例代码块
 *
 * @Author 白夜
 * @Create 2025/4/25 19:49
 * @Version 1.0
 */
public class CodeDemo2 {
    private String name;
    private String[] direction = new String[4];
    //实例代码块:无static修饰。属于对象，每次创建对象时，都会优先执行一次。
    //基本作用:初始化对象的实例资源
    //比main方法后执行
    {
        System.out.println("实例代码块执行了");
        name = "白夜";
        direction[0] = "东";
        direction[1] = "南";
        direction[2] = "西";
        direction[3] = "北";
    }

    public static void main(String[] args) {
        //实例代码块
        System.out.println("main方法执行了");
        new CodeDemo2();
        new CodeDemo2();
        new CodeDemo2();
    }
}
