package demo;

/**
 * ClassName: GoldCard
 * Package: demo
 * Description:
 *
 * @Author 白夜
 * @Create 2025/4/16 21:26
 * @Version 1.0
 */
public class GoldCard extends Card{

    public GoldCard(String cardId, String name, String phone, double money) {
        super(cardId, name, phone, money);
    }
    @Override
    public void consume(double money) {
        System.out.println("您当前金卡消费：" + money);
        System.out.println("优惠后的金额" + money * 0.8);

        if(getMoney() < money * 0.8){
            System.out.println("您的卡内余额不足为" + getMoney() + "，请充值");
            return;//退出方法
        }
        //更新卡内余额
        setMoney(getMoney() - money * 0.8);
        // 判断消费如果大于等于200，调用一个独有的功能，打印洗车，
        if (money * 0.8 >= 200) {
            washCar();
        }else {
            System.out.println("您当前消费不满200元，没有获得免费洗车服务");
        }
    }
    //洗车票
    public void washCar() {
        System.out.println("您获得免费洗车服务");
    }
}
