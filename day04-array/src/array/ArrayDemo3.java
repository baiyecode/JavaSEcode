package array;

/**
 * ClassName: ArrayDemo3
 * Package: array
 * Description: 数组求极值
 *
 * @Author 白夜
 * @Create 2025/4/5 20:52
 * @Version 1.0
 */
public class ArrayDemo3 {
    public static void main(String[] args) {
        int[] scores = {15,9000,10000,20000,9500,-5};
        int max = getMax(scores);
        System.out.println("最大值为：" + max);

    }
    //求最大值
    public static int getMax(int[] arr){
        //1、定义一个变量，保存数组中的最大值
        int max = arr[0];
        //从第二个元素开始遍历
        for (int i = 1; i < arr.length; i++) {
            //依次与参照进行比较
            //if (arr[i] > max) {
            //    max = arr[i];
            //}
            //节省性能可以不用每次循环都遍历查找一次数组中的元素
            int data = arr[i];
            if (data > max) {
                max = data;
            }
        }
        return max;
    }

}
