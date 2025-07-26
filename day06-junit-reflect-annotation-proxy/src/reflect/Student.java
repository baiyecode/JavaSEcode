package reflect;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * ClassName: Student
 * Package: reflect
 * Description:
 *
 * @Author 白夜
 * @Create 2025/7/23 21:16
 * @Version 1.0
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Student {
    private String name;
    private int age;
    private String hobby;
}
