package creational.factory.factoryMethod;

import creational.factory.simpleFactory.Audi;
import creational.factory.simpleFactory.Car;

/**
 * @author ZHGQ
 * @project Gof-23pattern
 * @Package creational.factory.factoryMethod
 * @date 2019/5/20-21:12
 * @Copyright: (c) 2019 USTC. All rights reserved.
 * @Description:
 */
public class AudiFactory implements CarFactory {
    @Override
    public Car createCar() {
        return new Audi();
    }
}
