package thisdemo;

/**
 * ClassName: Test
 * Package: thisdemo
 * Description: this关键字的使用
 *
 * @Author 白夜
 * @Create 2025/4/11 14:44
 * @Version 1.0
 */
public class Test {
    public static void main(String[] args) {

        //认识this关键字，搞清楚this的使用场景

        // this是一个变量，用在方法中，用于拿到当前对象。
        //哪个对象调用这个方法,this就拿到哪个对象。

        Student s1 = new Student();
        s1.name = "张三";
        //赋值，this.name = "张三“
        s1.print();
        System.out.println(s1);

        System.out.println("------------------------");

        Student s2 = new Student();
        //没有赋值，this.name  = null
        s2.print();
        System.out.println(s2);

        System.out.println("------------------------");
        Student s3 = new Student();
        s3.name = "李四";
        s3.printHobby("打篮球");
    }
}
