package creational.factory.abstractFactory;

/**
 * @author ZHGQ
 * @project Gof-23pattern
 * @Package creational.factory.abstractFactory
 * @date 2019/5/20-21:28
 * @Copyright: (c) 2019 USTC. All rights reserved.
 * @Description:
 */
public interface Seat {

    void massage();
}

class LuxurySeat implements Seat{

    @Override
    public void massage() {
        System.out.println("可以自动按摩！");
    }
}

class LowerSeat implements Seat{

    @Override
    public void massage() {
        System.out.println("不可以按摩！");
    }
}


