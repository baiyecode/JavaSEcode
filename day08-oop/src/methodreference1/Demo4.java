package methodreference1;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * ClassName: Demo4
 * Package: methodreference1
 * Description: 构造器引用
 *
 * @Author 白夜
 * @Create 2025/4/29 20:25
 * @Version 1.0
 */
public class Demo4 {
    public static void main(String[] args) {
        // 构造器引用
        // 构造器引用的语法格式： 类名::new
        //CarFactory cf = new CarFactory() {
        //    @Override
        //    public Car getCar(String name) {
        //        return new Car(name);
        //    }
        //};

        //CarFactory cf = ( (name)->  new Car(name) );

        //构造器引用
        //如果某个Lambda表达式里只是在创建对象，并且“→”前后参数情况一致，就可以使用构造器引用
        CarFactory cf = Car::new;

        Car c = cf.getCar("保时捷");
        System.out.println(c);
    }
}


interface CarFactory {
    Car getCar(String name);
}



@Data
@NoArgsConstructor
@AllArgsConstructor
class Car{
    private String name;
}
