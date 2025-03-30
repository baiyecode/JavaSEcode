package type;

/**
 * ClassName: TypeDemo2
 * Package: type
 * Description:表达式的自动类型转换提升
 *
 * @Author 白夜
 * @Create 2025/3/29 20:17
 * @Version 1.0
 */
public class TypeDemo2 {
    public static void main(String[] args) {
        int a = 12;
        double b = 12.5;
        byte c = 12;
        System.out.println(print(a,b,c));
        System.out.println(print1(c,c));
        System.out.println(print2(c,c));
        byte d = 120;
        byte e = 120;
        int result = print1((byte) 120,(byte) 120);//这样也可以
        System.out.println(result);
        System.out.println(print1(d,e));
        System.out.println(print2(d,e));

    }
    //表达式的自动类型转换提升
    //需求：接受各种类型的数据运算
    //表达式的最终结果类型由表达式中的最高类型决定
    //1.int + double + byte = double

    public static double print(int a,double b,byte c){
        return a + b + c;
    }
    //在表达式中，byte、short、char 是直接转换成int类型参与运算的,转换可以避免数据溢出
    //比如说b = 120,c = 120,结果是240，但是byte的范围是-128~127，所以结果会溢出，最终结果是-16
    //2.byte + byte = int
    public static int print1(byte b,byte c){
        return  b + c;
    }
    //语法可以允许，但是不建议使用，因为会溢出，并且会损失精度
    public static byte print2(byte b,byte c){
        byte d = (byte) (b + c);
        return d;
    }
}
