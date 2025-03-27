package variable;

/**
 * ClassName: VariableDemo2
 * Package: variable
 * Description:
 *
 * @Author 白夜
 * @Create 2025/3/27 16:44
 * @Version 1.0
 */
public class VariableDemo2 {
    public static void main(String[] args) {
        printVariable();
    }


    //帮我设计一个方法，输出用八种基本数据类型定义的变量

    public static void printVariable() {
        // 变量的定义   数据类型 变量名 = 值;
        // 定义整型,有四种
        byte d = 10;
        //每一种数据类型都有范围超过会报错，比如byte超过127会报错
        //byte d1 = 129;报错
        short e = 10;
        int a = 10;

        long f = 10;
        /* 注意:随便写一个整数字面量默认是int类型的，1234567891011这个数据虽然没有超过long的范围，
           但是超过了int的范围，所以报错
           如果希望1234567891011这个是long类型，需要显示的指定，加上L或者L
         */
        //long f1 = 1234567891011;
        long f1 = 1234567891011l;
        // 定义浮点型，有两种
        float g = 3.14f;
        /*
          注意: 直接写一个浮点数字面量默认是double类型的，如果希望3.14是float类型，需要显示的指定，加上f或者F
         */
        //float g1 = 3.14;
        double b = 3.14;
        // 定义字符型
        char c = 'a';
        // 定义布尔型
        boolean h = true;
        //字符串类型，引用数据类型，定义字符串变量记住字符串数据
        String str = "hello world";
        System.out.println(str);

    }

}