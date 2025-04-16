package extends6constructor;

/**
 * ClassName: Student
 * Package: extends6constructor
 * Description:
 *
 * @Author 白夜
 * @Create 2025/4/16 17:38
 * @Version 1.0
 */
public class Student {
    private String name;
    private char sex;
    private int age;
    private String school;
    public Student() {
    }
    public Student(String name, char sex, int age) {
        //this.name = name;
        //this.sex = sex;
        //this.age = age;
        //this.school = "清华大学";

        //this(...)调用兄弟构造器
        //注意:super(...)this(...)必须写在构造器的第一行，而且两着不能同时出现。
        this(name,sex,age,"清华大学");
    }

    public Student(String name, char sex, int age, String school) {
        //super();//必须在第一行
        this.name = name;
        this.sex = sex;
        this.age = age;
        this.school = school;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", sex=" + sex +
                ", age=" + age +
                ", school='" + school + '\'' +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public char getSex() {
        return sex;
    }

    public void setSex(char sex) {
        this.sex = sex;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getSchool() {
        return school;
    }

    public void setSchool(String school) {
        this.school = school;
    }
}
