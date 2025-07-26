package proxy;

/**
 * ClassName: Test
 * Package: proxy
 * Description: 动态代理
 *
 * @Author 白夜
 * @Create 2025/7/26 15:07
 * @Version 1.0
 */
public class Test {
    public static void main(String[] args) {
        // 目标：创建代理对象。
        // 1、准备一个明星对象：设计明星类。
        Star star = new Star("章若楠");
        // 2、为章若楠创建一个专属与她的代理对象。
        StarService proxy = ProxyUtil.createProxy(star);
        proxy.sing("《红昭愿》");
        System.out.println(proxy.dance());
    }

}
