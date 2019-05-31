package creational.bulider;

/**
 * @author ZHGQ
 * @project Gof-23pattern
 * @Package creational.bulider
 * @date 2019/5/27-15:51
 * @Copyright: (c) 2019 USTC. All rights reserved.
 * @Description:
 */
public class Client {
    public static void main(String[] args) {
        AirShipDirector director = new MyAirShipDirector(new MyAirShipBuilder());
        AirShip ship = director.directAirShip();

        System.out.println(ship.getEngine().getName());
        ship.launch();

    }
}
