package extends6constructor;

/**
 * ClassName: Test
 * Package: extends6constructor
 * Description: 子类构造器
 *
 * @Author 白夜
 * @Create 2025/4/16 16:01
 * @Version 1.0
 */
public class Test {
    public static void main(String[] args) {
      //子类构造器的特点
        //子类的全部构造器，都会先调用父类的构造器，再执行自己，
        //可以使用super关键字调用父类的有参构造器
        Zi zi = new Zi();



    }
}


class Zi extends Fu{
    public Zi(){
        super();//默认调用父类的无参构造器，没有无参构造器会报错，此时就要去调用父类的有参构造器
        //super(100);
        System.out.println("子类的无参构造器");
    }
    public Zi(int a){
        System.out.println("子类的有参构造器");
    }
}
class Fu{
    public Fu(){
        System.out.println("父类的无参构造器");
    }
    public Fu(int a){
        System.out.println("父类的有参构造器");
    }
}