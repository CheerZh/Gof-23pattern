package structural.decorator;

/**
 * @author ZHGQ
 * @project Gof-23pattern
 * @Package structural.decorator
 * @date 2019/6/5-18:25
 * @Copyright: (c) 2019 USTC. All rights reserved.
 * @Description:
 *
 * 使用场景 IO流 输入输出流
 *          servlet API HttpServletRequestWrapper
 *          Struts2 request,response,session对象处理
 */
public class Client {
    public static void main(String[] args) {
        Car car = new Car();
        car.move();

        System.out.println("---增加新的功能，飞行");
        FlyCar flyCar = new FlyCar(car);
        flyCar.move();

        System.out.println("---增加新的功能，水上游");
        WaterCar waterCar = new WaterCar(car);
        waterCar.move();

        System.out.println("---增加新的功能，水上游");
        WaterCar water_flyCar = new WaterCar(flyCar);
        water_flyCar.move();

        System.out.println("增加两个新功能，飞行，水里游");
        WaterCar waterCar2 = new WaterCar(new FlyCar(car));
        waterCar2.move();

    }
}
