package genericity3;

import genericity2.Data;
import genericity2.Teacher;
import genericity2.TeacherData;

import java.util.ArrayList;

/**
 * ClassName: GenericityDemo4
 * Package: genericity3
 * Description: 泛型方法
 *
 * @Author 白夜
 * @Create 2025/5/13 20:48
 * @Version 1.0
 */
public class GenericDemo4 {
    public static void main(String[] args) {
            // 目标:理解通配符和上下限。
            //需求:开发一个极品飞车的游戏。
        ArrayList<Xiaomi> xiaomis = new ArrayList<>();
        xiaomis.add(new Xiaomi());
        xiaomis.add(new Xiaomi());
        xiaomis.add(new Xiaomi());
        go(xiaomis);

        ArrayList<BYD> byds = new ArrayList<>();
        byds.add(new BYD());
        byds.add(new BYD());
        byds.add(new BYD());
        go(byds);

        //ArrayList<Dog> dogs = new ArrayList<>();
        //dogs.add(new Dog());
        //dogs.add(new Dog());
        //dogs.add(new Dog());
        //go(dogs);
    }
    // 虽然Xiaomi和BYD是Car的子类，但是ArrayList<Xiaomi>，ArrayList<BYD>和ArrayList<Car>是不同的类型。

    //public static void go(ArrayList<Car> cars) {}
    //public static void go(ArrayList<?> cars) {}

    //泛型上限：?  extends  Car：?能接收的必须是Car或者其子类
    public static void go(ArrayList<? extends Car> cars) {
    }
    //泛型下限：?  super  Car：?能接收的必须是Car或者其父类
    public static void go2(ArrayList<? super Car> cars) {
    }

}

