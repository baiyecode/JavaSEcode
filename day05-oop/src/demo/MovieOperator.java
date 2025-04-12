package demo;

import java.util.Scanner;

/**
 * ClassName: MovieOperactor
 * Package: demo
 * Description:
 *
 * @Author 白夜
 * @Create 2025/4/12 16:01
 * @Version 1.0
 */
public class MovieOperator {
    //电影操作类
    private Movie[] movies ;//记住一个电影对象的数组

    //有参数构造器，创建对象时，会调用这个构造器，把电影对象的数组赋值给movies
    public MovieOperator(Movie[] movies){
        this.movies = movies;
        //this.movies是当前对象的movies
    }


    //打印全部电影信息
    public void printAllMovies(){
        System.out.println("编号\t" + "电影名\t" + "价格\t" + "演员");
        for (int i = 0; i < movies.length; i++) {
            //i = 0,1,2,3,4,5
            Movie m = movies[i];
            System.out.println(m.getId() + "\t" + m.getName() + "\t" + m.getPrice() + "\t" + m.getActor());
        }
    }



    //根据id查找电影
    public void searchMovieById(){
        System.out.println("请输入要查找的电影编号：");
        Scanner sc = new Scanner(System.in);
        int id = sc.nextInt();
        //遍历每个电影对象
        for (int i = 0; i < movies.length; i++) {
            //获取当前遍历到的电影对象
            Movie m = movies[i];
            //判断当前电影对象的id是否和输入的id一致
            if (id == m.getId()) {
                System.out.println("编号\t" + "电影名\t" + "价格\t" + "演员");
                System.out.println(m.getId() + "\t" + m.getName() + "\t" + m.getPrice() + "\t" + m.getActor());
                return; //找到就返回，结束方法
            }
        }
        System.out.println("没有找到该电影");
        }




}




