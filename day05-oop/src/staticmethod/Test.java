package staticmethod;

/**
 * ClassName: Test
 * Package: staticmethod
 * Description: 静态修饰方法
 *
 * @Author 白夜
 * @Create 2025/4/11 19:41
 * @Version 1.0
 */
public class Test {
    public static void main(String[] args) {
        //目标:认识static修饰和不修饰方法的区别

        //1、访问静态方法
        //类名.静态方法(推荐)
        Student.printHelloWorld();

        //对象名.静态方法(不推荐)
        Student s = new Student();
        s.printHelloWorld();


        Student s1 = new Student();
        s1.setScore(50);

        //2、访问实例方法
        //对象名.实例方法
        //Student.printScore();//报错,不能类直接访问实例方法
        s1.printScore();


        printHelloWorld();
        //同一个类中，访问静态方法可以省略类名
        //Test.printHelloWorld();


    }

    public static void printHelloWorld(){
        System.out.println("HelloWorld");
        System.out.println("HelloWorld");
        System.out.println("HelloWorld");
        //System.out.println(score);//静态方法不能访问实例变量

    }
}

