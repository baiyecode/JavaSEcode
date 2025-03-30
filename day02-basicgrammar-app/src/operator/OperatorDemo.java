package operator;

/**
 * ClassName: OperatorDemo
 * Package: operator
 * Description:基本运算符
 *
 * @Author 白夜
 * @Create 2025/3/29 20:59
 * @Version 1.0
 */
public class OperatorDemo {
    public static void main(String[] args) {
        print(10,20);
        print(10,3);
        print1();
    }
    //基本的算数运算符
    public static void print(int a,int b) {
        System.out.println("a+b=" + (a + b));
        System.out.println("a-b=" + (a - b));
        System.out.println("a*b=" + (a * b));
        //两个整数相除，结果是整数，3.333333----3
        System.out.println("a/b=" + (a / b));//3
        System.out.println("a/b=" + ((double)a / b));//3.333333
        System.out.println("a/b=" + (1.0 * a / b));//3.333333,表达式的自动类型提升
        System.out.println("a%b=" + (a % b));//1


    }
    //需求：研究+符号做运算符还是连接符
    public static void print1(){
        int a = 10;
        System.out.println(a + 10);//20
        System.out.println(a + "abc");//10abc
        System.out.println('a' + a);//10+'a'='a'+10=97+10=107
        System.out.println('a' + a + "abc");//97+10+"abc"=107abc
        System.out.println("abc" + a + 'a');//abc10a

    }
}
