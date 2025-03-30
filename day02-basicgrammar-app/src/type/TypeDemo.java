package type;

/**
 * ClassName: TypeDemo
 * Package: type
 * Description: 类型转换
 *
 * @Author 白夜
 * @Create 2025/3/29 17:26
 * @Version 1.0
 */
public class TypeDemo {
    public static void main(String[] args) {
        byte a = 12;
        print(a);
        print1(a);
        int e = 12;
        //print2(e);//类型范围大的变量，不可以直接赋值给类型范围小的变量，会报错
        //强制类型转换，数据类型 变量2 = （数据类型）变量1;
        //print2((byte) e);
        byte d = (byte) e;
        print2(d);


        int a1 = 1500;
        byte b2 = (byte) a1;
        System.out.println(a1);
        System.out.println(b2);//超出类型范围，会数据溢出 -36

        double c1 = 12.5;
        int c2 = (int) c1;
        System.out.println(c2);//12,丢失精度,浮点型强转成整型，直接丢掉小数部分，保留整数部分返回

    }

    //自动类型转换
    //类型范围小的变量，可以直接赋值给类型范围大的变量
    public static void print(int b) {
        System.out.println(b);
    }
    public static void print1(double c) {
        System.out.println(c);
    }
    //强制类型转换
    public static void print2(byte d) {
        System.out.println(d);
    }

}
