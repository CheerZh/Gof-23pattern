package creational.factory.abstractFactory;

/**
 * @author ZHGQ
 * @project Gof-23pattern
 * @Package creational.factory.abstractFactory
 * @date 2019/5/20-21:40
 * @Copyright: (c) 2019 USTC. All rights reserved.
 * @Description:
 */
public class Client {

    public static void main(String[] args) {
        CarFactory factory = new LuxuryCarFactory();
        Engine e = factory.createEngine();
        e.run();
        e.start();
    }
}
