package array;

/**
 * ClassName: ArrayTest
 * Package: array
 * Description: //数组案例
 *
 * @Author 白夜
 * @Create 2025/4/5 21:05
 * @Version 1.0
 */
public class ArrayTest {
    public static void main(String[] args) {
        start();

    }
    //开发一个简易版的斗地主游戏，要求只完成做牌(存储54张牌)、洗牌。使用数组
    public static void start() {
        //定义一个动态化数组，存储54张牌
        String[] cards = new String[54];

        //定义一个数组，存储4种花色
        String[] colors = {"♦","♣","♥","♠"};
        //定义一个数组，存储13种牌
        String[] numbers = {"3","4","5","6","7","8","9","10","J","Q","K","A","2"};
        //定义一个变量，记录牌的索引
        int index = 0;

        //遍历数组，把牌存储到数组cards中
        //先遍历点数，再遍历花色
        for (int i = 0; i < numbers.length; i++) {
            //i=0~12
            for (int j = 0; j < colors.length; j++) {
                //i=0~3
                cards[index] = numbers[i] + colors[j];
                index++;
            }
        }
        //存储大小王
        cards[index++] = "🃏";
        cards[index] = "👲";

        //打印牌
        System.out.println("新牌：");
        for (int i = 0; i < cards.length; i++) {
            System.out.print(cards[i] + " ");
        }
        System.out.println();

        //洗牌
        for (int i = 0; i < cards.length; i++) {

            //生成两个随机数，范围是0~53
            //随机获取一个索引
            int index1 = (int) (Math.random() * cards.length);
            //随机获取另一个索引
            int index2 = (int) (Math.random() * cards.length);
            //每次一次都需要让index1和index2这两个索引位置处的数据进行交换

            //定义一个临时变量，存储index2索引位置的数据
            String temp = cards[index2];
            //把index1索引位置的数据给index2索引位置
            cards[index2] = cards[index1];
            //把临时变量，赋值给index1索引位置
            cards[index1] = temp;
        }

        System.out.println("洗牌后：");
        for (int i = 0; i < cards.length; i++) {
            System.out.print(cards[i] + " ");
        }


    }
}
