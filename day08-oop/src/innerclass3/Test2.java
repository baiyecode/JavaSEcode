package innerclass3;

/**
 * ClassName: Test2
 * Package: innerclass3
 * Description: 匿名内部类的使用形式
 *
 * @Author 白夜
 * @Create 2025/4/26 15:40
 * @Version 1.0
 */
public class Test2 {
    public static void main(String[] args) {
        // 目标:搞清楚匿名内部类的使用形式(语法):通常可以做为一个对象参数传输给方法使用。
        // 需求:学生，老师都要参加游泳比赛。
        //Swim s1 = new Teacher();
        //start(s1);
        Swim s = new Swim() {
            @Override
            public void swimming() {
                System.out.println("老师自由泳~~~");
            }
        };
        start(s);
        //Swim s2 = new Swim() {
        //    @Override
        //    public void swimming() {
        //        System.out.println("学生蛙泳~~~");
        //    }
        //};
        //start(s2);
        System.out.println("==================");
        //简化
        start(new Swim() {
            @Override
            public void swimming() {
                System.out.println("学生蛙泳~~~");
            }
        });


    }
    public static void start(Swim s) {
        System.out.println("比赛开始...");
        s.swimming();
        System.out.println("比赛结束...");
    }
}

//class Teacher implements Swim {
//    public void swimming() {
//        System.out.println("老师自由泳~~~");
//    }
//}
//class Student implements Swim {
//    public void swimming() {
//        System.out.println("学生蛙泳~~~");
//    }
//}
interface Swim {
    public void swimming();
}
