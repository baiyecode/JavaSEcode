package proxy;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * ClassName: Star
 * Package: proxy
 * Description:
 *
 * @Author 白夜
 * @Create 2025/7/26 15:08
 * @Version 1.0
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Star implements StarService{
    private String name;

    @Override
    public void sing(String name) {
        System.out.println(this.name + "表演唱歌：" + name);
    }

    @Override
    public String dance() {
        System.out.println(this.name + "表演跳舞：魅力四射！" );
        return "谢谢！谢谢！";
    }
}
