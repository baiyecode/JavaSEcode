package enumdemo;

/**
 * ClassName: Test2
 * Package: enumdemo
 * Description: 枚举类的应用场景
 *
 * @Author 白夜
 * @Create 2025/4/20 21:23
 * @Version 1.0
 */
public class Test2 {
    public static void main(String[] args) {
        //枚举类应用场景
        // 需求:模拟上下左右移动图片。

        //第一种是常量做信息标志和分类:但参数值不受约束。
        move(Constant.UP);
        //move(1);
        //move(456788);因为是用int接收，所以可以接受任意int类型的值

        //第二种是妆举做信息标志和分类:参数值受举类约束，
        move2(Direction.UP);
        //move2(234);报错

    }

    public static void move2(Direction direction) {
        switch (direction) {
            case UP:
                System.out.println("向上移动");
                break;
            case DOWN:
                System.out.println("向下移动");
                break;
            case LEFT:
                System.out.println("向左移动");
                break;
            case RIGHT:
                System.out.println("向右移动");
                break;
            default:
                System.out.println("无效的移动方向");
        }
    }

    public static void move(int direction) {
        switch (direction) {
            case Constant.UP:
                System.out.println("向上移动");
                break;
            case Constant.DOWN:
                System.out.println("向下移动");
                break;
            case Constant.LEFT:
                System.out.println("向左移动");
                break;
            case Constant.RIGHT:
                System.out.println("向右移动");
                break;
            default:
                System.out.println("无效的移动方向");
        }
    }
}
