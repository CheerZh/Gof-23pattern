package bulider;

/**
 * @author ZHGQ
 * @project Gof-23pattern
 * @Package bulider
 * @date 2019/5/27-15:42
 * @Copyright: (c) 2019 USTC. All rights reserved.
 * @Description:
 */
public class MyAirShipDirector implements AirShipDirector{

    private AirShipBuilder builder;

    public MyAirShipDirector(AirShipBuilder builder) {
        this.builder = builder;
    }

    @Override
    public AirShip directAirShip() {

        Engine e = builder.buildEngine();
        OrbitalModule o = builder.buildOrbitalModule();
        EscapeTower et = builder.buildEscapeTower();

        //装配成飞船对象
        AirShip ship = new AirShip();
        ship.setEngine(e);
        ship.setOrbitalModule(o);
        ship.setEscapeTower(et);

        return ship;
    }
}
