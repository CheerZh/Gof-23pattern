package creational.factory.simpleFactory;

/**
 * @author ZHGQ
 * @project Gof-23pattern
 * @Package creational.factory
 * @date 2019/5/20-20:48
 * @Copyright: (c) 2019 USTC. All rights reserved.
 * @Description:   不使用工厂模式
 *  需要知道的东西较多
 */
public class Client1 {
    public static void main(String[] args) {
        Car c1 = new Audi();
        Car c2 = new Byd();

        c1.run();
        c2.run();
    }


}
