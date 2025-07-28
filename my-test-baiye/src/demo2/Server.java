package demo2;

/**
 * ClassName: Server
 * Package: demo2
 * Description:
 *
 * @Author 白夜
 * @Create 2025/7/28 21:01
 * @Version 1.0
 */

import java.io.*;
import java.net.*;
import java.util.*;

public class Server {
    private static final int PORT = 8888;
    private static final String USER_FILE = "my-test-baiye\\src\\demo2\\users.txt";
    private ServerSocket serverSocket;

    public static void main(String[] args) {
        new Server().startServer();
    }

    public void startServer() {
        try {
            serverSocket = new ServerSocket(PORT);
            System.out.println("服务器启动，监听端口: " + PORT);

            while (true) {
                Socket clientSocket = serverSocket.accept();
                System.out.println("客户端连接: " + clientSocket.getInetAddress());

                // 为每个客户端创建新线程处理
                new ClientHandler(clientSocket).start();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    // 客户端处理线程
    class ClientHandler extends Thread {
        private Socket clientSocket;
        private BufferedReader in;
        private PrintWriter out;

        public ClientHandler(Socket socket) {
            this.clientSocket = socket;
        }

        @Override
        public void run() {
            try {
                in = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));
                out = new PrintWriter(clientSocket.getOutputStream(), true);

                String request;
                while ((request = in.readLine()) != null) {
                    System.out.println("收到请求: " + request);

                    if (request.startsWith("REGISTER:")) {
                        handleRegister(request);
                    } else if (request.startsWith("LOGIN:")) {
                        handleLogin(request);
                    } else if (request.equals("EXIT")) {
                        break;
                    }
                }
            } catch (IOException e) {
                e.printStackTrace();
            } finally {
                try {
                    clientSocket.close();
                    System.out.println("客户端断开连接");
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }

        // 处理注册请求
        private void handleRegister(String request) {
            // 解析请求: REGISTER:username,password
            String[] parts = request.substring(9).split(",");
            if (parts.length != 2) {
                out.println("REGISTER_FAIL:请求格式错误");
                return;
            }

            String username = parts[0];
            String password = parts[1];

            // 检查用户名是否已存在
            if (isUserExists(username)) {
                out.println("REGISTER_FAIL:用户名已存在");
                return;
            }

            // 保存用户信息
            if (saveUser(username, password)) {
                out.println("REGISTER_SUCCESS:注册成功");
            } else {
                out.println("REGISTER_FAIL:保存用户信息失败");
            }
        }

        // 处理登录请求
        private void handleLogin(String request) {
            // 解析请求: LOGIN:username,password
            String[] parts = request.substring(6).split(",");
            if (parts.length != 2) {
                out.println("LOGIN_FAIL:请求格式错误");
                return;
            }

            String username = parts[0];
            String password = parts[1];

            // 验证用户信息
            if (validateUser(username, password)) {
                out.println("LOGIN_SUCCESS:登录成功");
            } else {
                out.println("LOGIN_FAIL:用户名或密码错误");
            }
        }

        // 检查用户是否已存在
        private boolean isUserExists(String username) {
            try (BufferedReader reader = new BufferedReader(new FileReader(USER_FILE))) {
                String line;
                while ((line = reader.readLine()) != null) {
                    User user = User.fromString(line);
                    if (user != null && user.getUsername().equals(username)) {
                        return true;
                    }
                }
            } catch (IOException e) {
                // 文件不存在或其他IO异常，视为用户不存在
                return false;
            }
            return false;
        }

        // 保存用户信息
        private boolean saveUser(String username, String password) {
            try (PrintWriter writer = new PrintWriter(new FileWriter(USER_FILE, true))) {
                writer.println(username + "," + password);
                return true;
            } catch (IOException e) {
                e.printStackTrace();
                return false;
            }
        }

        // 验证用户信息
        private boolean validateUser(String username, String password) {
            try (BufferedReader reader = new BufferedReader(new FileReader(USER_FILE))) {
                String line;
                while ((line = reader.readLine()) != null) {
                    User user = User.fromString(line);
                    if (user != null &&
                            user.getUsername().equals(username) &&
                            user.getPassword().equals(password)) {
                        return true;
                    }
                }
            } catch (IOException e) {
                return false;
            }
            return false;
        }
    }
}
