package annotation;

import org.junit.Test;

import java.lang.annotation.Annotation;
import java.lang.reflect.Method;
import java.util.Arrays;

/**
 * ClassName: AnnotationDemo3
 * Package: annotation
 * Description: 注解的解析
 *
 * @Author 白夜
 * @Create 2025/7/25 16:30
 * @Version 1.0
 */
public class AnnotationDemo3 {
    // 目标：解析注解
    @Test
    public void parseClass() throws Exception {
        // 1.获取类对象
        Class c1 = Demo.class;
        // 2、使用isAnnotationPresent判断这个类上是否陈列了注解MyTest2
        if (c1.isAnnotationPresent(MyTest2.class)) {
            // 3、获取注解对象
            //Annotation MyTest2 = c1.getDeclaredAnnotation(MyTest2.class);
            //强转为MyTest2
            MyTest2 myTest2 = (MyTest2) c1.getDeclaredAnnotation(MyTest2.class);

            // 4、获取注解属性值
            String[] address = myTest2.address();
            double height = myTest2.height();
            String value = myTest2.value();

            // 5、打印注解属性值
            System.out.println(Arrays.toString(address));
            System.out.println(height);
            System.out.println(value);
        }
    }

    @Test
    public void parseMethod() throws Exception {
        // 1.获取类对象
        Class c1 = Demo.class;
        // 2、获取方法对象
        Method method = c1.getMethod("go");
        // 3、使用isAnnotationPresent判断这个方法上是否陈列了注解MyTest2
        if (method.isAnnotationPresent(MyTest2.class)) {
            // 4、获取注解对象
            MyTest2 myTest2 = method.getDeclaredAnnotation(MyTest2.class);

            // 5、获取注解属性值
            String[] address = myTest2.address();
            double height = myTest2.height();
            String value = myTest2.value();

            // 6、打印注解属性值
            System.out.println(Arrays.toString(address));
            System.out.println(height);
            System.out.println(value);
        }
    }

}
