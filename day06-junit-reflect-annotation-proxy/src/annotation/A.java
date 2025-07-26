package annotation;

/**
 * ClassName: A
 * Package: annotation
 * Description: 自定义注解
 *
 * @Author 白夜
 * @Create 2025/7/25 15:21
 * @Version 1.0
 */
public @interface A {
    String value() default "copy"; // 特殊属性value，在使用时如果只有一个value属性，value名称可以不写
    String hobby() default "打篮球";
}
