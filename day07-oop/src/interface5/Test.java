package interface5;

/**
 * ClassName: Test
 * Package: interface5
 * Description: 接口注意事项
 *
 * @Author 白夜
 * @Create 2025/4/23 16:05
 * @Version 1.0
 */
public class Test {
    public static void main(String[] args) {
    }

}

//4、一个类实现了多个接口，如果多个接口中存在同名的默认方法，可以不冲突，这个类重写该方法即可。
interface A3 {
    default void show() {
        System.out.println("接口A3的show");
    }
}
interface B3 {
    default void show() {
        System.out.println("接口B3的show");
    }
}
class D3  implements A3, B3 {

    @Override
    public void show() {
        A3.super.show();
        B3.super.show();
    }
}

//3、一个类继承了父类，又同时实现了接口，如果父类中和接口中有同名的方法，实现类会优先用父类的。
interface A2 {
    default void show() {
        System.out.println("接口A2的show");
    }
}
class C2 {
    public void show() {
        System.out.println("父类C2的show");
    }
}
class B2 extends C2 implements A2 {
    public void go() {
        show();//父类C2的show
        super.show();//父类C2的show
        A2.super.show();//接口A2的show

    }
}



//2、一个接口维承多个接口，如果多个接口中存在方法签名冲突，则此时不支持多继承，也不支持多实现。
interface A1 {
    void show();
}
interface B1 {
    //void show();
    String show();
}
//interface C1 extends A1, B1 {
//}

//class C1 implements A1, B1 {
//}




//1、接口与接口可以多维承:一个接口可以同时维承多个接口[重点]
//类与类:单继承 一个类只能继承一个直接父类
//类与接口:多实现，一个类可以同时实现多个接口。
//接口与接口:多维承，一个接口可以同时维承多个接口。
interface A {
    void show1();
}
interface B {
    void show2();
}
interface C extends A, B {
    void show3();
}
class D implements C { //只要实现了接口C就也实现了接口A和接口B
    @Override
    public void show1() {
        System.out.println("show1");
    }

    public void show2() {
        System.out.println("show2");
    }

    public void show3() {
        System.out.println("show3");
    }
}
