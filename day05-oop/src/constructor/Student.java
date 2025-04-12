package constructor;

/**
 * ClassName: Student
 * Package: constructor
 * Description: 构造器
 *
 * @Author 白夜
 * @Create 2025/4/9 20:56
 * @Version 1.0
 */
public class Student {

    String name;
    int age;
    char sex;
    //1.无参构造器
    //构造器:是一种特殊方法，不能写返回值类型，名称必须是类名，就是构造器。
    //无参构造器:当类中没有定义任何构造器时，编译器会默认提供无参构造器。
    //如果为类定义了有参数构造器，类默认的无参数构造器就没有了，此时如果还想用无参数构造器，就必须自己手写一个无参数构造器出来。
    public Student() {
        System.out.println("无参构造器执行了");
    }

    //2.有参构造器
    public Student(String name, int age) {
        System.out.println("有参构造器执行了");

    }
    //3.重载构造器
    public Student(String name) {
        System.out.println("重载构造器");
    }

    //public Student(String n, int a, char s) {
    //    name = n;
    //    age = a;
    //    sex = s;
    //
    //}

    //this关键字补充使用
    public  Student(String name, int age, char sex) {
        this.name = name;
        this.age = age;
        this.sex = sex;
    }


}
