package extends6constructor;

/**
 * ClassName: Test2
 * Package: extends6constructor
 * Description: 应用场景
 *
 * @Author 白夜
 * @Create 2025/4/16 17:18
 * @Version 1.0
 */
public class Test2 {
    public static void main(String[] args) {
        //子类构造器调用父类构造器的应用场景
        Teacher t1 = new Teacher();
        Teacher t = new Teacher("白夜",'男',"java");
        System.out.println(t.getName());
        System.out.println(t.getSex());
        System.out.println(t.getSkill());


    }

}
