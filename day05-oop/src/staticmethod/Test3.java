package staticmethod;

/**
 * ClassName: Test3
 * Package: staticmethod
 * Description:
 *
 * @Author 白夜
 * @Create 2025/4/11 20:08
 * @Version 1.0
 */
public class Test3 {
    public static void main(String[] args) {


        //注册界面
        //开发一个验证码程序
        //String code = getCode(4);
        String code = VerifyCodeUtil.getCode(6);
        System.out.println(code);

        //工具类私有化构造器，不能创建对象
        //VerifyCodeUtil vc = new VerifyCodeUtil();


        System.out.println(Math.random());//  [0,1)




    }



    //public static String getCode(int n) {
    //    // 2、定义一个字符串变量，用来保存验证码
    //    String code = "";
    //    // 3、循环n次，每次生成一个验证码
    //    for (int i = 0; i < n; i++) {
    //        //i=0 1 2 3
    //        //4、为当前位置随机生成一个数字或者大写字母或者小写字母。数字 0 / 大写1 / 小写2
    //        // 随机一个0或者1或者2表示当前位置随机的字符类型。
    //        int type = (int) (Math.random() * 3);//[0,1) * 3 => 0,1,2
    //        //5、使用switch判断当前位置随机的字符类型
    //        switch (type) {
    //            case 0:
    //                //6、如果当前位置是数字，则随机一个0~9的数字，并拼接到code中
    //                int num = (int) (Math.random() * 10);//0~9
    //                code += num;
    //                break;
    //            case 1:
    //                //7、如果当前位置是大写字母，如果当前位置是大写字母，则随机生成一个字母A-Z，然后拼接。
    //                int num1 = (int) (Math.random() * 26);//    'A' = 65, 'Z' = 90
    //                char ch = (char) (65 + num1);//得到A-Z的ASCII码值，然后转成对应的字母。
    //                code += ch;
    //                break;
    //            case 2:
    //                //8、如果当前位置是小写字母，如果当前位置是小写字母，则随机生成一个字母a-z，然后拼接。
    //                int num2 = (int) (Math.random() * 26);//    'a' = 97, 'z' = 122
    //                char ch1 = (char) (97 + num2);//得到a-z的ASCII码值，然后转成对应的字母。
    //                code += ch1;
    //                break;
    //        }
    //    }
    //    return code;
    //}

}
