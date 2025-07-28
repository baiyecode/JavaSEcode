package demo1;

import java.util.Collections;
import java.util.Set;
import java.util.TreeSet;

/**
 * ClassName: Test1
 * Package: demo1
 * Description:
 *
 * @Author 白夜
 * @Create 2025/7/28 16:22
 * @Version 1.0
 */

/**
 * 需求
 * 某双色球系统，红球是1-35之间的数据，篮球是1-15之间的数据，一注双色球号码是由6个不重复的号码和1个篮球号码组成的。
 * 具体功能点的要求如下：
 * 1.请随机一组双色球号码，6个红球号码要求不重复，且升序排序输出，篮球号码放在最后面输出。
 * 2.假设中奖号码是10, 12, 30, 16,7, 17，12，请用程序判断出第一个功能随机出的双色球号码中了几个红球和几个篮球
 */
public class Test1 {
    public static void main(String[] args) {
        // 1、随机6个不重复红球号码  1-35 1个篮球1-15，升序输出，篮球放最后面。
        Set<Integer> red = new TreeSet<>();
        while (red.size() < 6) {
            int num = (int) (Math.random() * 35 + 1); // 1-35
            red.add(num);
        }
        System.out.println("用户的红球号码：" + red);  // 6分。
        int blue = (int) (Math.random() * 15 + 1);
        System.out.println("用户的篮球号码：" + blue);   // 2分。

        // 2、定义一个集合存储用户选择的号码，再判断中了几个红球，中了几个篮球号码。
        Set<Integer> luckRed = new TreeSet<>();
        Collections.addAll(luckRed, 10, 12, 30, 16,7, 17);
        int luckBlue = 12;

        // 3、判断用户中了几个红球。  // 7分
        int redCount = 0;
        for (Integer num : red) {
            if (luckRed.contains(num)) {
                redCount++;
            }
        }
        System.out.println("用户中了" + redCount + "个红球");
        // 判断中了几个篮球号码
        System.out.println("用户中了几" + (blue == luckBlue ? "1个篮球" : "0个篮球"));
    }
}
