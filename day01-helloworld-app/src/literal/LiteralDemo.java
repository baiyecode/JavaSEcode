package literal;

/**
 * ClassName: LiteralDemo
 * Package: literal
 * Description: 常见字面量
 *
 * @Author 白夜
 * @Create 2025/3/26 16:41
 * @Version 1.0
 */
public class LiteralDemo {
    public static void main(String[] args) {
        printLiteral();
    }
    public static void printLiteral() {
        //常见字面量
        //整型字面量，直接写
        System.out.println(100);

        //浮点型字面量，直接写
        System.out.println(100.0);

        //布尔值字面量，只有true和false
        System.out.println(true);
        System.out.println(false);

        //字符字面量，用单引号包裹，有且只能有一个字符
        System.out.println('a');
        System.out.println(' ');//可以为空（null)
        //System.out.println('aa');报错
        //System.out.println('白夜);报错
        //System.out.println('');报错

        //字符串字面量，用双引号包裹，可以有任意字符
        System.out.println("白夜");

        /* 特殊字符字面量，用反斜杠+特殊字符的标识符，\n(换行） \t（制表位，空格实现对齐） \r（回车）
           \\（一个\） \'（一个单引号'） \"（一个双引号"）
         */
        System.out.println("白\n夜");
        System.out.println("白\t夜");
        System.out.println("白夜学JAVA\r你好");//回车换行,输出结果为：你好学JAVA
        /**
         \r 是回车符（Carriage Return），
         它的核心功能是将光标移动到当前行的行首，但不会换行。其行为在不同环境（如 IDE 控制台、终端、文件）中可能不同。
         字符串 "白夜学JAVA\r你好" 的打印过程分为两步：
             先输出白夜学JAVA，光标停留在 A 后面。
             遇到 \r 后，光标回到行首，接着输出 你好，覆盖前几个字符。
             理论上应输出 你好学JAVA（假设覆盖前 2 个字符）
         但是，在idea控制台，输出为你好，这说明 \r 导致后续字符未能完全覆盖前面的内容，或环境对 \r 的处理存在差异。
         而非 Java 版本问题，传统终端（如 Linux 的 bash 或 Windows 的 cmd）通常严格处理 \r，输出结果更接近预期。
         示例：在命令行中运行，可能得到 你好学JAVA。
        */

    }
}
