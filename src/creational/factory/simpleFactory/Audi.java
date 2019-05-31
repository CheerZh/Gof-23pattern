package creational.factory.simpleFactory;

/**
 * @author ZHGQ
 * @project Gof-23pattern
 * @Package creational.factory
 * @date 2019/5/20-20:46
 * @Copyright: (c) 2019 USTC. All rights reserved.
 * @Description:
 */
public class Audi implements Car{

    @Override
    public void run() {
        System.out.println("奥迪在跑！");
    }
}
