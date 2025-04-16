package extends4feature;

/**
 * ClassName: Test
 * Package: extends4feature
 * Description: 继承特点
 *
 * @Author 白夜
 * @Create 2025/4/15 21:06
 * @Version 1.0
 */
public class Test {
    public static void main(String[] args) {
        //继承的特点，注意事项
        A a = new A();


    }
    //1、java的类只能是单继承的，不支持多维承，支持多层继承
    //2、Java中所有类，要么直接继承了Object，要么默认继承了Object，要么间接继承了Object。

}
class A {

}
class B extends A{

}
class C extends B{

}