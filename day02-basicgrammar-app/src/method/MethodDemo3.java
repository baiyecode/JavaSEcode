package method;

/**
 * ClassName: MethodDemo3
 * Package: method
 * Description: 方法重载
 *
 * @Author 白夜
 * @Create 2025/3/28 18:12
 * @Version 1.0
 */
public class MethodDemo3 {
    public static void main(String[] args) {

    }
    //定义一个方法，打印一个整数
    public static void printNumber(int number){
        System.out.println(number);
    }
    //定义一个重载的方法
    public static void printNumber(double number){
        System.out.println(number);
    }
    //定义一个重载的方法
    public static void printNumber(String number){
        System.out.println(number);
    }
    //定义一个重载的方法
    public static void printNumber(double number,int count){
        System.out.println(number);
    }
    //重复冲突了，仅返回值不同（编译报错）
    //public static void printNumber(double number1,int count1){
    //    System.out.println(number1);
    //}
    //方法重载只关心方法名称相同，形参列表不同(比如类型不同，个数不同，顺序不同)，其他都无所谓
}
