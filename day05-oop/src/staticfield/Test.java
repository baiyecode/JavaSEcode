package staticfield;

/**
 * ClassName: Test
 * Package: staticfield
 * Description: 静态变量
 *
 * @Author 白夜
 * @Create 2025/4/11 17:19
 * @Version 1.0
 */
public class Test {
    public static void main(String[] args) {
        //目标:认识static修饰成员变量，特点、访问机制，搞清楚作用。

        //1、访问：静态变量
        // 类名.静态变量名（推荐）
        Student.name = "白夜";
        System.out.println(Student.name);
        //对象名.静态变量名（不推荐）
        Student s1 = new Student();
        s1.name = "马冬梅";
        Student s2 = new Student();
        s2.name = "周杰伦";

        //因为name是静态变量，只有一个，所以s1是白夜，后面又改为马冬梅，再改为周杰伦
        System.out.println(s1.name);//周杰伦
        System.out.println(Student.name);//周杰伦


        //2、访问实例变量
        // 对象名.实例变量名
        s1.age = 18;
        s2.age = 19;

        //没有static修饰，每个对象都有一个
        System.out.println(s1.age);//18
        System.out.println(s2.age);//19
        //实例变量不属于类，所以不能用类名.访问
        //System.out.println(Student.age);//报错



    }
}
