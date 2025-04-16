package demo;

/**
 * ClassName: Silver
 * Package: demo
 * Description:
 *
 * @Author 白夜
 * @Create 2025/4/16 21:35
 * @Version 1.0
 */
public class SilverCard extends Card{
    public SilverCard(String cardId, String name, String phone, double money) {
        super(cardId, name, phone, money);
    }


    @Override
    public void consume(double money) {
        System.out.println("您当前银卡消费：" + money);
        System.out.println("优惠后的金额" + money * 0.9);
        if(getMoney() < money * 0.9){
            System.out.println("您的卡内余额不足为" + getMoney() + "，请充值");
            return;//退出方法
        }
        //更新卡内余额
        setMoney(getMoney() - money * 0.9);
    }
}
