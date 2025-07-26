package junit;

/**
 * ClassName: StringUtil
 * Package: junit
 * Description: 单元测试
 *
 * @Author 白夜
 * @Create 2025/7/23 20:34
 * @Version 1.0
 */
public class StringUtil {
    public static void printNumber(String name){
        if(name == null){
            System.out.println("参数为null！请注意");
            return;
        }
        System.out.println("名字长度是：" + name.length());
    }

    /**
     * 求字符串的最大索引
     */
    public static int getMaxIndex(String data){
        //"".equals(data) 由""调用equals方法，保证不是null，不会发生空指针异常
        //data.equals("") 由data调用equals方法，不能保证data不为null，可能会发生空指针异常
        if(data == null || "".equals(data)) {
            return -1;
        }
        //return data.length() ;
        return data.length() - 1;
    }

}
