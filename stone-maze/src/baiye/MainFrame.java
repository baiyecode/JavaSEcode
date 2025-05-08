package baiye;

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

/**
 * ClassName: MainFrame
 * Package: baiye
 * Description:
 *
 * @Author 白夜
 * @Create 2025/5/7 15:28
 * @Version 1.0
 */

// 自定义窗口类，创建对象，展示一个主窗口。
public class MainFrame extends JFrame{
    //设置一个常量存储图片文件地址
    public static final String IMAGE_PATH = "stone-maze/src/image/";

    //准备一个二维数组，存储数字色块的行列位置，4行4列
    private int[][] imageData = {
            {1, 2, 3, 4},
            {5, 6, 7, 8},
            {9, 10, 11, 12},
            {13, 14, 15, 0}
        };

    //定义一个二维数组,用来存储最终游戏成功的数据顺序。
    private int[][] winData = {
            {1, 2, 3, 4},
            {5, 6, 7, 8},
            {9, 10, 11, 12},
            {13, 14, 15, 0}
        };

    //定义两个整数变量记录当前空白色块的位置
    private int row; //行索引
    private int col; //列索引

    //统计步数
    private int count;


    public MainFrame(){
        //1、调用一个初始化方法，初始化窗口。
        initFrame();
        //4、打乱数组色块的顺序，再展示图片
        initRandomArray();
        //2、初始化界面:展示数字色块。
        initImage();
        //3、初始化系统菜单，点击弹出菜单信息是退出游戏，重启游戏。
        initMenu();
        
        //5、给当前窗口绑定上下左右按键事件
        initKeyPressEvent();


        // 设置窗口可见
        this.setVisible(true);
    }

    private void initKeyPressEvent() {
        //给当前窗口绑定上下左右按键事件
        this.addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent e) {
                // 获取当前按键编号
                int keyCode = e.getKeyCode();
                // 判断按键编号是否是上下左右按键
                switch (keyCode) {
                    case KeyEvent.VK_UP://按下上方向键
                        switchAndMove(Direction.UP);
                        break;
                    case KeyEvent.VK_DOWN://按下下方向键
                        switchAndMove(Direction.DOWN);
                        break;
                    case KeyEvent.VK_LEFT://按下左方向键
                        switchAndMove(Direction.LEFT);
                        break;
                    case KeyEvent.VK_RIGHT://按下右方向键
                        switchAndMove(Direction.RIGHT);
                        break;
                    default:
                        break;
                }
            }


        });
    }

    //控制数据交换，图片移动
    private void switchAndMove(Direction r) {
        //判断图片的方向，再控制移动
        switch (r) {
            case UP:
                //上是下面的色块往上走，空白色块往下走
                //上交换的条件是行必须<3，也就是0，1，2行，然后才开始交换，因为如果在第3行，下面没有色块往上交换
                //当前空白色块位置    row col
                //需要被交换色块的位置 row+1 col
                if (row < imageData.length - 1) {
                    int temp = imageData[row][col];
                    imageData[row][col] = imageData[row + 1][col];
                    imageData[row + 1][col] = temp;
                    // 交换后，更新当前空白色块的位置
                    row++;
                    count++;
                }
                break;
            case DOWN:
                //下是上面的色块往下走，空白色块往上走
                //下交换的条件是行必须>0，也就是1，2,3行，然后才开始交换，因为如果在第0行，上面没有色块往下交换
                //当前空白色块位置    row col
                //需要被交换色块的位置 row-1 col
                if (row > 0) {
                    int temp = imageData[row][col];
                    imageData[row][col] = imageData[row - 1][col];
                    imageData[row - 1][col] = temp;
                    // 交换后，更新当前空白色块的位置
                    row--;
                    count++;
                }
                break;
            case LEFT:
                //左是右面的色块往左走，空白色块往右走
                //左交换的条件是列必须<3，也就是0，1，2列，然后才开始交换，因为如果在第3列，右边没有色块往左交换
                //当前空白色块位置    row col
                //需要被交换色块的位置 row col+1
                if (col < imageData.length - 1) {
                    int temp = imageData[row][col];
                    imageData[row][col] = imageData[row][col + 1];
                    imageData[row][col + 1] = temp;
                    // 交换后，更新当前空白色块的位置
                    col++;
                    count++;
                }
                break;
            case RIGHT:
                //右是左面的色块往右走，空白色块往左走
                //右交换的条件是列必须>0，也就是1，2,3列，然后才开始交换，因为如果在第0列，左边没有色块往右交换
                //当前空白色块位置    row col
                //需要被交换色块的位置 row col-1
                if (col > 0) {
                    int temp = imageData[row][col];
                    imageData[row][col] = imageData[row][col - 1];
                    imageData[row][col - 1] = temp;
                    // 交换后，更新当前空白色块的位置
                    col--;
                    count++;
                }
                break;
        }
        //刷新游戏界面
        initImage();
    }

    private void initRandomArray() {
        // 打乱二维数组色块的顺序
        for (int i = 0; i < imageData.length; i++) {
            for (int j = 0; j < imageData[i].length; j++) {
                //随机两个行列位置，让两个位置交换
                int i1 = (int) (Math.random() * imageData.length);//获取随机行i
                int j1 = (int) (Math.random() * imageData.length);//获取随机列j

                int i2 = (int) (Math.random() * imageData.length);
                int j2 = (int) (Math.random() * imageData.length);

                int temp = imageData[i1][j1];
                imageData[i1][j1] = imageData[i2][j2];
                imageData[i2][j2] = temp;
            }
        }

        // 获取空白色块的位置
        //遍历二维数组，获取0的位置，就是空白色块的位置
        OUT:
        for (int i = 0; i < imageData.length; i++) {
            for (int j = 0; j < imageData[i].length; j++) {
                if (imageData[i][j] == 0) {
                    //获取空白色块的位置
                    row = i;
                    col = j;
                    break OUT;//跳出两个for循环
                }
            }
        }
    }

    private void initMenu() {
        JMenuBar menuBar = new JMenuBar();//创建一个菜单栏
        JMenu menu = new JMenu("系统");//创建一个菜单
        JMenuItem exitJi = new JMenuItem("退出游戏");//创建一个菜单项
        menu.add(exitJi);//将菜单项添加到菜单中
        exitJi.addActionListener(e -> {
            dispose();//关闭销毁窗口
        });
        //添加菜单，重启游戏
        JMenuItem restartJi = new JMenuItem("重新开始");
        menu.add(restartJi);
        restartJi.addActionListener(e -> {
            //重新启动游戏
            count = 0;//步数清零
            initRandomArray();//重新打乱数组
            initImage();//重新绘制窗口
        });
        menuBar.add(menu);//将菜单添加到菜单栏中
        this.setJMenuBar(menuBar);//将菜单栏添加到窗口中


    }

    private void initImage() {
        //先清空窗口上的全部图层
        this.getContentPane().removeAll();

        //刷新界面时，显示步数
        //给窗口添加一个展示文字的组件
        JLabel countText = new JLabel("当前移动" + count + "步数");
        countText.setBounds(0, 0, 120, 20);
        //把文字变成红色
        countText.setForeground(Color.RED);
        this.add(countText);



        //判断是否赢了
        if(isWin()){
            //展示胜利的图片
            JLabel label = new JLabel();
            label.setIcon(new ImageIcon(IMAGE_PATH + "win.png"));
            label.setBounds(124, 230, 266, 88);
            this.add(label);
        }

        //1、展示一个行列矩阵的图片色块依次铺满窗口(4 * 4)
        for (int i = 0; i < imageData.length; i++) {
            for (int j = 0; j < imageData[i].length; j++) {
                //获取图片名称
                String imageName = imageData[i][j] + ".png";
                //2、创建一个JLabel对象，设置图片给他展示。
                JLabel label = new JLabel();//用于显示不可编辑的文本、图标（图片）或两者的组合
                //设置图片到label上
                label.setIcon(new ImageIcon(IMAGE_PATH + imageName));
                //设置图片位置
                label.setBounds(20 + j * 100, 70 + i * 100, 100, 100);
                //把图片添加到窗口中
                this.add(label);

            }
        }
        //设置绝对布局后生成的图层在后面显示，所以色块在背景图片上面

        //2、添加背景图片
        JLabel background = new JLabel(new ImageIcon(IMAGE_PATH + "background.png"));
        background.setBounds(0, 10, 450, 484);
        this.add(background);

        //刷新图层，重新绘制窗口
        this.repaint();
    }

    private boolean isWin() {
        //判断赢了的数组是否和初始数组一致
        for (int i = 0; i < imageData.length; i++) {
            for (int j = 0; j < imageData[i].length; j++) {
                if (imageData[i][j] != winData[i][j]) {
                    return false;
                }
            }
        }
        //赢了
        return true;
    }


    private void initFrame() {
        // 设置窗口的标题
        this.setTitle("石头迷宫 v1.0 baiye");
        // 设置窗口的大小
        this.setSize(465, 575);
        // 设置窗口的关闭方式
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        // 设置窗口居中
        this.setLocationRelativeTo(null);
        // 设置布局方式为绝对位置定位
        this.setLayout(null);


    }
}
