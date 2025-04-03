package loop;

/**
 * ClassName: DeadForDemo
 * Package: loop
 * Description:死循环
 *
 * @Author 白夜
 * @Create 2025/4/3 15:51
 * @Version 1.0
 */
public class DeadForDemo {
    public static void main(String[] args) {
        //死循环写法
        //print1();
        //print2();
        print3();

    }
    //1、for循环实现死循环
    //public static void print1() {
    //    for ( ; ; ) {
    //        System.out.println("HelloWorld");
    //    }
    //}



    //2、while循环实现死循环
    //public static void print2() { //经典写法
    //    while (true) {
    //        System.out.println("HelloWorld");
    //   }
    //}


    //3、do...while循环实现死循环
    public static void print3() {
        do {
            System.out.println("HelloWorld");
        } while (true);
    }

}
