package bulider;

/**
 * @author ZHGQ
 * @project Gof-23pattern
 * @Package bulider
 * @date 2019/5/27-15:36
 * @Copyright: (c) 2019 USTC. All rights reserved.
 * @Description:
 *
 * StringBuilder,DomBuilder,SaxBuilder是JDK中的构建者模式类
 *
 *
 */
public class MyAirShipBuilder implements AirShipBuilder{
    @Override
    public Engine buildEngine() {

        System.out.println("构建发动机");
        return new Engine("myEngine");
    }

    @Override
    public OrbitalModule buildOrbitalModule() {

        System.out.println("构建轨道舱");
        return new OrbitalModule("myOrbitalModule");

    }

    @Override
    public EscapeTower buildEscapeTower() {
        System.out.println("构建逃逸塔");
        return new EscapeTower("myEscapeTower");
    }
}
