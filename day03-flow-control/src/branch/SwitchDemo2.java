package branch;

/**
 * ClassName: SwitchDemo2
 * Package: branch
 * Description: Switch注意事项
 *
 * @Author 白夜
 * @Create 2025/4/2 21:00
 * @Version 1.0
 */
public class SwitchDemo2 {
    public static void main(String[] args) {
        print3();

    }
    //switch分支结构的几点注意事项：
    //表达式类型只能是byte、short、int、char，JDK5开始支持枚举，JDK7开始支持String
    //不支持double、float、long。
    //这是因为Java的小数不是准确的，无法进行比较，所以不支持小数。
    //public static void print1() {
    //    double number = 1.9;
    //    switch (number) { //会报错
    //        case 1:
    //            System.out.println("case1");
    //        case 2:
    //            System.out.println("case2");
    //            break;
    //        case 3:
    //            System.out.println("case3");
    //            break;
    //        default:
    //            System.out.println("default");
    //    }
    //}
    //case给出的值不允许重复，且只能是字面量，不能是变量
    //public static void print2() {
    //    int number = 1;
    //    int b = 2;
    //    switch (number) {
    //        case 10: //会报错
    //            System.out.println("case1");
    //            break;
    //        case 10:
    //            System.out.println("case2");
    //            break;
    //        case b://会报错
    //            System.out.println("case3");
    //            break;
    //        default:
    //            System.out.println("default");
    //    }
    //}

    //正常使用switch的时候，不要忘记写break，否则会出现穿透现象。
    //穿透会直接不管cause代码执行，直到遇到break，再跳出switch。
    //作用：相同程序的case块，可以通过穿透性进行合并，从而减少重复代码的书写。
    //周一:埋头苦干，解决bug     // 周五:自己整理代码
    //周二: 请求大牛程序员帮忙    // 周六:打游戏
    //周三:请求大牛程序员帮忙     // 周日:打游戏
    //周四:请求大牛程序员帮忙
    public static void print3() {
        String day = "周六";
        switch (day) {
            case "周一":
                System.out.println("埋头苦干，解决bug");
                break;
            case "周二":
                //System.out.println("请大牛程序员帮忙");
                //break;
            case "周三":
                //System.out.println("请大牛程序员帮忙");
                //break;
            case "周四":
                System.out.println("请大牛程序员帮忙");
                break;
            case "周五":
                System.out.println("自己整理代码");
                break;
            case "周六":
                //System.out.println("打游戏");
                //break;
            case "周日":
                System.out.println("打游戏");
                break;
            default:
                System.out.println("输入有误");

        }
    }



}
