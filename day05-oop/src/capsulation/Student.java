package capsulation;

/**
 * ClassName: Student
 * Package: capsulation
 * Description: 封装思想
 *
 * @Author 白夜
 * @Create 2025/4/11 15:13
 * @Version 1.0
 */
public class Student {
    //封装：合理隐藏，合理暴露

     //String name;
     //int age;
     //double Chinese;
     //double Math;
    //如何合理隐藏
     //1、如何隐藏:使用private关键字(私有，隐藏)修饰成员变量，就只能在本类中被直接访问，
     //其他任何地方不能直接访问。
    private String name;
    private int age;
    private double Chinese;
    private double Math;

    //public 公共的，合理暴露
    //2、如何暴露(合理暴露):使用public修饰(公开)的get和set方法合理暴露
    //成员变量的取值和赋值。

    public int getAge() { // 年龄的取值
        return age;
    }
    public void setAge(int age) {  // 年龄的赋值
        if (age < 0 || age > 120) {
            System.out.println("年龄不合法");
            return;
        }
        this.age = age;
    }

    //3、get和set方法，现在已经是默认规范，即使没有调用，也应该写上。


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getChinese() {
        return Chinese;
    }

    public void setChinese(double chinese) {
        Chinese = chinese;
    }

    public double getMath() {
        return Math;
    }

    public void setMath(double math) {
        Math = math;
    }

    public void printAllScore() {
        System.out.println( name + "的总成绩是" + (Chinese + Math) );

    }
    public void printAverageScore() {
        System.out.println( name + "的平均成绩是" + (Chinese + Math) / 2 );

    }





}
