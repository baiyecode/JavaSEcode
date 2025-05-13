package genericity2;

/**
 * ClassName: Data
 * Package: genericity2
 * Description:
 *
 * @Author 白夜
 * @Create 2025/5/13 20:29
 * @Version 1.0
 */
public interface Data <T>{
    void add(T t);
    void remove(T t);
    void update(T t);
    T query(int id);//查询
}
