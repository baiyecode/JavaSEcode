package recursion;

/**
 * ClassName: RecursionDemo1
 * Package: recursion
 * Description: 递归
 *
 * @Author 白夜
 * @Create 2025/7/10 17:07
 * @Version 1.0
 */
public class RecursionDemo1 {
    public static void main(String[] args) {
        // 目标：认识递归的形式。
        printA();
    }

    public static void printA() {
        System.out.println("===A执行了===");
        printA(); // 直接递归：自己调用自己  .  递归可能出现死循环，导致出现栈内存溢出现象。
    }

}
