package demo;

import java.util.Scanner;

/**
 * ClassName: Test
 * Package: demo
 * Description: 综合案例
 *
 * @Author 白夜
 * @Create 2025/4/16 21:13
 * @Version 1.0
 */
public class Test {
    public static void main(String[] args) {
        // 目标:加油站支付小程序。
        //1、创建卡片类，以便创建金卡或者银卡对象，封装车主的数据。
        //2、定义一个卡片父类:Card,定义金卡和银卡的共同属性和方法。
        //3、定义一个金卡类，维承Card类:金卡必须重写消费方法(8折优惠)，独有功能打印系车票。
        //4、定义一个银卡类，维承Card类:银卡必须重写消费方法(9折优惠)
        //5、办一张金卡:创建金卡对象。交给一个独立的业务(支付机)来完成:存钱，消费。
        GoldCard goldCard = new GoldCard("粤A88888", "白夜", "12345678909", 5000);
        goldCard.deposit(1000);//存钱
        pay(goldCard);
        //6、办一张银卡:创建银卡对象。交给一个独立的业务(支付机)来完成:存钱，消费
        SilverCard silverCard = new SilverCard("沪A88888", "白夜", "12345678990", 2000);
        pay(silverCard);
    }


    //写一个方法：代表支付机，刷卡
    public static void pay(Card c) {
        System.out.println("请刷卡，输入消费金额：");
        Scanner sc = new Scanner(System.in);
        double money = sc.nextDouble();
        c.consume(money);
    }

}
