package thisdemo;

/**
 * ClassName: Student
 * Package: thisdemo
 * Description: //this关键字的使用
 *
 * @Author 白夜
 * @Create 2025/4/11 14:44
 * @Version 1.0
 */
public class Student {
    // 成员变量
     String name;
    public void print(){
        // this是一个变量，用在方法中，用于拿到当前对象。
        //哪个对象调用这个方法,this就拿到哪个对象。

        System.out.println(this);
        //1、可以用this调用对象的信息。
        System.out.println(this.name);


    }

    //2、解决变量名称重名冲突问题
    //用来解决对象的成员变量与方法内部变量的名称一样时，导致访问冲突问题的。

    //public void printHobby(String n){
    //    System.out.println(name + "喜欢" + n);
    //
    //}

    //下面的name是局部变量
    public void printHobby(String name){
        //this.name指向当前对象的name，name指向输入的name，解决变量重名问题
        System.out.println(this.name + "喜欢" + name);


    }

}
