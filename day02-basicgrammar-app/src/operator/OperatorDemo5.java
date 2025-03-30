package operator;

/**
 * ClassName: OperatorDemo5
 * Package: operator
 * Description: 逻辑运算符
 *
 * @Author 白夜
 * @Create 2025/3/30 15:52
 * @Version 1.0
 */
public class OperatorDemo5 {
    public static void main(String[] args) {
        boolean flag = isMatch(180,70,'男');
        System.out.println(flag);//false
        boolean flag1 = isMatch(180,70,'女');
        System.out.println(flag1);//true
        boolean flag2 = isMatch1(180,30000);
        System.out.println(flag2);//true
        boolean flag3 = isMatch1(150,3000000);
        System.out.println(flag3);//true

        System.out.println("===================");
        isMatch2(true);//false
        isMatch3();
        print();
        print1();

    }
    //逻辑运算符
    //需求:判断某个人的条件是否满足择偶要求，如果满足返回true.否则是false
    //条件是:身高高于170，体重在60-80之间，且性别为女。
    //逻辑运算符:& ，逻辑与，所有条件都是为true才为true，只要有一个为false，就为false
    public static boolean isMatch(int height,int weight,char sex){
        boolean flag = height >= 170 & weight >= 60 & weight <= 80 & sex == '女';
        return flag;
    }
    //需求:找一个男朋友，要求是要么身高高于180，要么收入高于30万。
    //逻辑运算符:| ，逻辑或，只要有一个为true，就为true，所有条件都是为false才为false
    public static boolean isMatch1(int height,int income){
        boolean flag = height >= 180 | income > 300000;
        return flag;
    }

    //逻辑运算符:! ，逻辑非，取反
    public static void isMatch2(boolean flag){
        System.out.println(!flag);
    }

    //逻辑运算符:^ ，逻辑异或，两个条件有一个为true，就为true，两个条件都是true，或者都是false，就为false，
    //不同才为true
    public static void isMatch3(){
        System.out.println(true ^ true);//false
        System.out.println(true ^ false);//true
        System.out.println(false ^ true);//true
        System.out.println(false ^ false);//false

    }
    //判断&& 和 & 的区别，|| 和 | 的区别
    public static void print() {
        int a = 111;
        int b = 22;
        //&&一旦发现第一个条件为false，第二个条件直接不执行，b的值为22，不会执行++b
        //System.out.println(a > 1000 && ++b > 2);
        //System.out.println(b);//22
        System.out.println(a > 1000 & ++b > 2);//false
        //&就算发现第一个条件为false，都会执行第二个条件，b = 23,会执行++b
        System.out.println(b);



    }
    public static void print1() {
        int a = 111;
        int b = 22;
        // ||只要发现第一个条件为true，第二个条件直接不执行，b的值为22，不会执行++b
        //System.out.println(a > 100 || ++b > 2);//true
        //System.out.println(b);//22
        // |就算发现第一个条件为true，第二个条件还是会执行，b的值为23，会执行++b
        System.out.println(a > 100 | ++b > 2);//true
        System.out.println(b);//23

    }

}
