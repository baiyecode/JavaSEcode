package demo;

/**
 * ClassName: Test4
 * Package: demo
 * Description:找素数
 *
 * @Author 白夜
 * @Create 2025/4/3 22:03
 * @Version 1.0
 */
public class Test4 {
    public static void main(String[] args) {
        int count = 0;
        //遍历101-200,判断是否是素数,是就输出
        System.out.println("101-200之间的素数有：");
        for (int i = 101; i <= 200; i++) {
            if(isPrime(i)){
                System.out.print(i + " ");//输出素数,不换行
                count++;
            }
        }
        System.out.println();
        System.out.println("素数的个数为" + count);

    }
    //判断101-200之间有多少个素数，并输出所有素数。
    //素数：除了1和本身，不能被其他数整除
    //比如3，7就是素数，而9，21不是素数

    //定义一个方法判断一个数是否是素数
    public static boolean isPrime(int n){
        //定义一个变量，用来记录是否是素数
        //从2到n-1遍历，判断n能否整除
        //for (int i = 2; i < n; i++) {
        //    if(n % i == 0){
        //        flag = false;
        //        break;
        //    }
        //}
        //也可以用2到这个数的开平方i <= Math.sqrt(n)，或者一半来判断
        //定义一个循环从2开始找到该数的一半，只要发现有一个数字能整数num这个数，num就不是素数
        for (int i = 2; i <= n / 2; i++) {
            //i=2 3 4 5
            //2、判断num是否能被i整除，能则返回false，不能则返回true
            if(n % i == 0){
                return false;
            }
        }
        return true;//是素数
    }

}
