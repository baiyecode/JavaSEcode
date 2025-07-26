package annotation;

/**
 * ClassName: MyBook
 * Package: annotation
 * Description: 自定义注解
 *
 * @Author 白夜
 * @Create 2025/7/25 15:20
 * @Version 1.0
 */
public @interface MyBook {
    String name();
    int age() default 18;
    String[] address();
}
