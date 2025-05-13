package genericity2;

/**
 * ClassName: StudentData
 * Package: genericity2
 * Description:
 *
 * @Author 白夜
 * @Create 2025/5/13 20:30
 * @Version 1.0
 */
public class StudentData implements Data<Student>{
    @Override
    public void add(Student student) {

    }

    @Override
    public void remove(Student student) {

    }

    @Override
    public void update(Student student) {

    }

    @Override
    public Student query(int id) {
        return new Student();
    }
}
