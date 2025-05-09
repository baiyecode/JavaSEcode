package ui;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;

/**
 * ClassName: ModernLoginScreen
 * Package: ui
 * Description:
 *
 * @Author 白夜
 * @Create 2025/5/9 15:08
 * @Version 1.0
 */

public class ModernLoginScreen extends JFrame {

    private JTextField usernameField;
    private JPasswordField passwordField;
    private JButton loginButton;
    private JLabel statusLabel;

    // 定义一些颜色
    private static final Color PRIMARY_COLOR = new Color(75, 110, 175); // 一种柔和的蓝色
    private static final Color SECONDARY_COLOR = new Color(240, 245, 250); // 非常浅的背景灰/蓝
    private static final Color TEXT_COLOR = new Color(50, 50, 50);
    private static final Color PLACEHOLDER_COLOR = new Color(150, 150, 150);

    public ModernLoginScreen() {
        initLookAndFeel();
        initComponents();
        setupLayout();
        setupActions();
        customizeComponents();

        setTitle("用户登录");// 设置标题
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);// 设置关闭方式
        setSize(400, 350); // 调整窗口大小
        setLocationRelativeTo(null); // 居中显示
        setResizable(false);// 设置窗口不可拉伸
    }
    //将应用程序的界面风格设置为Nimbus
    private void initLookAndFeel() {
        try {
            for (UIManager.LookAndFeelInfo info : UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (Exception e) {
            // 如果Nimbus不可用, 使用默认L&F
            System.err.println("Nimbus L&F not found, using default.");
        }
    }

    private void initComponents() {
        usernameField = new JTextField(20);// 创建一个文本框
        passwordField = new JPasswordField(20);// 创建一个密码框
        loginButton = new JButton("登录");// 创建一个登录按钮
        statusLabel = new JLabel(" ", SwingConstants.CENTER); // 用于显示状态或错误信息
    }

    private void customizeComponents() {
        // 主面板样式
        JPanel mainPanel = (JPanel) getContentPane();// 获取主面板
        mainPanel.setBackground(SECONDARY_COLOR);//  设置主面板背景色
        mainPanel.setBorder(new EmptyBorder(30, 40, 30, 40)); // 增加内边距

        // 标题
        JLabel titleLabel = new JLabel("欢迎登录", SwingConstants.CENTER);
        titleLabel.setFont(new Font("微软雅黑", Font.BOLD, 28)); // 更现代的字体
        titleLabel.setForeground(PRIMARY_COLOR);

        // 标签字体和颜色
        Font labelFont = new Font("微软雅黑", Font.PLAIN, 14);
        JLabel userLabel = new JLabel("用户名:");
        userLabel.setFont(labelFont);// 设置标签字体和颜色
        userLabel.setForeground(TEXT_COLOR);//  设置标签颜色
        JLabel passLabel = new JLabel("密 码:");
        passLabel.setFont(labelFont);
        passLabel.setForeground(TEXT_COLOR);

        // 输入框样式
        Font fieldFont = new Font("微软雅黑", Font.PLAIN, 14);
        usernameField.setFont(fieldFont);//  设置输入框字体和颜色
        passwordField.setFont(fieldFont);//  设置输入框字体和颜色

        // 添加占位符提示
        addPlaceholder(usernameField, "请输入用户名");
        addPlaceholder(passwordField, "请输入密码");


        // 按钮样式
        loginButton.setFont(new Font("微软雅黑", Font.BOLD, 16));
        loginButton.setBackground(PRIMARY_COLOR);
        loginButton.setForeground(Color.WHITE);
        loginButton.setFocusPainted(false); // 去除焦点边框
        loginButton.setCursor(new Cursor(Cursor.HAND_CURSOR)); // 鼠标悬停时显示手型
        loginButton.setPreferredSize(new Dimension(100, 40)); // 设置按钮大小

        // 状态标签
        statusLabel.setFont(new Font("微软雅黑", Font.PLAIN, 12));
        statusLabel.setForeground(Color.RED);

        // 将自定义组件添加到布局中
        // (这部分逻辑挪到 setupLayout 中，这里只是做样式设定)
    }


    private void setupLayout() {
        JPanel contentPanel = new JPanel(new GridBagLayout());// 创建一个网格布局的面板
        contentPanel.setBackground(SECONDARY_COLOR); // 与主面板背景一致
        GridBagConstraints gbc = new GridBagConstraints();// 网格布局约束
        gbc.insets = new Insets(10, 10, 10, 10); // 组件间距
        gbc.fill = GridBagConstraints.HORIZONTAL;// 填充整个单元格

        // 标题
        JLabel titleLabel = new JLabel("欢迎登录", SwingConstants.CENTER);
        titleLabel.setFont(new Font("微软雅黑", Font.BOLD, 28));//  更新字体
        titleLabel.setForeground(PRIMARY_COLOR);//  设置标题颜色
        gbc.gridx = 0;//  第一列
        gbc.gridy = 0;//  第二行
        gbc.gridwidth = 2; // 跨两列
        gbc.weighty = 0.5; // 给予一些垂直空间
        contentPanel.add(titleLabel, gbc);// 添加标题

        // 用户名标签
        gbc.gridwidth = 1;//设置当前网格布局约束的列跨度为1，表示组件只占据一行中的一个单元格宽度
        gbc.gridx = 0;
        gbc.gridy = 1;
        gbc.weighty = 0;
        gbc.anchor = GridBagConstraints.EAST; // 右对齐
        gbc.fill = GridBagConstraints.NONE;//  取消填充
        JLabel userLabel = new JLabel("用户名:");
        userLabel.setFont(new Font("微软雅黑", Font.PLAIN, 14));
        userLabel.setForeground(TEXT_COLOR);
        contentPanel.add(userLabel, gbc);

        // 用户名输入框
        gbc.gridx = 1;
        gbc.gridy = 1;
        gbc.anchor = GridBagConstraints.WEST; // 左对齐
        gbc.fill = GridBagConstraints.HORIZONTAL;//  填充整个单元格
        gbc.weightx = 1.0; // 允许水平拉伸
        contentPanel.add(usernameField, gbc);

        // 密码标签
        gbc.gridx = 0;
        gbc.gridy = 2;
        gbc.anchor = GridBagConstraints.EAST;
        gbc.fill = GridBagConstraints.NONE;
        gbc.weightx = 0;
        JLabel passLabel = new JLabel("密 码:");
        passLabel.setFont(new Font("微软雅黑", Font.PLAIN, 14));
        passLabel.setForeground(TEXT_COLOR);
        contentPanel.add(passLabel, gbc);

        // 密码输入框
        gbc.gridx = 1;
        gbc.gridy = 2;
        gbc.anchor = GridBagConstraints.WEST;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        gbc.weightx = 1.0;
        contentPanel.add(passwordField, gbc);

        // 登录按钮
        gbc.gridx = 0;
        gbc.gridy = 3;
        gbc.gridwidth = 2;
        gbc.fill = GridBagConstraints.NONE; // 不拉伸按钮本身
        gbc.anchor = GridBagConstraints.CENTER; // 居中按钮
        gbc.weighty = 0.5; // 给予一些垂直空间
        contentPanel.add(loginButton, gbc);

        // 状态标签
        gbc.gridx = 0;
        gbc.gridy = 4;
        gbc.gridwidth = 2;
        gbc.fill = GridBagConstraints.HORIZONTAL;//  填充整个单元格
        gbc.anchor = GridBagConstraints.CENTER;// 居中标签
        gbc.weighty = 0.1;
        contentPanel.add(statusLabel, gbc);

        // 将内容面板添加到主框架
        // 注意：JFrame 的 ContentPane 默认是 BorderLayout
        // 为了更好地控制，我们将 contentPanel 添加到 ContentPane 的中央
        // 并且设置 ContentPane 的边框以实现窗口的整体内边距
        JPanel mainPanel = (JPanel) getContentPane();
        mainPanel.setLayout(new BorderLayout());
        mainPanel.setBorder(new EmptyBorder(30, 40, 30, 40)); // 窗口整体内边距
        mainPanel.add(contentPanel, BorderLayout.CENTER);// 将内容面板添加到 ContentPane 的中央
    }

    private void addPlaceholder(final JTextField textField, final String placeholder) {
        // 初始显示占位符
        if (textField.getText().isEmpty()) {
            textField.setText(placeholder);
            textField.setForeground(PLACEHOLDER_COLOR);
            if (textField instanceof JPasswordField) {
                ((JPasswordField) textField).setEchoChar((char) 0); // 显示占位符文本
            }
        }
        // 添加了一个焦点监听器
        textField.addFocusListener(new FocusAdapter() {
            @Override
            public void focusGained(FocusEvent e) {
                if (textField.getText().equals(placeholder)) {
                    textField.setText("");
                    textField.setForeground(TEXT_COLOR);
                    if (textField instanceof JPasswordField) {
                        ((JPasswordField) textField).setEchoChar('•'); // 恢复密码掩码
                    }
                }
            }

            @Override
            public void focusLost(FocusEvent e) {
                if (textField.getText().isEmpty()) {
                    textField.setText(placeholder);// 初始显示占位符
                    textField.setForeground(PLACEHOLDER_COLOR);
                    if (textField instanceof JPasswordField) {
                        ((JPasswordField) textField).setEchoChar((char) 0); // 显示占位符文本
                    }
                }
            }
        });
    }


    private void setupActions() {
        loginButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String username = usernameField.getText();
                String password = new String(passwordField.getPassword());

                // 处理占位符情况
                if (username.equals("请输入用户名")) username = "";
                if (password.equals("请输入密码")) password = "";


                // 这里进行登录验证逻辑
                if (username.equals("admin") && password.equals("password")) {
                    statusLabel.setForeground(new Color(0,150,0)); // 绿色
                    statusLabel.setText("登录成功!");
                    JOptionPane.showMessageDialog(ModernLoginScreen.this,
                            "登录成功！欢迎 " + username,
                            "成功",
                            JOptionPane.INFORMATION_MESSAGE);
                    // 这里可以添加跳转到主界面的代码
                    // dispose(); // 关闭登录窗口
                } else {
                    statusLabel.setForeground(Color.RED);
                    statusLabel.setText("用户名或密码错误!");
                    passwordField.setText(""); // 清空密码框
                    if (passwordField.getForeground().equals(PLACEHOLDER_COLOR)) { // 如果是占位符状态
                        passwordField.setText("请输入密码");
                        passwordField.setEchoChar((char)0);// 显示占位符文本
                    } else {
                        passwordField.setEchoChar('•');// 恢复密码掩码
                    }
                }
            }
        });

        // 按下回车键时触发登录按钮的点击事件
        usernameField.addActionListener(e -> loginButton.doClick());
        passwordField.addActionListener(e -> loginButton.doClick());
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            new ModernLoginScreen().setVisible(true);
        });
    }
}
