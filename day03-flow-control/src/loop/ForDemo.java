package loop;

/**
 * ClassName: ForDemo
 * Package: loop
 * Description: for循环
 *
 * @Author 白夜
 * @Create 2025/4/2 21:33
 * @Version 1.0
 */
public class ForDemo {
    public static void main(String[] args) {
        //掌握for循环的使用, for循环的执行顺序
        print1();
        print2();
        print3(10);
        System.out.println(print3(10));
        print4();


    }
    public static void print1() {
        //打印三行HelloWorld
        //for(初始化语句;条件判断;更新语句){}
        //先执行初始化语句，再判断条件，如果条件满足就执行循环体，
        // 执行完循环体后执行更新语句，再判断条件，如果条件满足就执行循环体
        for (int i = 0; i < 3; i++) {
            System.out.println("HelloWorld");
        }
        //for循环中，控制循环的变量只在循环中使用。while循环中，控制循环的变量在循环后还可以继续使用
        //System.out.println(i);报错

    }
    //需求:求1-5之间的数据和，并把求和结果在控制台输出，
    public static void print2() {
        int sum = 0;//初始化累加器变量sum，用于计算1到5的整数之和
        //使用for循环遍历1到5的整数
        for (int i = 1; i <= 5; i++) {
            //累加当前循环变量i的值到sum中
            sum = sum + i;
        }
        System.out.println(sum);
    }
    //需求:求1-10之间的奇数和，并把求和结果在控制台输出。
    //public static void print3() {
    //    int sum = 0;
    //    for (int i = 1; i <= 10; i++) {
    //        if (i % 2 != 0) {
    //            sum = sum + i;
    //        }
    //    }
    //    System.out.println(sum);
    //}
    public static int print3(int n ) {
        int sum = 0;
        for (int i = 1; i <= n; i += 2){
            sum = sum + i;
        }
        return sum;

    }
    //需求:在控制台输出所有的“水仙花数”，水仙花数必须满足如下2个要求
    //1.水仙花数是一个三位数
    //2.水仙花数的个位、十位、百位的数字立方和等于原数
    //153,370,371,407
    public static void print4() {
        for (int i = 100; i <= 999; i++) {
            int ge = i % 10;
            int shi = i / 10 % 10;
            int bai = i / 100;
            if (ge * ge * ge + shi * shi * shi + bai * bai * bai == i) {
                System.out.println(i);
            }
        }
    }

}
