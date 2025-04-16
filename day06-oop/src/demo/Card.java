package demo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * ClassName: Card
 * Package: demo
 * Description:
 *
 * @Author 白夜
 * @Create 2025/4/16 21:13
 * @Version 1.0
 */

//lombok技术可以实现为类自动添加getter,setter方法无参数构造器，toString方法
@Data // @Data注解可以自动生成getter setter方法 无参构造器 toString方法等
@AllArgsConstructor // @AllArgsConstructor注解可以自动生成有参构造器
@NoArgsConstructor // @NoArgsConstructor注解可以自动生成无参构造器
public class Card {
    private String cardId;  //车牌号码
    private String name;
    private String phone;
    private double money;  //余额



    //预存金额
    public void deposit(double money){
        this.money += money;
    }

    //消费金额
    public void consume(double money){
        this.money -= money;
    }


}
