package annotation;

/**
 * ClassName: Demo
 * Package: annotation
 * Description:
 *
 * @Author 白夜
 * @Create 2025/7/25 16:36
 * @Version 1.0
 */
@MyTest2(value = "刘亦菲", address = {"北京", "上海", "深圳"})
public class Demo {
    @MyTest2(value = "欧阳娜娜", address = {"湖南", "湖北"})
    public void go(){
    }

}
