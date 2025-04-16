package extends4feature;


/**
 * ClassName: Test2
 * Package: extends4feature
 * Description: 继承特点
 *
 * @Author 白夜
 * @Create 2025/4/15 21:12
 * @Version 1.0
 */
public class Test2 {

    public static void main(String[] args) {
        //继承后子类的访问特点：就近原则
        //子类没有找子类、子类没有找父类、父类没有就报错
        //如果子父类中出现了重名的成员此时一定要在子类中使用父类的怎么办?
        //super.父类成员变量/父类成员方法（super关键字）
        Zi zi = new Zi();
        zi.show();

    }

}
   class Fu{
    String name = "Fu的name";
    public void run(){
        System.out.println("Fu的run方法");
    }
}
   class Zi extends Fu{
    String name = "zi的name";
    public void show(){
        String name = "show的name";
        System.out.println(name);//show的name
        System.out.println(this.name);//zi的name
        System.out.println(super.name);//Fu的name
        run();//Zi的run方法
        super.run();//Fu的run方法
        //go();//子父类都没有会报错
    }
    public void run(){
        System.out.println("Zi的run方法");
    }
}
