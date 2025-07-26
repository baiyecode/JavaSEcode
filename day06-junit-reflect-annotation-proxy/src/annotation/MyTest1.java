package annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * ClassName: MyTest1
 * Package: annotation
 * Description: 元注解
 *
 * @Author 白夜
 * @Create 2025/7/25 16:15
 * @Version 1.0
 */
@Target({ElementType.METHOD,ElementType.FIELD})
@Retention(RetentionPolicy.RUNTIME)
public @interface MyTest1 {

    /**
     * @Target 作用：声明被修饰的注解只能在哪些位置使用
     * @Target(ElementType.TYPE) 可以多个
     * @Target({ElementType.METHOD,ElementType.FIELD}) 注解成员方法和成员变量
     * ● TYPE，类，接口
     * ● FIELD, 成员变量
     * ● METHOD, 成员方法
     * ● PARAMETER, 方法参数
     * ● CONSTRUCTOR, 构造器
     * ● LOCAL_VARIABLE, 局部变量
     *
     * @Retention 作用：声明注解的保留周期。
     * @Retention(RetentionPolicy.RUNTIME)  只能一个
     * ● SOURCE 只作用在源码阶段，字节码文件中不存在。
     * ● CLASS（默认值）保留到字节码文件阶段，运行阶段不存在.
     * ● RUNTIME（开发常用）一直保留到运行阶段。
     */

}
