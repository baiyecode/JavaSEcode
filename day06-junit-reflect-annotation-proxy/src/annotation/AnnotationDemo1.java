package annotation;

/**
 * ClassName: AnnotationDemo1
 * Package: annotation
 * Description: 了解注解
 *
 * @Author 白夜
 * @Create 2025/7/25 15:19
 * @Version 1.0
 */
@MyBook(name = "赵丽颖", age = 18, address = {"北京", "上海"})
// @A(value = "delete")
//@A("delete") // 特殊属性value，在使用时如果只有一个value属性，value名称可以不写
//@A(value = "delete", hobby = "打篮球")
//@A("delete") //只设置value（可以简化）

//@A(value = "delete", hobby = "打台球")// 设置多个属性,要使用完整语法
//@A("delete", hobby = "打台球")// 不能简化

//@A(value = "copy", hobby = "打台球")//只设置count，value使用默认值（必须完整语法）
//要不直接省略value，让其自动使用默认值
@A(hobby = "打台球")//这样value会自动使用默认值"default"
public class AnnotationDemo1 {

    //注解可以用在类上、构造器上、方法上、成员变量上、参数上等位置处。
    @MyBook(name = "王菲", age = 52, address = {"北京", "香港"})
    public static void main( @A("delete") String[] args ) {
        // 目标：自定义注解。
        @A("delete")
        int a;
    }
}
