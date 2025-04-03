package loop;

/**
 * ClassName: ForForDemo
 * Package: loop
 * Description:循环嵌套
 *
 * @Author 白夜
 * @Create 2025/4/3 15:59
 * @Version 1.0
 */
public class ForForDemo {
    public static void main(String[] args) {
        print1();
        print2();

    }
    //打印四行五列的*
    public static void print1() {
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print("*");//不换行
            }
            System.out.println();//换行
        }
    }
    //打印九九乘法表
    public static void print2() {
        for (int i = 1; i <= 9; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j + "x" + i + "=" + (i * j) + "\t");
            }
            System.out.println();
        }
    }
}
