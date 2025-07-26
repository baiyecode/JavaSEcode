package reflect;

import org.junit.Test;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

/**
 * ClassName: ReflectDemo2
 * Package: reflect
 * Description: 反射获取类中的成分并操作
 *
 * @Author 白夜
 * @Create 2025/7/24 15:25
 * @Version 1.0
 */
public class ReflectDemo2 {
    @Test
    public void getClassInfo(){
        // 目标：获取类的信息。
        // 1、反射第一步：或者Class对象，代表拿到类。
        Class c1 = Dog.class;
        System.out.println(c1.getName()); // 类名的全类名 reflect.Dog
        System.out.println(c1.getSimpleName()); // 类名  Dog
    }

    // 2、获取类的构造器对象并对其进行操作。
    @Test
    public void getConstructorInfo() throws Exception {
        // 目标：获取类的构造器对象并对其进行操作。
        // 1、反射第一步：或者Class对象，代表拿到类。
        Class c1 = Dog.class;
        // 2、获取构造器对象。
        //Constructor<?>[] getDeclaredConstructors()	获取全部构造器（只要存在就能拿到）
        Constructor[] cons = c1.getDeclaredConstructors();
        //getParameterCount() 获取参数个数 getName() 获取方法名
        for (Constructor con : cons) {
            System.out.println(con.getName() + "(" + con.getParameterCount() + ")");
        }

        System.out.println("=======================");

        //Constructor<T> getDeclaredConstructor(Class<?>... parameterTypes)	获取某个构造器（只要存在就能拿到）
        // 3、获取单个构造器
        Constructor con = c1.getDeclaredConstructor(); // 无参数构造器
        System.out.println(con.getName() + "(" + con.getParameterCount() + ")");

        //参数是String类型，和int类型，写String.class，写int.class
        Constructor con2 = c1.getDeclaredConstructor(String.class, int.class); // 2个参数的有参数构造器
        System.out.println(con2.getName() + "(" + con2.getParameterCount() + ")");

        System.out.println("=======================");

        // 4、获取构造器的作用依然是创建对象：创建对象。
        // 暴力反射：暴力反射可以访问私有的构造器、方法、属性。
        //设置为true，表示禁止检查访问控制(暴力反射)
        con.setAccessible(true); // 绕过访问权限，直接访问！
        //T newInstance(Object... initargs)	调用此构造器对象表示的构造器，并传入参数，完成对象的初始化并返回
        //(Dog) 强转为 Dog类型
        Dog d1 = (Dog) con.newInstance();//无参构造器创建对象
        System.out.println(d1);// Dog{name='null', age=0, hobby='null'}

        Dog d2 = (Dog)con2.newInstance("小黑", 3);//带参数的构造器创建对象
        System.out.println(d2);// Dog{name='小黑', age=3, hobby='null'}
    }

    // 3、获取类的成员变量对象并对其进行操作。
    @Test
    public void getFieldInfo() throws Exception {
        // 目标：获取类的成员变量对象并对其进行操作。
        // 1、反射第一步：或者Class对象，代表拿到类。
        Class c1 = Dog.class;
        // 2、获取成员变量对象。
        //public Field[] getDeclaredFields()	获取类的全部成员变量（只要存在就能拿到）
        Field[] fields = c1.getDeclaredFields();
        //field.getType().getName() 获取成员变量的类型的名字
        for (Field field : fields) {
            System.out.println(field.getName() + "(" + field.getType().getName() + ")");
        }

        System.out.println("=======================");

        // 3、获取单个成员变量对象。
        //public Field getDeclaredField(String name)    获取类的某个成员变量（只要存在就能拿到）
        Field field = c1.getDeclaredField("hobby");
        System.out.println(field.getName() + "(" + field.getType().getName() + ")");

        Field field2 = c1.getDeclaredField("age");
        System.out.println(field2.getName() + "(" + field2.getType().getName() + ")");

        System.out.println("=======================");

        // 4、获取成员变量的目的依然是取值和赋值。
        Dog d = new Dog("泰迪", 3);
        field.setAccessible(true); // 绕过访问权限，直接访问！
        field.set(d, "社交");  //   d.setHobby("社交");
        System.out.println(d);// Dog{name='泰迪', age=3, hobby='社交'}

        String hobby = (String) field.get(d); // d.getHobby();
        System.out.println(hobby);// 社交

    }

    // 4、获取类的成员方法对象并对其进行操作。
    @Test
    public void getMethodInfo() throws Exception {
        // 目标：获取类的成员方法对象并对其进行操作。
        // 1、反射第一步：或者Class对象，代表拿到类。
        Class c1 = Dog.class;
        // 2、获取成员方法对象。
        //Method[] getDeclaredMethods()	获取类的全部成员方法（只要存在就能拿到）
        Method[] methods = c1.getDeclaredMethods();
        for (Method method : methods) {
            System.out.println(method.getName() + "(" + method.getParameterCount() + ")");
        }

        System.out.println("=======================");

        // 3、获取单个成员方法对象。
        //Method getDeclaredMethod(String name, Class<?>... parameterTypes) 获取类的某个成员方法（只要存在就能拿到）
        Method m1 = c1.getDeclaredMethod("eat");// 获取是无参数的eat方法
        //参数类型为 String，写String.class
        Method m2 = c1.getDeclaredMethod("eat", String.class);// 获取是有参数的eat方法
        //getParameterCount() 获取参数个数
        System.out.println(m1.getName() + "(" + m1.getParameterCount() + ")");
        System.out.println(m2.getName() + "(" + m2.getParameterCount() + ")");

        System.out.println("=======================");

        // 4、获取成员方法的目的依然是调用方法。
        Dog d = new Dog("泰迪", 3);
        m1.setAccessible(true); // 绕过访问权限，直接访问！

        Object rs1 = m1.invoke(d); // 唤醒对象d的eat方法执行，相当于 d.eat();
        System.out.println(rs1); // null

        Object rs2 = m2.invoke(d, "牛肉"); // 唤醒对象d的eat带String参数的方法执行，相当于 d.eat("牛肉");
        System.out.println(rs2);
    }

}
