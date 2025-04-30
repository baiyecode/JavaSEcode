package stringdemo;

/**
 * ClassName: StringTest2
 * Package: stringdemo
 * Description: string案例
 *
 * @Author 白夜
 * @Create 2025/4/30 16:13
 * @Version 1.0
 */
public class StringTest2 {
    public static void main(String[] args) {
        // 目标:生成验证码。
        System.out.println(getCode(4));


    }

    // 帮我生成指定位数的随机验证码返回，每位可能是大小写字母或者数字，
    // 帮我用String变量记住全部要用到的字符。
    public static String getCode(int n) {
        //1、定义一个字符串变量，保存所有要用到的字符。
        String str = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";
        //2、定义一个变量，用来保存最终的验证码。
        String code = "";
        //3、循环n次，每次生成一个随机字符，拼接成字符申。
        for (int i = 0; i < n; i++) {
            //4、使用随机索引，从str中获取一个字符。
            int index = (int) (Math.random() * str.length()); //[0,1) * str.length() -> 0~str.length()-1
            //5、根据索引获取字符，把字符拼接成字符串。
            char c = str.charAt(index);
            code += c;
        }
        //6、返回最终的验证码。
        return code;
    }
}
