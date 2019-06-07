package structural.flyweight;

/**
 * @author ZHGQ
 * @project Gof-23pattern
 * @Package structural.flyweight
 * @date 2019/6/7-14:13
 * @Copyright: (c) 2019 USTC. All rights reserved.
 * @Description:
 *
 * 享元类
 *
 */
public interface ChessFlyWeight {
    void setColor(String c);
    String getColor();
    void display(Coordinate c);
}

/**
 *具体享元类，为内部状态（共享的状态）提供成员变量进行存储
 */
class ConcreatChess implements ChessFlyWeight{

    private String color;

    public ConcreatChess(String color) {
        this.color = color;
    }

    @Override
    public void setColor(String c) {
        this.color = c;
    }

    @Override
    public String getColor() {
        return color;
    }

    @Override
    public void display(Coordinate c) {
        System.out.println("棋子颜色："+color);
        System.out.println("棋子位置: "+c.getX()+"--"+c.getY());
    }
}
