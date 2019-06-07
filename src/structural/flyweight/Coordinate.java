package structural.flyweight;

/**
 * @author ZHGQ
 * @project Gof-23pattern
 * @Package structural.flyweight
 * @date 2019/6/7-14:16
 * @Copyright: (c) 2019 USTC. All rights reserved.
 * @Description:
 *
 * 非共享类，坐标不同，作为外部状态UnShared
 *
 */
public class Coordinate {

    private int x,y;

    public Coordinate(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }
}
