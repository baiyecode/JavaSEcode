package loop;

/**
 * ClassName: DoWhileDemo
 * Package: loop
 * Description:do-while循环
 *
 * @Author 白夜
 * @Create 2025/4/3 15:39
 * @Version 1.0
 */
public class DoWhileDemo {
    public static void main(String[] args) {
        print1();
        System.out.println("==============");
        print2();

    }
    // do-while循环
    //打印三行HelloWorld
    public static void print1() {
        //do-while循环
        //do{循环体}while(条件判断);
        //先执行循环体，再判断条件，如果条件满足就继续执行循环体，
        // 执行完循环体后执行更新语句，再判断条件，如果条件满足就执行循环体
        int i = 0;
        do {
            System.out.println("HelloWorld");
            i++;
        } while (i < 3);

    }
    public static void print2() {
        int i = 0;
        //do-while循环至少会执行一次循环体, 即使条件不满足
        do {
            System.out.println("HelloWorld");
            i++;
        } while (false);

   }
}
