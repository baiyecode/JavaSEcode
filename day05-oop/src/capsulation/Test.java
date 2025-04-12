package capsulation;

/**
 * ClassName: Test
 * Package: capsulation
 * Description: 封装
 *
 * @Author 白夜
 * @Create 2025/4/11 15:11
 * @Version 1.0
 */
public class Test {
    public static void main(String[] args) {

        //目标:搞清楚封装的设计思想:合理隐藏合理暴露。学会如何隐藏如何暴露。
        Student s1 = new Student();

        //1.隐藏:将属性私有化,不允许外部程序直接访问。
        //防止访问时胡乱赋值导致错误
        //s1.age = -19;
        //s1.Chinese = -89;
        //System.out.println(s1.age);
        //System.out.println(s1.Chinese);
        //2.暴露:提供对应的方法,让外部程序调用。
        //使用public修饰符修饰的get和set方法,进行赋值和取值
        s1.setAge(-19);
        //System.out.println(s1.age());//报错，不可以直接访问
        System.out.println(s1.getAge());



    }
}
