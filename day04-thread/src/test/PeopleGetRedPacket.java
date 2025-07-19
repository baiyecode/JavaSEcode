package test;

import java.util.List;

/**
 * ClassName: PeopleGetRedPacket
 * Package: test
 * Description:
 *
 * @Author 白夜
 * @Create 2025/7/19 22:09
 * @Version 1.0
 */
public class PeopleGetRedPacket extends  Thread{
    private List<Integer> redPacket;
    public PeopleGetRedPacket(List<Integer> redPacket, String name) {
        super(name);
        this.redPacket = redPacket;
    }

    @Override
    public void run() {
        String name = Thread.currentThread().getName();
        while (true) {
            // 100个人来抢redPacket集合中的钱。
            synchronized (redPacket){
                if(redPacket.size() == 0){
                    break;
                }
                // 随机一个索引得到红包
                int index = (int)(Math.random() * redPacket.size());
                Integer money = redPacket.remove(index);// 从redPacket集合中删除一个元素，返回删除的元素
                System.out.println(name + "抢到了" + money + "元");
                if(redPacket.size() == 0){
                    System.out.println("活动结束！");
                    break;
                }
            }
            try {
                Thread.sleep(2);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

}
