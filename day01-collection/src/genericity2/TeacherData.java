package genericity2;

/**
 * ClassName: TeacherData
 * Package: genericity2
 * Description:
 *
 * @Author 白夜
 * @Create 2025/5/13 20:30
 * @Version 1.0
 */
public class TeacherData implements Data<Teacher>{
    @Override
    public void add(Teacher teacher) {

    }

    @Override
    public void remove(Teacher teacher) {

    }

    @Override
    public void update(Teacher teacher) {

    }

    @Override
    public Teacher query(int id) {
        return new Teacher();
    }
}
