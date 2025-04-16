package extends2modifier;

/**
 * ClassName: Fu
 * Package: extends2modifier
 * Description:
 *
 * @Author 白夜
 * @Create 2025/4/15 20:32
 * @Version 1.0
 */
public class Fu {
    //private：只能当前类中访问
    private void privateMethod(){
        System.out.println("privateMethod");
    }
    //缺省：只能当前类中、同一个包下的其他类可以访问
     void Method(){
        System.out.println("Method");
    }
    //protected：只能当前类中、同一个包下的其他类、子孙类可以访问
    protected void protectedMethod(){
        System.out.println("protectedMethod");
    }
    //public：任何类都可以访问
    public void publicMethod(){
        System.out.println("publicMethod");
    }

    public static void main(String[] args) {
        //四种访问权限修饰符，在本类内部都可以访问
        Fu fu = new Fu();
        fu.privateMethod();
        fu.Method();
        fu.protectedMethod();
        fu.publicMethod();
    }
}
