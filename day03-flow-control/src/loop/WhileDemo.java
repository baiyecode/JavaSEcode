package loop;

/**
 * ClassName: WhileDemo
 * Package: loop
 * Description:While循环的使用
 *
 * @Author 白夜
 * @Create 2025/4/2 21:53
 * @Version 1.0
 */
public class WhileDemo {
    public static void main(String[] args) {
        print1();
        print2();
        print3();
        print4();
        print5();


    }
    //用while循环打印三行HelloWorld
    //While循环结构
    public static void print1(){
        int i = 0;
        while (i < 3) {
            System.out.println("HelloWorld");
            i++;
        }
        //for循环中，控制循环的变量只在循环中使用。while循环中，控制循环的变量在循环后还可以继续使用
        System.out.println(i);
    }
    //什么时候用for，什么时候用while?
    //功能上是完全一样的，for能解决的while也能解决，反之亦然。
    //使用规范：知道循环几次，使用for；不知道循环几次建议使用while。
    //需求：假设你在银行投资了100000元，银行给出的复利是1.7%，问多少年后能实现本金翻倍?
    public static void print2(){
        double money = 100000;
        double rate = 0.017;
        int year = 0;
        //在 Java 的 while 循环中，循环体内的语句顺序可能影响结果，
        // 但代码中，交换 money 计算和 year++ 的顺序不会改变最终结果。
        //原因：循环条件 money < 200000 的检查发生在每次循环体执行完毕后。
        //两个操作（计算 money 和递增 year）在单次循环中必然都会执行一次。
        //year 仅用于计数，不参与 money 的计算，因此顺序不影响逻辑。
        //逻辑清晰性：建议先更新数据（如 money）再操作计数器（如 year），以符合“先处理业务逻辑，再记录状态”的习惯。
        while (money < 200000) {
            money = money * (1 + rate);
            year++;
            //year++;
            //money = money * (1 + rate);
        }
        System.out.println("年数是:" + year);
    }
    //在 Java 的 while 循环中，循环体语句和迭代语句（如变量更新）的顺序会直接影响循环的执行结果。
    //需要明确循环体语句是否需要依赖迭代语句更新前或更新后的变量值
    // 两者的位置互换可能会导致循环次数、变量状态甚至逻辑结果完全不同。下面通过具体示例说明它们的区别：
    public static void print3(){
        int i = 0;
        //输出结果：i = 0, i = 1, i = 2
        while (i < 3) {
            System.out.println("i = " + i); // 循环体语句
            i++; // 迭代语句（变量更新）
        }
    }
    public static void print4(){
        int i = 0;
        //输出结果：i = 1, i = 2, i = 3
        while (i < 3) {
            i++; // 迭代语句（变量更新）
            System.out.println("i = " + i); // 循环体语句
        }
    }
    //需求:世界最高山峰珠穆朗玛峰高度是:8848.86米=8848860毫米，
    //假如我有一张足够大的纸，它的厚度是0.1毫米。请问:该纸张折叠多少次，可以折成珠穆朗玛峰的高度?
    public static void print5() {
        double height = 8848860; //世界最高山峰珠穆朗玛峰高度
        double thickness = 0.1; //纸张厚度
        int count = 0; //折叠次数
        //“先处理业务逻辑，再记录状态”,循环体语句和迭代语句的顺序互换也不会改变循环结果。
        while (thickness < height) {
            thickness = thickness * 2;
            count++;
        }
        System.out.println("折叠了" + count + "次，纸张可以折成珠穆朗玛峰的高度");
    }


}
