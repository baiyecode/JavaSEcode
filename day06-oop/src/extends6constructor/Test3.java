package extends6constructor;

/**
 * ClassName: Test3
 * Package: extends6constructor
 * Description: 调用兄弟构造器
 *
 * @Author 白夜
 * @Create 2025/4/16 17:37
 * @Version 1.0
 */
public class Test3 {
    public static void main(String[] args) {
        Student s1 = new Student("张三", '男', 18, "北京大学");
        System.out.println(s1);
        //Student s2 = new Student("李四", '女', 18,"清华大学");
        Student s2 = new Student("李四", '女', 18);
        System.out.println(s2);

    }

}
