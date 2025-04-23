package abstract1;

/**
 * ClassName: A
 * Package: abstract1
 * Description:
 *
 * @Author 白夜
 * @Create 2025/4/20 21:42
 * @Version 1.0
 */

//抽象类，用abstract修饰
public abstract class A {

    //抽象类中不一定要有抽象方法，有抽象方法的类必须是抽象类
    //抽象方法，用abstract修饰，没有方法体
    public abstract void run();



    //类有的成员：成员变量、方法、构造器，抽象类都可以有。
    private String name;
    private int age;

    public A() {
    }

    public A(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void eat() {
        System.out.println("吃东西");
    }


}
