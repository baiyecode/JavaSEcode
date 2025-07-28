package demo2;

/**
 * ClassName: Client
 * Package: demo2
 * Description:
 *
 * @Author 白夜
 * @Create 2025/7/28 21:02
 * @Version 1.0
 */

import java.io.*;
import java.net.*;
import java.util.Scanner;

public class Client {
    private static final String SERVER_IP = "localhost";
    private static final int SERVER_PORT = 8888;
    private Socket socket;
    private BufferedReader in;
    private PrintWriter out;
    private Scanner scanner;

    public static void main(String[] args) {
        new Client().startClient();
    }

    public void startClient() {
        try {
            // 连接服务器
            socket = new Socket(SERVER_IP, SERVER_PORT);
            in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            out = new PrintWriter(socket.getOutputStream(), true);
            scanner = new Scanner(System.in);

            System.out.println("=== 用户注册登录系统 ===");
            System.out.println("连接服务器成功！");

            // 主菜单循环
            while (true) {
                showMenu();
                String choice = scanner.nextLine().trim();

                switch (choice) {
                    case "1":
                        handleRegister();
                        break;
                    case "2":
                        handleLogin();
                        break;
                    case "3":
                        handleExit();
                        return;
                    case "exit":
                        handleExit();
                        return;
                    default:
                        System.out.println("无效选择，请重新输入！");
                }
            }
        } catch (IOException e) {
            System.out.println("连接服务器失败: " + e.getMessage());
        }
    }

    // 显示菜单
    private void showMenu() {
        System.out.println("\n=== 请选择操作 ===");
        System.out.println("1. 注册");
        System.out.println("2. 登录");
        System.out.println("3. 退出");
        System.out.print("请输入选择 (1-3): ");
    }

    // 处理注册
    private void handleRegister() {
        System.out.print("请输入用户名: ");
        String username = scanner.nextLine().trim();
        if (username.isEmpty()) {
            System.out.println("用户名不能为空！");
            return;
        }

        System.out.print("请输入密码: ");
        String password = scanner.nextLine().trim();
        if (password.isEmpty()) {
            System.out.println("密码不能为空！");
            return;
        }

        // 发送注册请求
        out.println("REGISTER:" + username + "," + password);

        try {
            // 接收服务器响应
            String response = in.readLine();
            System.out.println("服务器响应: " + response);

            if (response.startsWith("REGISTER_SUCCESS")) {
                System.out.println("注册成功！");
            } else if (response.startsWith("REGISTER_FAIL")) {
                String message = response.substring(14); // 去掉"REGISTER_FAIL:"
                System.out.println("注册失败: " + message);
            }
        } catch (IOException e) {
            System.out.println("接收服务器响应失败: " + e.getMessage());
        }
    }

    // 处理登录
    private void handleLogin() {
        System.out.print("请输入用户名: ");
        String username = scanner.nextLine().trim();
        if (username.isEmpty()) {
            System.out.println("用户名不能为空！");
            return;
        }

        System.out.print("请输入密码: ");
        String password = scanner.nextLine().trim();
        if (password.isEmpty()) {
            System.out.println("密码不能为空！");
            return;
        }

        // 发送登录请求
        out.println("LOGIN:" + username + "," + password);

        try {
            // 接收服务器响应
            String response = in.readLine();
            System.out.println("服务器响应: " + response);

            if (response.startsWith("LOGIN_SUCCESS")) {
                System.out.println("登录成功！欢迎 " + username + "！");
            } else if (response.startsWith("LOGIN_FAIL")) {
                String message = response.substring(11); // 去掉"LOGIN_FAIL:"
                System.out.println("登录失败: " + message);
            }
        } catch (IOException e) {
            System.out.println("接收服务器响应失败: " + e.getMessage());
        }
    }

    // 处理退出
    private void handleExit() {
        try {
            out.println("EXIT");
            socket.close();
            System.out.println("感谢使用，再见！");
        } catch (IOException e) {
            System.out.println("关闭连接时出错: " + e.getMessage());
        }
    }
}
