package interface2;

/**
 * ClassName: Test
 * Package: interface2
 * Description: 接口的好处
 *
 * @Author 白夜
 * @Create 2025/4/23 14:59
 * @Version 1.0
 */
public class Test {
    public static void main(String[] args) {
        //理解接口的好处
        //接口弥补了类单继承的不足，可以让类拥有更多角色，类的功能更强大
        People p = new Student();
        Driver d = new Student(); //多态
        Friend f = new Student();



        //接口可以实现面向接口编程，更利于解合。
        Driver d1 = new Teacher();
        Driver d2 = new Student();
    }
}

interface Driver{ }
interface Friend{ }
class People{ }
class Student extends People implements Driver, Friend{ }

class Teacher extends People implements Driver, Friend{ }
