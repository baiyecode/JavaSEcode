package array;

/**
 * ClassName: ArrayTest2
 * Package: array
 * Description: 二维数组案例
 *
 * @Author 白夜
 * @Create 2025/4/5 22:19
 * @Version 1.0
 */
public class ArrayTest2 {
    public static void main(String[] args) {
        //目标:完成数字华容道的初始化和随机乱序。
        start(5);

    }
    //数字华容道
    public static void start(int n) {
        //创建一个二维数组存储数字列表
        int[][] arr = new int[n][n];
        //遍历数组，填充数字，初始化
        int count = 1;//定义一个变量，用来填充数字
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = count++;
            }
        }
        //遍历数组,打印出来
        printArray(arr);

        System.out.println("===============");

        //打乱二维数组中的元素顺序
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                //获取当前元素的值 arr[i][j]
                //获取随机行m和列p
                int m = (int) (Math.random() * arr.length);
                int p = (int) (Math.random() * arr[i].length);
                //获取随机列p,当用arr[m].length是因为每行的列数不一样，用m可以获取到具体随机到的某一行的列数，
                //int p = (int) (Math.random() * arr[m].length);
                //定义一个临时变量，用来存储当前元素的值
                int temp = arr[m][p];
                //将当前位置i行j列的元素值，赋值给m行p列的元素
                arr[m][p] = arr[i][j];
                //将m行p列的数据temp，赋值给当前位置i行j列的元素
                arr[i][j] = temp;
            }
        }
        printArray(arr);
    }

        //设计一个方法遍历二维数组
    public static void printArray(int[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + "\t");
            }
            System.out.println();
        }
    }


}
