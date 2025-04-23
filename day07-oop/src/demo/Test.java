package demo;

import java.util.Scanner;

/**
 * ClassName: Test
 * Package: demo
 * Description: 智能家居控制系统案例
 *
 * @Author 白夜
 * @Create 2025/4/23 20:04
 * @Version 1.0
 */
public class Test {
    public static void main(String[] args) {
        // 目标:面向对象编程实现智能家居控制系统。
        // 角色:设备(吊灯，电视机，洗衣机，空调）
        // 具备的功能:开和关。
        //谁控制他们:智能控制系统(单例对象)，控制调用设备的开和关。

        //1、定义设备类:创建设备对象代表家里的设备
        //2、准备这些设备对象，放到数组中，代表整个家庭的设备。
        JD[] jds = new JD[4];
        jds[0] = new TV("小米电视",true);
        jds[1] = new WashMachine("美的洗衣机",false);
        jds[2] = new Lamp("欧灯",false);
        jds[3] = new AirConditioner("格力空调",true);


        // 3、为每个设备制定一个开个关的功能。定义成接口，让家电（JD）实现开关功能

        // 4、创建智能控制系统对象，控制设备开和关
        SmartHomeControl smartHomeControl = SmartHomeControl.getInstance();
        //smartHomeControl.control(jds[0]);
        //6、提示用户操作，a、展示全部设备的当前情况。b、让用户选择哪一个操作。
        //打印全部设备的开和关的现状。
        while (true) {
            smartHomeControl.printAllJDStatus(jds);
            System.out.println("请选择设备进行操作：");
            Scanner sc = new Scanner(System.in);
            String command = sc.next();
            switch (command){
                case "1":
                    smartHomeControl.control(jds[0]);
                    break;
                case "2":
                    smartHomeControl.control(jds[1]);
                    break;
                case "3":
                    smartHomeControl.control(jds[2]);
                    break;
                case "4":
                    smartHomeControl.control(jds[3]);
                    break;
                case "exit":
                    System.out.println("退出系统");
                    return;
                default:
                    System.out.println("输入有误，请重新输入");
            }
        }
    }
}
