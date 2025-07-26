package annotation;

/**
 * ClassName: AnnotationDemo2
 * Package: annotation
 * Description:
 *
 * @Author 白夜
 * @Create 2025/7/25 16:18
 * @Version 1.0
 */
public class AnnotationDemo2 {
    //注解可以用在类上、构造器上、方法上、成员变量上、参数上等位置处。

    //@MyTest1
    private int age;

    //    @MyTest1
    public AnnotationDemo2(){
    }

    @MyTest1
    public static void main(String[] args) {
        // 目标：搞清楚元注解的作用。
    }
    //@MyTest1
    //public static void main(@MyTest1 String[] args) {
    //    // 目标：搞清楚元注解的作用。
    //}


    @MyTest1
    public void getAgeTest(){
    }
}
