package demo1;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

/**
 * ClassName: Test2
 * Package: demo1
 * Description:
 *
 * @Author 白夜
 * @Create 2025/7/28 17:17
 * @Version 1.0
 */

/**
 * 需求
 * 目前有100名囚犯，每个囚犯的编号是1-200之间的随机数。现在要求依次随机生成100名囚犯的编号（要求这些囚犯的编号是不能重复的），
 * 然后让他们依次站成一排。(注：位置是从1开始计数的)，接下来，国王命令手下先干掉全部奇数位置处的人。
 * 剩下的人，又从新按位置1开始，再次干掉全部奇数位置处的人，依此类推，直到最后剩下一个人为止，剩下的这个人为幸存者。
 * 具体功能点的要求如下：
 * 请输出幸存者的编号，以及他第一次所占的位置值是多少。
 */
public class Test2 {
    public static void main(String[] args) {
        // 使用面向对象编程：创建对象代表一个一个的囚犯（第一次的位置和它的随机编号）
        // 1、创建一个ArrayList集合存储100个囚犯
        List<Prisoner> prisoners = new ArrayList<>();
        for (int i = 1; i <= 100; i++) {
            int code = (int) (Math.random() * 200) + 1; // 随机编号
            // 判断这个编号是否重复了。
            if(isRepeat(prisoners, code)){
                // 这个编号重复了
                i--;
                continue; // 跳过本次循环
            }
            Prisoner p = new Prisoner(code, i);
            prisoners.add(p);
        }
        System.out.println(prisoners); // 100个囚犯占位成功，编号不重复 7分。

        // 2、干掉集合中的奇数位置的囚犯，直到剩下一个囚犯为止 // 找到位置给5分 输出编号 3分
        // prisoners = 【p1, p2, p3, p4, p5 , p6】
        //                   1       3        5
        while (true){
            // 定义一个新集合存储本轮干掉后剩下的囚犯
            List<Prisoner> lastPrisoners = new ArrayList<>();
            for (int i = 1; i < prisoners.size(); i+=2) {
                lastPrisoners.add(prisoners.get(i));
            }
            if(lastPrisoners.size() == 1){
                Prisoner prisoner = lastPrisoners.get(0);
                System.out.println("最后剩下的囚犯的编号：" + prisoner.getId() + ", 最开始的位置：" + prisoner.getFirstLocation());
                break;
            }
            prisoners = lastPrisoners; // 剩余的囚犯交给囚犯集合作为下一轮继续用
        }
    }

    public static boolean isRepeat(List<Prisoner> prisoners, int code) {
        for (Prisoner p : prisoners) {
            if (p.getId() == code) {
                return true; // 存在重复
            }
        }
        return false; // 不存在重复
    }
}

// 定义一个囚犯类：封装随机编号，第一次的位置。
@Data
@NoArgsConstructor
@AllArgsConstructor
class Prisoner {
    private int id; // 随机编号
    private int firstLocation; // 第一次的位置

}
