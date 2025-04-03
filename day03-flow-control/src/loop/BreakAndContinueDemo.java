package loop;

/**
 * ClassName: BreakAndContinueDemo
 * Package: loop
 * Description: Break和Continue关键字的使用
 *
 * @Author 白夜
 * @Create 2025/4/3 16:10
 * @Version 1.0
 */
public class BreakAndContinueDemo {
    public static void main(String[] args) {
        print1();
        System.out.println("==============");
        print2();
    }
    // break的使用
    //输出结果：0, 1, 2, 3, 4
    public static void print1() {
        for (int i = 0; i < 10; i++) {
            if (i == 5) {
                break;// 跳出并结束循环
            }
            System.out.println(i);

        }
    }
    // continue的使用
    //输出结果：0, 1, 2, 3, 4, 6, 7, 8, 9
    public static void print2() {
        for (int i = 0; i < 10; i++) {
            if (i == 5) {
                continue;// 跳过本次循环，继续下一次循环
            }
            System.out.println(i);
        }
    }
}
