package creational.factory.abstractFactory;

/**
 * @author ZHGQ
 * @project Gof-23pattern
 * @Package creational.factory.abstractFactory
 * @date 2019/5/20-21:30
 * @Copyright: (c) 2019 USTC. All rights reserved.
 * @Description:
 */
public interface Tyre {

    void revolve();
}

class LuxuryTyre implements Tyre{

    @Override
    public void revolve() {
        System.out.println("磨损低！");
    }
}

class LowerTyre implements Tyre{

    @Override
    public void revolve() {
        System.out.println("磨损高！");
    }
}
