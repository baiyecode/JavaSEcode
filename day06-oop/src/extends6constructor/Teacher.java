package extends6constructor;

/**
 * ClassName: Teacher
 * Package: extendsdemo
 * Description:
 *
 * @Author 白夜
 * @Create 2025/4/15 20:04
 * @Version 1.0
 */
public class Teacher extends People {
    //子类
    private String skill;//技能

    public Teacher(){
    }

    public Teacher(String name, char sex, String skill) {
        //调用父类的构造方法
        //可以把子类维承自父类这部分的数据也完成初始化赋值
        super(name, sex);
        this.skill = skill;
    }

    public String getSkill() {
        return skill;
    }

    public void setSkill(String skill) {
        this.skill = skill;
    }
}
