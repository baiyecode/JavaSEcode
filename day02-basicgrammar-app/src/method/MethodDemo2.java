package method;

/**
 * ClassName: MethodDemo2
 * Package: method
 * Description: 方法的注意事项
 *
 * @Author 白夜
 * @Create 2025/3/28 18:08
 * @Version 1.0
 */
public class MethodDemo2 {
    public static void main(String[] args) {
        printEven(5);
        printHello();
        checkAge(-1);
        divide(10, 0);

    }
    //在 Java 中，void 方法（无返回值的方法）可以使用 return 语句，
    // 但只能用于提前结束方法的执行，且不能返回任何值（不能写 return 值;）。
    public static void printEven(int number) {
        if (number % 2 != 0) {
            System.out.println("奇数，提前结束！");
            return; // ✅ 合法：仅提前退出方法，不返回任何值
        }
        System.out.println("偶数：" + number);
    }
    //public static void errorExample() {
    //       return 0; // ❌ 报错：void 方法不能返回数值
    //   }

    //在 Java 中，return;（无返回值）可以出现在方法的任何位置，包括方法中间或方法末尾。
    // 不过，它的作用会根据位置不同有所区别：
    public static void checkAge(int age) {
        if (age < 0) {
            System.out.println("年龄非法！");
            return; // ✅ 提前退出，后续代码不会执行
        }
        System.out.println("年龄合法");
    }
    public static void printHello() {
        System.out.println("Hello");
        return; // ✅ 语法允许，但等同于什么都不写
    }
    /* 关键注意点
        末尾的 return; 可以省略
        编译器会自动在 void 方法的末尾隐式添加 return;，因此无需手动写。
        强制提前退出才需要写
        只有需要根据条件跳过后续逻辑时，才需要在中间使用 return;。
     */

    //设计一个除法功能
    public static void divide(double a, double b) {
        if (b == 0) {
            System.out.println("除数不能为0");
            return; // 提前返回，不会继续执行后续代码，除数不能为0
        }
        System.out.println(a / b);
    }
}
