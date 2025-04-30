package lambda;

import innerclass3.Student;

import javax.swing.*;
import java.util.Arrays;

/**
 * ClassName: LambdaDemo2
 * Package: lambda
 * Description: lambda表达式案例
 *
 * @Author 白夜
 * @Create 2025/4/29 17:15
 * @Version 1.0
 */
public class LambdaDemo2 {
    public static void main(String[] args) {
        //lambda表达式简化comparator接口案例
        test1();
        test2();

    }

    public static void test1(){
        //准备一个学生类型的数组，存放6个学生对象。
        Student[] students = new Student[6];
        students[0] = new Student("赵敏",27,1.68,'女');
        students[1] = new Student("周芷若",20,1.70,'女');
        students[2] = new Student("张无忌",25,1.69,'男');
        students[3] = new Student("赵敏",28,1.68,'女');
        students[4] = new Student("小昭",18,1.68,'女');
        students[5] = new Student("灭绝",35,1.68,'女');

        // 需求:按钮年龄升序排序。可以调用sun公司写好的API直接对数组进行排序
        //public static void sort(T[] a, Comparator<T> c) {
        //      参数一: 需要排序的数组
        //      参数二:需要给sort声明一个Comparator比较器对象(指定排序的规则)
        //      Comparator接口的实现类对象，匿名内部类
        //Arrays.sort(students, new Comparator<Student>() {
        //    //指定排序规则:
        //    //如果你认为左边对象大于右边对象那么返回正整数。
        //    //如果你认为左边对象于右边对象那么返回负数。
        //    //如果两边相等那么返回0。
        //    @Override
        //    public int compare(Student o1, Student o2) {
        //        return o1.getAge() - o2.getAge();//年龄升序排序
        //        //return o2.getAge() - o1.getAge();//年龄降序排序
        //    }
        //});
        //lambda表达式简化comparator
        //Arrays.sort(students, (Student o1, Student o2) -> {
        //        return o1.getAge() - o2.getAge();
        //    });

        //进一步优化省略参数类型
        //Arrays.sort(students, ( o1,  o2) -> {
        //    return o1.getAge() - o2.getAge();
        //});
        //如果只有一个参数，参数类型省略的同时“(  )”也可以省略，但多个参数不能省略“(  )”

        //如果Lambda表达式中只有一行代码，大括号可以不写，同时要省略分号“ ; ”如果这行代码是return语句，也必须去掉return。
        Arrays.sort(students, ( o1,  o2) -> o1.getAge() - o2.getAge());

        //遍历数组中学生对象并输出
        for (int i = 0; i < students.length; i++) {
            Student s = students[i];
            System.out.println(s);
        }
    }

    public static void test2(){
        // 需求:创建一个登录窗口，窗口上只有一个登录按钮
        JFrame jf = new JFrame("登录窗口");
        jf.setSize(400, 300);//设置窗口大小
        jf.setLocationRelativeTo(null);//设置窗口居中
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//设置窗口关闭方式


        JPanel jPanel = new JPanel();//创建面板
        jf.add(jPanel);//将面板添加到窗口中

        JButton jb = new JButton("登录");//创建登录按钮
        jPanel.add(jb);//将登录按钮添加到面板中

        //java要求必须给这个按钮添加一个点击事件监听器对象，这样就可以监听用户的点击操作，就可以做出反应。
        //jb.addActionListener(new clickListener());
        //匿名内部类
        //开发中不是我们要主动去写医名内部类，而是用别人的功能的时候，别人可以让我们写一个匿名内部类吗，我们才会写!

        //jb.addActionListener(new ActionListener() {
        //    @Override
        //    public void actionPerformed(ActionEvent e) {
        //        System.out.println("登录成功");
        //    }
        //});

        //lambda表达式简化代码
        //jb.addActionListener((ActionEvent e) -> { System.out.println("登录成功");} );

        //jb.addActionListener((e) -> { System.out.println("登录成功");} );

        //如果只有一个参数，参数类型省略的同时“(  )”也可以省略，但多个参数不能省略“(  )”
        //jb.addActionListener(e -> { System.out.println("登录成功");} );

        //如果Lambda表达式中只有一行代码，大括号可以不写，同时要省略分号“ ; ”如果这行代码是return语句，也必须去掉return。
        jb.addActionListener(e -> System.out.println("登录成功"));





        jf.setVisible(true);//设置窗口可见
    }
}
