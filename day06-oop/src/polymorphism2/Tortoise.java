package polymorphism2;

/**
 * ClassName: Tortoise
 * Package: polymorphism
 * Description:
 *
 * @Author 白夜
 * @Create 2025/4/16 20:09
 * @Version 1.0
 */
public class Tortoise extends Animal {
    String name = "乌龟";
    @Override
    public void run()
    {
        System.out.println("乌龟跑的慢");
    }

    //乌龟缩头
    public void cutHead()
    {
        System.out.println("乌龟缩头");
    }
}
