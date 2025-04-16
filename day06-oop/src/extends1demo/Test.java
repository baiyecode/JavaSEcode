package extends1demo;

/**
 * ClassName: Test
 * Package: extendsdemo
 * Description: 继承
 *
 * @Author 白夜
 * @Create 2025/4/15 20:10
 * @Version 1.0
 */
public class Test {
    public static void main(String[] args) {
        // 目标:认识维承，好处。
        // 1、创建对象，封装老师数据
        // 子类可以维承父类的非私有成员
        //子类对象其实是由子类和父类多张设计图共同创建出来的对象，所以子类对象是完整的
        Teacher teacher = new Teacher();
        teacher.setName("李老师");
        teacher.setSex('女');
        teacher.setSkill("java");
        System.out.println(teacher.getName());
        System.out.println(teacher.getSex());
        System.out.println(teacher.getSkill());

    }
}
