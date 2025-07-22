package tcp4;

import java.io.OutputStream;
import java.io.PrintStream;
import java.net.Socket;

/**
 * ClassName: ServerReaderRunnable
 * Package: tcp4
 * Description:
 *
 * @Author 白夜
 * @Create 2025/7/21 20:58
 * @Version 1.0
 */
public class ServerReaderRunnable implements Runnable{
    private Socket socket;
    public ServerReaderRunnable(Socket socket) {
        this.socket = socket;
    }

    @Override
    public void run() {
        try {
            // 给当前对应的浏览器管道响应一个网页数据回去。
            OutputStream os = socket.getOutputStream();
            // 通过字节输出流包装写出去数据给浏览器
            // 把字节输出流包装成打印流。
            PrintStream ps = new PrintStream(os);
            // 写响应的网页数据出去
            ps.println("HTTP/1.1 200 OK");
            ps.println("Content-Type:text/html;charset=utf-8");
            ps.println(); // 必须换一行
            ps.println("<html>");
            ps.println("<head>");
            ps.println("<meta charset='utf-8'>");
            ps.println("<title>");
            ps.println("看Java视频");
            ps.println("</title>");
            ps.println("</head>");
            ps.println("<body>");
            ps.println("<h1 style='color:red;font-size=20px'>看Java视频</h1>");
            // 响应一个黑马程序员的log展示
            ps.println("<img src='https://www.itheima.com/images/logo.png'>");
            ps.println("</body>");
            ps.println("</html>");
            //浏览器都是短链接，所以响应完数据后，必须关闭socket
            ps.close();// 关闭输出流，会自动关闭socket
            socket.close();// 关闭socket
        } catch (Exception e) {
            System.out.println("客户端下线了："+ socket.getInetAddress().getHostAddress());
        }
    }

}
