package demo;

/**
 * ClassName: Test
 * Package: demo
 * Description: 面向对象综合案例
 *
 * @Author 白夜
 * @Create 2025/4/12 15:42
 * @Version 1.0
 */
public class Test {
    public static void main(String[] args) {

        //简易版电影信息展示系统
        //需求
        //展示系统中的全部电影信息(每部电影展示:名称、价格)。
        //允许用户根据电影编号(id)查询出某个电影的详细信息。
        //目标
        //使用所学的面向对象编程实现以上2个需求。


        //1、设计电影类Movie，以便创建电影对象，封装电数据。
        // 2、封装系统中的全部电能数据。(自己造一些数据)，数组存储
        //int[] arr = new int[6];  ,类似数组创建， Movie[]类型
        Movie[] movies = new Movie[6];
        // 初始为空（null) movies = [null,null,null,null,null,null]
        // 创建电影对象，并把电影对象存储到数组中
        // Movie m1 = new Movie(1, "《泰坦尼克号》", 9.3, "莱昂纳多·迪卡普里奥");
        // movies[0] = m1;
        movies[0] = new Movie(1, "《泰坦尼克号》", 9.3, "莱昂纳多·迪卡普里奥");
        movies[1] = new Movie(2, "《霸王别姬》", 9.6, "张国荣");
        movies[2] = new Movie(3, "《活着》", 9.4, "葛优");
        movies[3] = new Movie(4, "《战狼》", 8.9, "吴京");
        movies[4] = new Movie(5, "《让子弹飞》", 8.7, "姜文");
        movies[5] = new Movie(6, "《我不是药神》", 9.0, "徐峥");

        //3、创建电影操作对象出来，专门负贡电影数据的业务操作。
        MovieOperator mo = new MovieOperator(movies);
        mo.printAllMovies();
        mo.searchMovieById();







    }
}
