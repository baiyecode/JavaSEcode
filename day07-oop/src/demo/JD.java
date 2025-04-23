package demo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * ClassName: JD
 * Package: demo
 * Description:
 *
 * @Author 白夜
 * @Create 2025/4/23 20:07
 * @Version 1.0
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class JD implements Switch{
    //家用电器

    private String name;
    //状态：开或关
    private boolean status;
    @Override
    public void press(){
        //控制当前电器的开关状态
        status = !status;
    }
}
