package array;

/**
 * ClassName: ArrayDemo
 * Package: array
 * Description: 一维数组
 *
 * @Author 白夜
 * @Create 2025/4/5 20:03
 * @Version 1.0
 */
public class ArrayDemo {
    public static void main(String[] args) {

        //认识数组的好处，定义，访问，遍历
        randomName();

    }
    //我是一名Java初学者，请帮我开发一个随机点名的方法，假设有15名学生。
    public static void randomName(){
        //定义一个数组，存储15个学生姓名
        //静态初始化，定义数组的时候，数据已经确定
        //String[] names = {"张三","李四","王五","赵六","孙七","周八","吴九","郑十","王十","赵二","孙三","周十","吴五","郑六","孙七"};
        //完整格式，一般省略new String[]
        String[] names = new String[]{"张三","李四","王五","赵六","孙七","周八","吴九","郑十","王十","赵二","孙三","周十","吴五","郑六","孙七"};
        //[]也可以放数组名后面
        //String names[] = {"张三","李四","王五","赵六","孙七","周八","吴九","郑十","王十","赵二","孙三","周十","吴五","郑六","孙七"};
        //随机获取一个索引值
        //随机数，0~14
        //Math.random()==>>0到1的小数
        //names.length===>>元素个数：15
        int index = (int)(Math.random()*names.length);//0~14,转化成int类型
        //3、根据索引值、获取数组中的元素: 数组名[索引值]
        String name = names[index];
        System.out.println("随机点名："+ name);
        //输出数组名，输出的是地址值
        System.out.println(names);
    }
}
