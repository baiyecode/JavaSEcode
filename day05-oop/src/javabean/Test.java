package javabean;

/**
 * ClassName: Test
 * Package: javabean
 * Description: 实体类
 *
 * @Author 白夜
 * @Create 2025/4/11 15:55
 * @Version 1.0
 */
public class Test {
    public static void main(String[] args) {
        // 目标:搞清楚实体类是啥?搞清楚其基本作用和应用场景。
        // 实体类的基本作用:创建它的对象，存取数据(封装数据)
        Student s1 = new Student(); //无参构造器
        s1.setName("白夜");
        s1.setChinese(100);
        s1.setMath(100);
        System.out.println(s1.getName());
        System.out.println(s1.getChinese());
        System.out.println(s1.getMath());


        Student s2 = new Student("白夜", 70, 90); //有参构造器
        System.out.println(s2.getName());
        System.out.println(s2.getChinese());
        System.out.println(s2.getMath());


        //实体类在开发中的应用场景。
        //创建一个学生的操作对象专门负责对学生对象的数据进行业务处理。
        StudentOperator operator = new StudentOperator(s1);
        operator.printAllScore();
        operator.printAverageScore();

        StudentOperator operator2 = new StudentOperator(s2);
        operator2.printAllScore();
        operator2.printAverageScore();


    }

}
