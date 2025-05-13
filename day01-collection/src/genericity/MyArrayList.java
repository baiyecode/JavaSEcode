package genericity;

import java.util.ArrayList;

/**
 * ClassName: MyArrayList
 * Package: genericity
 * Description:
 *
 * @Author 白夜
 * @Create 2025/5/13 20:09
 * @Version 1.0
 */
public class MyArrayList<E>{
//  自定义泛型类
    private ArrayList list = new ArrayList();

    public boolean add(E e){
        list.add(e);
        return true;
    }

    public boolean remove(E e){
        return list.remove(e);
    }

    @Override
    public String toString() {
        return list.toString();
    }
}
