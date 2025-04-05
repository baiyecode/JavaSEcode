package array;

/**
 * ClassName: ArrayDemo4
 * Package: array
 * Description: 二维数组
 *
 * @Author 白夜
 * @Create 2025/4/5 21:53
 * @Version 1.0
 */
public class ArrayDemo4 {
    public static void main(String[] args) {
                //二维数组
        print();
    }
    //存储班级座位上的学生名称，并要求输出学生名称时，能直观看到该学生所在的位置。
    //第一排:张无忌 赵敏周芷若
    //第二排:张三丰 宋远桥 殷梨亭
    //第三排: 灭绝 陈昆 玄冥二老 金毛狮王
    //第四排:杨逍 纪晓芙
    public static void print() {
        //二维数组每个元素都是一维数组
        //静态初始化
        String[][] arr = {
                {"张无忌", "赵敏", "周芷若"},// 0 第一排
                {"张三丰", "宋远桥", "殷梨亭"},// 1 第二排
                {"灭绝", "陈昆", "玄冥二老", "金毛狮王"},  // 2 第三排
                {"杨逍", "纪晓芙"}//第四排
        };
        //访问：数组名[ 行索引 ]
        String[] names = arr[1];
        for (int i = 0; i < names.length; i++) {
            System.out.println(names[i]);
        }
        //访问2：数组名[ 行索引 ][ 列索引 ]
        System.out.println(arr[1][1]);//宋远桥
        System.out.println(arr[2][2]);//玄冥二老
        //长度访问：数组名.length
        System.out.println(arr.length);//4 整体元素个数
        System.out.println(arr[1].length);//3 具体的一维数组元素个数

        for (int i = 0; i < arr.length; i++) {
            //遍历二维数组
            for (int j = 0; j < arr[i].length; j++) {
                //遍历具体的一维数组
                System.out.print(arr[i][j] + "\t");
            }
            System.out.println();
        }
            //String[] names2 = arr[i];
            //for (int j = 0; j < names2.length; j++) {
            //    System.out.print(names2[j] + "\t");
            //}
            //System.out.println();


        //打乱二维数组中的元素顺序
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                //获取当前元素的值 arr[i][j]
                //获取随机行m和列p
                int m = (int) (Math.random() * arr.length);
                //获取随机列p,arr[m].length是因为每行的列数不一样，用m可以获取到具体随机到的某一行的列数，
                int p = (int) (Math.random() * arr[m].length);
                //定义一个临时变量，用来存储当前元素的值
                String temp = arr[m][p];
                //将当前位置i行j列的元素值，赋值给m行p列的元素
                arr[m][p] = arr[i][j];
                //将m行p列的数据temp，赋值给当前位置i行j列的元素
                arr[i][j] = temp;
            }
        }
        System.out.println("===========");
        for (int i = 0; i < arr.length; i++) {
            //遍历二维数组
            for (int j = 0; j < arr[i].length; j++) {
                //遍历具体的一维数组
                System.out.print(arr[i][j] + "\t");
            }
            System.out.println();
        }
        //动态初始化
        String[][] arr2 = new String[4][5];//4行5列
    }
}
