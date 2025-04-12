package javabean;

/**
 * ClassName: Student
 * Package: javabean
 * Description: 实体类
 *
 * @Author 白夜
 * @Create 2025/4/11 15:56
 * @Version 1.0
 */
public class Student {
    //1、私有化成员变量
    private String name;
    private double chinese;
    private double math;

    //2、提高有参数构造器和无参构造器
    //必须提供无参构造器
    public Student() {
    }
    //有参构造器（可选）
    public Student(String name, double chinese, double math) {
        this.name = name;
        this.chinese = chinese;
        this.math = math;
    }

    //3、提供公开的getter和setter方法

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getChinese() {
        return chinese;
    }

    public void setChinese(double chinese) {
        this.chinese = chinese;
    }

    public double getMath() {
        return math;
    }

    public void setMath(double math) {
        this.math = math;
    }
}
