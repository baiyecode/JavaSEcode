package finaldemo;

/**
 * ClassName: FinalDemo1
 * Package: finaldemo
 * Description: final关键字
 *
 * @Author 白夜
 * @Create 2025/4/20 15:27
 * @Version 1.0
 */
public class FinalDemo1 {
    // final修饰静态成员变量
    // final修饰静态变量，这个变量今后被称为常量，可以记住一个固定值，并且程序中不能修改了，通常这个值作为系统的配置信息
    // 常量的名称，建议全部大写，多个单词用下划线链接
    public static final String SCHOOL_NAME = "清华大学";
    // final修饰实例成员变量(一般没有意义）
    private final int age = 18;
    public static void main(String[] args) {
        //认识final关键字
        // 3、final修饰变量:变量有且仅能被赋值一次
        /*
            变量有哪些呢?
                a、成员变量: 类中的变量
                    静态成员变量（static修饰）
                    实例(对象）成员变量
                b、局部变量：方法中的变量
         */
        final int a = 10;
        //a = 20;//错误, final修饰的变量不能被赋值
        buy(0.8);

        FinalDemo1 f = new FinalDemo1();
        System.out.println(f.age);
        //f.age = 20;//错误，final修饰的变量不能被二次赋值


        System.out.println("=====================");
        //final修饰基本类型的变量，变量存储的数据不能被改变。
        final int b = 20;
        //b = 30;
        //final修饰引用类型的变量，变量存储的地址不能被改变，但地址所指向对象的内容是可以被改变的。
        final int[] arr = {1,2,3};
        System.out.println(arr);//输出地址值
        //arr = new int[]{2,2,3};//地址变了，错误，不能被二次赋值
        arr[0] = 10;//修改了数组的内容，没有改变地址值，所以arr还是指向了同一个地址值，所以arr[0]还是1

    }
    public static void buy(final double z){
        //z = 0.9;//错误，final修饰的变量不能被二次赋值
        System.out.println(z);

    }
}

//1.final修饰类，类不能被继承(应用：工具类）
final class Fu{ }
//class Zi extends Fu{ }

//2.final修饰方法，方法不能被重写
class Fu2{
    public final void show(){
        System.out.println("父类方法");
    }
}
class Zi2 extends Fu2{
    //public void show(){
    //    System.out.println("子类方法");
    //}
}
