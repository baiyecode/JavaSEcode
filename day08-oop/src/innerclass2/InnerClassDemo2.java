package innerclass2;

/**
 * ClassName: InnerClassDemo2
 * Package: innerclass2
 * Description: 静态内部类
 *
 * @Author 白夜
 * @Create 2025/4/25 20:58
 * @Version 1.0
 */
public class InnerClassDemo2 {
    public static void main(String[] args) {
        // 静态内部类
        //创建对象格式：外部类名.内部类名 对象名 = new 外部类名.内部类名();
        Outer.Inner inner = new Outer.Inner();
        inner.show();
        //1、静态内部中是可以直接访问外部类的静态成员
        //2、静态内部类中不可以直接访问外部类的实例成员,没有外部类对象
    }
}
