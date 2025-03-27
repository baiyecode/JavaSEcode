package variable;

/**
 * ClassName: VariableDemo
 * Package: variable
 * Description: 认识变量
 *
 * @Author 白夜
 * @Create 2025/3/26 20:48
 * @Version 1.0
 */
public class VariableDemo {
    public static void main(String[] args) {
        printVariable();
    }
    public static void printVariable(){
        // 变量的定义   数据类型 变量名 = 值;
        // 定义一个整数变量
        int a = 10;
        System.out.println(a);
        //定义一个小数变量
        double b = 3.14;
        System.out.println(b);

        //用变量记录数据，可以提高处理数据的灵活性和可维护性
        int number1 = 100;
        number1 = 200;// 变量可以重新赋值,从右往左看
        System.out.println(number1);// 200

        number1 = number1 + 100;
        System.out.println(number1);// 300

        //变量应用场景，比如钱包的数据，人数，身高，体重，年龄等
        //需求:微信钱包目前有9.9，发出去了5元，又收到了6元，请实时输出钱包金额。
        double money = 9.9;
        System.out.println(money);
        //发出了5元
        money = money - 5;
        System.out.println(money);
        //收到了6元
        money = money + 6;
        System.out.println(money);

        //字符变量，用单引号包裹，只能有一个字符,字符数据如何存储：ASCII码
        char ch = 'a';//a=97
        System.out.println(ch + 1);//98
        char ch2 = 'A';//A=65
        System.out.println(ch2 + 1);//66

        //程序可以直接写进制数据
        int number2 = 0B01100001;//二进制的97,用0B或0b开头
        System.out.println(number2);
        int number3 = 0X61;//十六进制的97,用0X或0x开头
        System.out.println(number3);
        int number4 = 0141;//八进制的97,用0开头
        System.out.println(number4);

    }
}
