package constructor;

/**
 * ClassName: Test
 * Package: constructor
 * Description: 构造器
 *
 * @Author 白夜
 * @Create 2025/4/9 20:56
 * @Version 1.0
 */
public class Test {
    public static void main(String[] args) {

        // 目标:认识类的构造器，搞清楚其特点和常见应用场景。
        //构造器的特点:创建对象时，对象会立即自动用构造器。
        // 构造器的名字与类名相同，没有返回值类型，不能有返回值。
        //如果为类定义了有参数构造器，类默认的无参数构造器就没有了，此时如果还想用无参数构造器，就必须自己手写一个无参数构造器出来。

        //有参构造器调用
        Student s = new Student("白夜", 18);

        System.out.println("===========");
        //无参构造器调用
        Student s1 = new Student();



        System.out.println("===================");
        //构造器的作用:创建对象时，同时为对象的成员变量的初始化赋值。
        Student s2 = new Student(); //无参构造器
        s2.name = "白夜";
        s2.age = 18;
        s2.sex = '男';
        System.out.println(s2.name);
        System.out.println(s2.age);
        System.out.println(s2.sex);

        System.out.println("===================");
        Student s3 = new Student("白夜", 18, '男'); //有参构造器
        System.out.println(s3.name);
        System.out.println(s3.age);
        System.out.println(s3.sex);


    }

}
