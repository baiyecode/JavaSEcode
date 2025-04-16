package polymorphism2;

/**
 * ClassName: Wolf
 * Package: polymorphism
 * Description:
 *
 * @Author 白夜
 * @Create 2025/4/16 20:09
 * @Version 1.0
 */
public class Wolf extends Animal {
    String name = "狼";
    @Override
    public void run(){
        System.out.println("狼跑的很快");
    }

    public void eat(){
        System.out.println("狼吃肉");
    }
}
