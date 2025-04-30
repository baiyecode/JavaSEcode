package innerclass;

/**
 * ClassName: Outer
 * Package: innerclass
 * Description: 成员内部类
 *
 * @Author 白夜
 * @Create 2025/4/25 20:06
 * @Version 1.0
 */
public class Outer {
    public static int age1 = 18;// 静态成员变量
    public static void test(){
        System.out.println("Outer.test");// 静态成员方法
    }
    private int age2;
    public void run(){
        System.out.println("Outer.run");
    }
    // 成员内部类,无static修饰，属于外部类的对象持有
    public class Inner{

        public void print(){
            System.out.println("HelloWorld");
            //1、成员内部类中可以直接访问外部类的静态成员,也可以访问外部类的实例成员
            System.out.println(age1);
            test();
            System.out.println(age2);
            run();
            //2、成员内部类的实例方法中，可以直接拿到当前寄生的外部类对象:外部类名.this
            System.out.println(this);// 成员内部类对象
            System.out.println(Outer.this);// 外部类对象
        }
        // 成员变量
        public int age;
        // 构造器
        public Inner(){
        }
        // 带参构造器
        public Inner(int age) {
            this.age = age;
        }

        public void setAge(int age){
            this.age = age;
        }
        public int getAge(){
            return age;
        }

    }
}
