package extends5override;

/**
 * ClassName: Test
 * Package: extends5override
 * Description:方法重写
 *
 * @Author 白夜
 * @Create 2025/4/16 15:31
 * @Version 1.0
 */
public class Test {
    public static void main(String[] args) {
        //了解方法重写
        //重写的规范:声明不变，重新实现。直接一模一样就行
        Dog dog = new Dog();
        dog.cry();

    }


}


class Dog extends Animal{
    //方法重写：子类重写父类的方法，方法名、参数列表必须一致
    //方法重写的其它注意事项
    //子类重写父类方法时，访问权限必须大于或者等于父类该方法的权限（public>protected>缺省）
    //重写的方法返回值类型，必须与被重写方法的返回值类型一样，或者范围更小。
    //私有方法、静态方法不能被重写，如果重写会报错的。
    @Override    //方法重写的校验注解(标志):要求方法名称和形参列表必须与重写方法一致，否则报错! 更安全。可读性好，更优雅!
    public void cry(){
        System.out.println("狗会叫~~~~");
    }
}
class Animal{
    public void cry(){
        System.out.println("动物会叫~~~~");
    }
}
