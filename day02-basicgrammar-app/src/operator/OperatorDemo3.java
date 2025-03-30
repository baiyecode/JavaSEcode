package operator;

/**
 * ClassName: OperatorDemo3
 * Package: operator
 * Description: 赋值运算符
 *
 * @Author 白夜
 * @Create 2025/3/29 21:56
 * @Version 1.0
 */
public class OperatorDemo3 {
    public static void main(String[] args) {
        //掌握扩展的赋值运算符,自带类型转换
        int b = 10;
        receive(b);
        print(b);
    }
    //需求：收红包
    public static void receive(int b){
        int a = 100;
        a += b;//相当于a = (a的类型）(a + b)
        System.out.println("我的红包余额是:" + a);

        byte c = 10;
        byte e = 20;
        c += e;//自带类型转换，等价于c = (byte) (c + e);
        System.out.println(c);

    }
    //演示一下其他几个扩展运算符
    public static void print(int a) {
        a -= 10;//a = (a的类型)(a - 10);
        System.out.println(a);

        a *= 10;//a = (a的类型)(a * 10);
        System.out.println(a);

        a /= 10;//a = (a的类型)(a / 10);
        System.out.println(a);

        a %= 10;//a = (a的类型)(a % 10);
        System.out.println(a);
    }


}
