package innerclass;

/**
 * ClassName: InnerClassDemo1
 * Package: innerclass
 * Description: 成员内部类
 *
 * @Author 白夜
 * @Create 2025/4/25 20:05
 * @Version 1.0
 */
public class InnerClassDemo1 {
    public static void main(String[] args) {
        //成员内部类的语法

        //成员内部类创建对象的格式
        //外部类名.内部类名 对象名 = new 外部类名().new 内部类名();
        Outer.Inner oi = new Outer().new Inner();
        oi.print();
        oi.setAge(18);

        //成员内部类访问外部类成员的特点(拓展):
        //1、成员内部类中可以直接访问外部类的静态成员,也可以直接访问外部类的实例成员
        //2、成员内部类的实例方法中，可以直接拿到当前寄生的外部类对象:外部类名.this
    }
}


class People {
    private int heartBeat = 100;
    public class Heart {
        private int heartBeat = 60;
        public void show(){
            int heartBeat = 80;
            System.out.println(heartBeat);//80
            System.out.println(this.heartBeat);//60
            System.out.println(People.this.heartBeat);//100
        }

    }
}
//成员内部类可以被继承，但用的少
class A extends Outer.Inner{
    // 构造方法接收外部类实例和内部类参数
    public A(Outer outer,int age) {
        outer.super(age);//通过外部类实例调用父类构造方法
    }
}
