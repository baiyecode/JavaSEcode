package object;

/**
 * ClassName: Test
 * Package: object
 * Description: 创建对象
 *
 * @Author 白夜
 * @Create 2025/4/9 17:33
 * @Version 1.0
 */
public class Test {
    public static void main(String[] args) {
        //目标:学会创建对象.
        //创建对象的格式: 类名 对象名 = new 类名();
        Star star = new Star();
        star.name = "白夜";
        star.age = 18;
        star.gender = "男";
        star.height = 1.8;
        star.weight = 62.0;
        System.out.println(star.name);
        System.out.println(star.age);
        System.out.println(star.gender);
        System.out.println(star.height);
        System.out.println(star.weight);


        //创建对象,存储数据,属性
        Star star2 = new Star();
        star2.name = "迪丽热巴";
        star2.age = 18;
        star2.gender = "女";
        star2.height = 1.6;
        star2.weight = 50.0;
        System.out.println(star2.name);
        System.out.println(star2.age);
        System.out.println(star2.gender);
        System.out.println(star2.height);
        System.out.println(star2.weight);




    }
}
