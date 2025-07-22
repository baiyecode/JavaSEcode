package udp2;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.util.Scanner;

/**
 * ClassName: UDPClientDemo1
 * Package: udp2
 * Description: udp的多发多收
 *
 * @Author 白夜
 * @Create 2025/7/20 21:40
 * @Version 1.0
 */
public class UDPClientDemo1 {
    public static void main(String[] args) throws Exception{
        // 目标：完成UDP通信多发多收：客户端开发
        System.out.println("===客户端启动==");
        // 1、创建发送端对象（代表抛韭菜的人）
        DatagramSocket socket = new DatagramSocket(); // 随机端口

        Scanner sc = new Scanner(System.in);// 创建键盘输入对象
        // 使用while死循环不断的接收用户的数据输入，如果用户输入的exit则退出程序
        while (true) {
            // 2、创建数据包对象封装要发送的数据。(韭菜盘子)
            System.out.println("请说：");
            String msg = sc.nextLine();// 获取用户输入行

            // 如果用户输入的是 exit，则退出
            if ("exit".equals(msg)) {
                System.out.println("===客户端退出==");
                socket.close();// 关闭发送端
                break;
            }

            byte[] bytes = msg.getBytes();
            DatagramPacket packet = new DatagramPacket(bytes, bytes.length,
                    InetAddress.getLocalHost(), 8080);

            // 3、让发送端对象发送数据包的数据
            socket.send(packet);
        }

    }

}
