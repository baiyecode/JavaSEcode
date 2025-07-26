package reflect;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * ClassName: Teacher
 * Package: reflect
 * Description:
 *
 * @Author 白夜
 * @Create 2025/7/24 16:13
 * @Version 1.0
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Teacher {
    private String name;
    private int age;
    private String hobby;
    private double salary;//薪资
    private String className;
    private char sex;
    private String phone;

}
