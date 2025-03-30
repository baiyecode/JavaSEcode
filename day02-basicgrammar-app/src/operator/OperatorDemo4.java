package operator;

/**
 * ClassName: OperatorDemo4
 * Package: operator
 * Description: 关系运算符，三元运算符
 *
 * @Author 白夜
 * @Create 2025/3/29 22:12
 * @Version 1.0
 */
public class OperatorDemo4 {
    public static void main(String[] args) {
        print(10,20);
        System.out.println("==============");
        print(10,10);
        System.out.println("==============");
        print1(10,3);
        print2(40);
        int max = getMax(10,20,30);
        System.out.println(max);
    }
    //理解关系运算符
    public static void print(int a,int b ) {
        System.out.println(a > b);//false    false
        System.out.println(a < b);//true     false
        System.out.println(a >= b);//false   true  ,要么大于，要么等于
        System.out.println(a <= b);//true    true  ，要么小于，要么等于
        System.out.println(a == b);//false   true
        System.out.println(a != b);//true    false



    }
    //三元运算符
    public static void print1(int a,int b) {
        int max = a > b ? a : b;
        System.out.println("较大值" + max);



    }
    //判断成绩及格还是挂科
    public static void print2(int score) {
        String result = score >= 60 ? "及格" : "挂科";
        System.out.println(result);

    }
    //求三个整数的较大值并返回
    public static int getMax(int a,int b,int c) {
    //    int max = a > b ? a : b;
    //    max = max > c ? max : c;
    //    return max;
        //三元运算符的嵌套
        return a > b ? (a > c ? a : c) : (b > c ? b : c);
    }


}
