package structural.flyweight;

/**
 * @author ZHGQ
 * @project Gof-23pattern
 * @Package structural.flyweight
 * @date 2019/6/7-14:33
 * @Copyright: (c) 2019 USTC. All rights reserved.
 * @Description:
 *
 * "池" -- 线程池，数据库连接池
 *
 * String 类，共享常量池
 *
 * 优点：极大的减少内存中的对象数量
 *
 * 缺点：读取外部状态使运行时间变长
 *
 */
public class Client {
    public static void main(String[] args) {
        ChessFlyWeight chess1 = ChessFlyWeightFactory.getChess("黑色");
        ChessFlyWeight chess2 = ChessFlyWeightFactory.getChess("黑色");

        System.out.println(chess1);
        System.out.println(chess2);

        System.out.println("增加外部状态处理=========>");
        chess1.display(new Coordinate(10,10));
        chess2.display(new Coordinate(20,20));
    }
}
