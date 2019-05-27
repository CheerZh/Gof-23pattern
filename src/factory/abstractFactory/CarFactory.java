package factory.abstractFactory;

/**
 * @author ZHGQ
 * @project Gof-23pattern
 * @Package factory.abstractFactory
 * @date 2019/5/20-21:33
 * @Copyright: (c) 2019 USTC. All rights reserved.
 * @Description:
 */
public interface CarFactory {
    Engine createEngine();
    Seat createSeat();
    Tyre createTyre();
}

class LuxuryCarFactory implements CarFactory{

    @Override
    public Engine createEngine() {
        return new LuxuryEngine();
    }

    @Override
    public Seat createSeat() {
        return new LuxurySeat();
    }

    @Override
    public Tyre createTyre() {
        return new LuxuryTyre();
    }
}

class LowerCarFactory implements CarFactory{

    @Override
    public Engine createEngine() {
        return new LowerEngine();
    }

    @Override
    public Seat createSeat() {
        return new LowerSeat();
    }

    @Override
    public Tyre createTyre() {
        return new LowerTyre();
    }
}
