package staticmethod;

/**
 * ClassName: Student
 * Package: staticmethod
 * Description:静态修饰方法
 *
 * @Author 白夜
 * @Create 2025/4/11 19:40
 * @Version 1.0
 */
public class Student {

    private double score;

    //1、静态方法，有static修饰，类持有
    public static void printHelloWorld(){
        System.out.println("HelloWorld");
        System.out.println("HelloWorld");
        System.out.println("HelloWorld");
        //System.out.println(score);//静态方法不能访问实例变量

    }

    //2、实例方法，没有static修饰，对象持有
    public void printScore(){
        System.out.println(score >= 60 ? "及格" : "挂科"); //实例方法可以访问实例变量
    }

    public void setScore(double score) {
        this.score = score;
    }

    //规范:如果这个方法只是为了做一个功能且不需要直接访问对象的数据，这个方法直接定义成静态方法
    // 如果这个方法是对象的行为，需要访问对象的数据，这个方法必须定义成实例方法

}
