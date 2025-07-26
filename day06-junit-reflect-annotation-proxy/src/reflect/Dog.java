package reflect;

/**
 * ClassName: Dog
 * Package: reflect
 * Description:
 *
 * @Author 白夜
 * @Create 2025/7/24 15:22
 * @Version 1.0
 */
public class Dog {
    private String name;
    private int age;
    private String hobby;

    //私有
    private Dog() {
        System.out.println("无参数构造器执行了~~");
    }
    //私有
    private Dog(String name) {
        System.out.println("1个参数有参数构造器执行了~~");
        this.name = name;
    }
    //公开
    public Dog(String name, int age) {
        System.out.println("2个参数有参数构造器执行了~~");
        this.name = name;
        this.age = age;
    }

    //私有
    private void eat(){
        System.out.println("狗吃骨头！");
    }

    //公开
    public String eat(String name){
        System.out.println("狗吃" + name);
        return "狗说：谢谢！谢谢！汪汪汪！";
    }



    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getHobby() {
        return hobby;
    }

    public void setHobby(String hobby) {
        this.hobby = hobby;
    }

    @Override
    public String toString() {
        return "Dog{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", hobby='" + hobby + '\'' +
                '}';
    }
}
