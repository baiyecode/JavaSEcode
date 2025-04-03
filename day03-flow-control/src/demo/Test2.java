package demo;

import java.util.Random;
import java.util.Scanner;

/**
 * ClassName: Test2
 * Package: demo
 * Description:猜数字游戏
 *
 * @Author 白夜
 * @Create 2025/4/3 20:02
 * @Version 1.0
 */
public class Test2 {
    public static void main(String[] args) {
        guessNumber();



    }
    //需求: 随机生成一个1-100之间的数据，
    //提示用户猜测，猜大提示过大，猜小提示过小，直到猜中结束游戏。
    public static void guessNumber(){
        //1.生成一个随机数
        //方法一
        //Math.random() =>生成一个0-1之间的随机数,[0,1)
        //(int) (Math.random() * 100 + 1) => [0,100)之间的整数,强转为int类型，=> [0,99],+1 => [1,100]
        //int guessNumber = (int) (Math.random() * 100 + 1);


        //方法二
        //random.nextInt(100) => [0,99],计算机大多数情况区间都是包前不包后，0-1不包含1，0-100不包含100
        // 比如生成一个0-1之间的随机数,[0,1)，填100，那么就是[0,100)，也就是0-99，
        // 所以要+1=> [1,100]
        //直接输入101生成的是0-100，不是1-100
        Random random = new Random();//得到随机数对象
        int guessNumber = random.nextInt(100) + 1;
        Scanner sc = new Scanner(System.in);
        while (true){
            System.out.println("请输入一个猜到数字:");
            int num = sc.nextInt();
            if (num < 1 || num > 100){
                System.out.println("数字在1-100之间");
                continue;
            }
            if (num == guessNumber){
                System.out.println("恭喜你猜中了");
                break;
            }else if (num > guessNumber){
                System.out.println("猜大了");
                System.out.println("请重新输入:");
            }else {
                System.out.println("猜小了");
                System.out.println("请重新输入:");
            }
        }

    }

}
