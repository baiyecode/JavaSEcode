package operator;

/**
 * ClassName: OperatorDemo2
 * Package: operator
 * Description:自增自减运算符
 *
 * @Author 白夜
 * @Create 2025/3/29 21:29
 * @Version 1.0
 */
public class OperatorDemo2 {
    public static void main(String[] args) {
        print(10);
        print1(10);

    }
    //接收一个整数
    public static void print(int a){
        a++;//a=a+1,
        ++a;//
        System.out.println(a);//12
        //这里a已经变成12了
        a--;//a=a-1,
        --a;
        System.out.println(a);//10


    }
    //设计一个方法，理解自增和自减放在变量前后的区别
    //在变量的前面，先对变量+1、-1，再拿变量的值运算
    //在变量的后面，先拿变量的值运算，再对变量+1、-1
    public static void print1(int a){
        int b = a++; //先赋值，再自增
        System.out.println(a);//11
        System.out.println(b);//10
        int c = ++a; //先自增，再赋值
        //上面a已经自增了变成11了
        System.out.println(a);//12
        System.out.println(c);//12
    }
}
