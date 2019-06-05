package structural.decorator;

/**
 * @author ZHGQ
 * @project Gof-23pattern
 * @Package structural.decorator
 * @date 2019/6/5-18:11
 * @Copyright: (c) 2019 USTC. All rights reserved.
 * @Description:
 *
 * 抽象组件
 */
public interface ICar {
    void move();
}

/**
 * ConcreteComponent 具体构件
 */
class Car implements ICar{

    @Override
    public void move() {
        System.out.println("在公路上跑");
    }
}

/**
 * 装饰器 Decorator 角色
 */
class SuperCar implements ICar{

    protected ICar car;

    public SuperCar(ICar car) {
        this.car = car;
    }

    @Override
    public void move() {
        car.move();
    }
}

/**
 * ConcreteDecorator 具体装饰 角色
 */
class FlyCar extends SuperCar{

    public FlyCar(ICar car) {
        super(car);
    }

    public void fly(){
        System.out.println("飞行");
    }

    @Override
    public void move(){
        super.move();
        fly();
    }
}

class WaterCar extends SuperCar{

    public WaterCar(ICar car) {
        super(car);
    }

    public void swim(){
        System.out.println("水上游");
    }

    @Override
    public void move(){
        super.move();
        swim();
    }
}

class AICar extends SuperCar{

    public AICar(ICar car) {
        super(car);
    }

    public void autoMove(){
        System.out.println("自动驾驶");
    }

    @Override
    public void move(){
        super.move();
        autoMove();
    }
}