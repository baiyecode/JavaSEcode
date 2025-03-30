package method;

/**
 * ClassName: MethodDemo
 * Package: method
 * Description: 掌握方法的定义和调用
 *
 * @Author 白夜
 * @Create 2025/3/28 15:47
 * @Version 1.0
 */
public class MethodDemo {
    public static void main(String[] args) {
        int sum = getSum(10, 20);
        System.out.println(sum);
        printHelloWorld();
        System.out.println(getCode(4));
        int sum1 = addNumbers(5, 3);
        System.out.println("两数之和：" + sum1);
        greetUser("小明");
        System.out.println(getWelcomeMessage());
        showHint();

    }
    //定义一个方法，求任意两个整数的和并返回
    public static int getSum(int a,int b){
        int sum = a + b;
        return sum;
    }

    //打印三行HelloWorld,不需要参数，也不需要返回值
    //如果方法没有返回结果，则返回值声明类型为void
    //无参数，无返回值的方法
    public static void printHelloWorld(){
        System.out.println("HelloWorld");
        System.out.println("HelloWorld");
        System.out.println("HelloWorld");
    }
    //需求：获取一个指定位数的验证码返回。
    //方法的定义格式,定义方法时要看是否要接受处理数据，是否需要返回数据
    //需要接受数据，需要接受位数，int len
    //需要返回数据，需要返回验证码 String
    //有参数有返回值的方法
    /**
     * 生成指定长度的随机数字字符串
     * 该方法用于生成一次性验证码或类似功能所需的随机数字序列
     *
     * @param len 期望生成的代码长度
     * @return 返回生成的随机数字字符串
     */
    public static String getCode(int len) {
        // 初始化空字符串，用于拼接生成的随机数字
        String code = "";
        // 循环len次，生成len个随机数字
        for(int i = 0; i < len; i++) {
            // 生成0到9之间的随机数
            int num = (int)(Math.random() * 10);
            // 将生成的随机数字拼接到code字符串中
            code += num;
        }
        // 返回拼接完成的随机数字字符串
        return code;
    }
    //在Java中，int 类型的变量可以直接与 String 类型进行拼接。
    // 这是因为当 int 与 String 进行拼接时，Java会自动将 int 转换为 String 类型，
    // 然后执行字符串拼接操作。
    /* 具体解释：
       在Java中，+ 运算符既可以用于数值相加，也可以用于字符串拼接。
       如果 + 运算符的一侧是 String 类型，则另一侧的非字符串类型（如 int、double 等）
       会被自动转换为字符串，然后进行拼接
       因此，sum 是 int 类型时，可以直接与 String 类型拼接，无需手动转换
     */

        // 1. 有参数 + 有返回值
        // 示例：计算两个数字的和
        public static int addNumbers(int a, int b) {
            return a + b;
        }

        // 2. 有参数 + 无返回值
        // 示例：打印问候语
        public static void greetUser(String name) {
            System.out.println("你好，" + name + "！");
        }

        // 3. 无参数 + 有返回值
        // 示例：获取固定欢迎信息
        public static String getWelcomeMessage() {
            return "欢迎使用本程序！";
        }

        // 4. 无参数 + 无返回值
        // 示例：打印简单提示
        public static void showHint() {
            System.out.println("这是一个无参数无返回值的方法！");
        }





}
