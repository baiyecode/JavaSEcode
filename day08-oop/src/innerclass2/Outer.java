package innerclass2;

/**
 * ClassName: Outer
 * Package: innerclass2
 * Description: 静态内部类
 *
 * @Author 白夜
 * @Create 2025/4/25 20:58
 * @Version 1.0
 */
public class Outer {
    // 静态内部类,外部类本身持有
    public static String schoolName = "清华大学";
    private String name;
    public static class Inner {
        public void show() {
            System.out.println("show");
            //1、静态内部中可以直接访问外部类的静态成员
            System.out.println(schoolName);
            //2、静态内部类中不可以直接访问外部类的实例成员,没有外部类对象
            //System.out.println(name);// 错误
        }

        private int age;
        public Inner() {

        }
        public Inner(int age) {
            this.age = age;
        }
        public void setAge(int age) {
            this.age = age;
        }
        public int getAge() {
            return age;
        }
    }
}
