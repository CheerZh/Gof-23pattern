package factory.simpleFactory;

/**
 * @author ZHGQ
 * @project Gof-23pattern
 * @Package factory.simpleFactory
 * @date 2019/5/20-21:01
 * @Copyright: (c) 2019 USTC. All rights reserved.
 * @Description:
 *
 * 扩展需要修改业务代码，违反了开闭原则
 */
public class Client2 {

    public static void main(String[] args) {
        Car c1 = CarFactory.createCar("奥迪");
        Car c2 = CarFactory.createCar("比亚迪");

        c1.run();
        c2.run();
    }

}
