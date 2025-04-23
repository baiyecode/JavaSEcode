package interface3;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * ClassName: Student
 * Package: interface3
 * Description:
 *
 * @Author 白夜
 * @Create 2025/4/23 15:15
 * @Version 1.0
 */
@Data
@NoArgsConstructor
@AllArgsConstructor

public class Student {
    private String name;
    private char sex;
    private double score;
}
