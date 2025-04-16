package extends1demo;

/**
 * ClassName: Teacher
 * Package: extendsdemo
 * Description:
 *
 * @Author 白夜
 * @Create 2025/4/15 20:04
 * @Version 1.0
 */
public class Teacher extends People{
    //子类
    private String skill;//技能

    public String getSkill() {
        return skill;
    }

    public void setSkill(String skill) {
        this.skill = skill;
    }
}
