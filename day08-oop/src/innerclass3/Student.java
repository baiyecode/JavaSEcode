package innerclass3;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * ClassName: Student
 * Package: innerclass3
 * Description:
 *
 * @Author 白夜
 * @Create 2025/4/26 17:30
 * @Version 1.0
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Student {
    private String name;
    private int age;
    private double height;
    private char sex;
}
