package branch;

import java.util.Scanner;

/**
 * ClassName: SwitchDemo
 * Package: branch
 * Description: Switch分支结构
 *
 * @Author 白夜
 * @Create 2025/4/2 20:43
 * @Version 1.0
 */
public class SwitchDemo {
    public static void main(String[] args) {
        print1();
    }
    public static void print1() {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入星期几");
        String day = sc.next();
        // 值匹配建议使用switch，区间匹配建议使用if-else
        switch (day) {
            case "星期一":
                System.out.println("星期一");
                break;
            case "星期二":
                System.out.println("星期二");
                break;
            case "星期三":
                System.out.println("星期三");
                break;
            case "星期四":
                System.out.println("星期四");
                break;
            case "星期五":
                System.out.println("星期五");
                break;
            case "星期六":
                System.out.println("星期六");
                break;
            case "星期日":
                System.out.println("星期日");
                break;
            default:
                System.out.println("输入有误");
        }
    }
}
