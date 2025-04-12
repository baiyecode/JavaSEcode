package staticmethod;

/**
 * ClassName: Test4
 * Package: staticmethod
 * Description: 静态方法,实例方法访问的注意事项
 *
 * @Author 白夜
 * @Create 2025/4/11 20:24
 * @Version 1.0
 */
public class Test4 {

    // 静态变量
    public static int count = 100;

    //静态方法
    public static void printHelloWorld2() {
        System.out.println("Hello World");
    }

    //实例变量，属于对象
    private String name;
    //实例方法,属于对象
    public void run() {
    }

    public static void main(String[] args) {
        //目标:搞清楚静态方法，实例方法访问的几点注意事项。
        printHelloWorld();


    }

    //静态方法，实例方法访问相关的几点注意事项
    //1、静态方法中可以直接访问静态成员，不可以直接访问实例成员，

    public static void printHelloWorld() {
        System.out.println(count);
        printHelloWorld2();
        //System.out.println(name);//报错
        //静态方法中不可以直接访问实例成员，只能间接访问
        //Test4 t = new Test4();
        //System.out.println(t.name);
        //run();//报错
        //3、实例方法中可以出现this关键字，静态方法中不可以出现this关键字的，
        //System.out.println(this);//报错,this关键字只能代表对象
    }
    //2、实例方法中既可以直接访问静态成员，也可以直接访问实例成员
    //因为实例方法属于对象，对象可以访问实例成员，对象也可以访问静态成员
    public void go() {
        System.out.println(count);
        printHelloWorld2();
        //可以直接访问静态成员，也可以直接访问实例成员
        System.out.println(name);
        run();
        //3、实例方法中可以出现this关键字，静态方法中不可以出现this关键字的，
        System.out.println(this);
    }


}
