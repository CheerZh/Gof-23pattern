package factory.factoryMethod;

import factory.simpleFactory.Car;

/**
 * @author ZHGQ
 * @project Gof-23pattern
 * @Package factory.factoryMethod
 * @date 2019/5/20-21:14
 * @Copyright: (c) 2019 USTC. All rights reserved.
 * @Description:
 *
 * 符合开闭原则，但是增加了很多新的类
 *
 */
public class Client {

    public static void main(String[] args) {
        Car c1 = new AudiFactory().createCar();
        Car c2 = new BydFactory().createCar();

        c1.run();
        c2.run();
    }
}
