package creational.factory.simpleFactory;

/**
 * @author ZHGQ
 * @project Gof-23pattern
 * @Package creational.factory.simpleFactory
 * @date 2019/5/20-20:57
 * @Copyright: (c) 2019 USTC. All rights reserved.
 * @Description:
 */
public class CarFactory {

    public static Car createCar(String type){
        if("奥迪".equals(type)){
            return new Audi();
        }else if("比亚迪".equals(type)){
            return new Byd();
        }else return null;
    }
}
