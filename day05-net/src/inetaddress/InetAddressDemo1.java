package inetaddress;

import java.net.InetAddress;

/**
 * ClassName: InetAddressDemo1
 * Package: inetaddress
 * Description: IP地址对象InetAddress的使用
 *
 * @Author 白夜
 * @Create 2025/7/20 19:41
 * @Version 1.0
 */
public class InetAddressDemo1 {
    public static void main(String[] args) {
        // 目标：认识InetAddress获取本机IP对象和对方IP对象。
        try {
            // 1.获取本机IP对象
            InetAddress ip1 = InetAddress.getLocalHost();
            System.out.println(ip1.getHostName());//获取该ip地址对象对应的主机名。
            System.out.println(ip1.getHostAddress());//获取该ip地址对象对应的IP地址信息。

            // 2、获取对方IP对象
            //根据ip地址或者域名，返回一个inetAddress对象
            InetAddress ip2 = InetAddress.getByName("www.baidu.com");//
            System.out.println(ip2.getHostName());
            System.out.println(ip2.getHostAddress());

            // 3、判断主机在指定毫秒内与该ip对应的主机是否能连通
            System.out.println(ip2.isReachable(5000)); // false ping
        }catch (Exception e){
            e.printStackTrace();
        }

    }
}
