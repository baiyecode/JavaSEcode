package exception;

/**
 * ClassName: ExceptionDemo2
 * Package: exception
 * Description: 异常的作用
 *
 * @Author 白夜
 * @Create 2025/5/12 20:26
 * @Version 1.0
 */
public class ExceptionDemo2 {
    public static void main(String[] args) {
            //理解异常作用
        //可以作为方法内部的一种特殊返回值以便通知上层调用者，方法的执行问题
        System.out.println("程序执行了~~~~");
        try {
            System.out.println(getResult(10, 0));
            System.out.println("程序成功了~~~~");
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("程序失败了~~~~");
        }
        System.out.println("程序结束了~~~~");
    }

    //需求:求2个数的除的结果，并返回这个结果。
    public static int getResult(int a, int b) throws Exception {
        if (b == 0) {
            System.out.println("除数不能为0");
            //return -1;//如果结果刚好是-1，会有问题
            //throw new RuntimeException("除数不能为0");返回一个异常，不用return
            throw new Exception("除数不能为0");//也可以返回一个编译时异常更明显的提醒
        }
        int result = a / b;
        return result;
    }
}
