package reflect;

/**
 * ClassName: ReflectDemo1
 * Package: reflect
 * Description: 反射
 *
 * @Author 白夜
 * @Create 2025/7/23 21:15
 * @Version 1.0
 */
public class ReflectDemo1 {
    public static void main(String[] args) throws Exception {
        // 目标：掌握反射第一步操作：或者类的Class对象。（获取类本身）。
        // 1、获取类本身：类.class
        Class c1 = Student.class;
        System.out.println(c1);
        System.out.println(c1.getName()); // 类名的全类名 reflect.Student
        System.out.println(c1.getSimpleName()); // 类名 Student

        // 2、获取类本身：Class.forName("类的全类名")
        Class c2 = Class.forName("reflect.Student");
        System.out.println(c2);

        // 3、获取类本身：对象.getClass()
        Student s = new Student();
        Class c3 = s.getClass();
        System.out.println(c3);

        //获取的都是同一个类的Class对象
        System.out.println(c1 == c2); // true
        System.out.println(c2 == c3); // true
    }

}
