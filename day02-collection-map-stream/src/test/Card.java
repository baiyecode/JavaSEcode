package test;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * ClassName: Card
 * Package: test
 * Description:
 *
 * @Author 白夜
 * @Create 2025/7/4 16:29
 * @Version 1.0
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Card {
    private String size;
    private String color;
    private int num;  //大小

    @Override
    public String toString() {
        return size + color;
    }
}
