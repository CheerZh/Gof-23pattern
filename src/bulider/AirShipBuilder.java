package bulider;

/**
 * @author ZHGQ
 * @project Gof-23pattern
 * @Package bulider
 * @date 2019/5/27-15:30
 * @Copyright: (c) 2019 USTC. All rights reserved.
 * @Description:
 */
public interface AirShipBuilder {

    Engine buildEngine();
    OrbitalModule buildOrbitalModule();
    EscapeTower buildEscapeTower();
}
