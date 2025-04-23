package demo;

/**
 * ClassName: SmartHomeControl
 * Package: demo
 * Description:
 *
 * @Author 白夜
 * @Create 2025/4/23 20:27
 * @Version 1.0
 */
public class SmartHomeControl {

//智能控制系统类，定义成一个单例类
    private static final SmartHomeControl smartHomeControl = new SmartHomeControl();
    private SmartHomeControl() {
    }
    public static SmartHomeControl getInstance() {
        return smartHomeControl;
    }

//多态
    public void control(JD jd) {
        System.out.println(jd.getName() + "状态目前是：" + (jd.isStatus() ? "开" : "关"));
        System.out.println("开始进行你的操作");
        jd.press();//按下开关
        System.out.println(jd.getName() + "状态目前是：" + (jd.isStatus() ? "开" : "关"));
    }

    public void printAllJDStatus(JD[] jds) {
        //使用for循环遍历数组，使用索引遍历每个设备
        for (int i = 0; i < jds.length; i++) {
            JD jd = jds[i];
            System.out.println((i + 1) + "：" + jd.getName() + "状态目前是：" + (jd.isStatus() ? "开" : "关"));
        }
    }
}
