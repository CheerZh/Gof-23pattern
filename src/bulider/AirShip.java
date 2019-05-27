package bulider;

/**
 * @author ZHGQ
 * @project Gof-23pattern
 * @Package bulider
 * @date 2019/5/27-15:22
 * @Copyright: (c) 2019 USTC. All rights reserved.
 * @Description:
 */
public class AirShip {

    private OrbitalModule orbitalModule; //轨道舱
    private Engine engine;  //发动机
    private EscapeTower EscapeTower; //逃逸塔

    public void launch(){
        System.out.println("点火发射");
    }


    public OrbitalModule getOrbitalModule() {
        return orbitalModule;
    }

    public void setOrbitalModule(OrbitalModule orbitalModule) {
        this.orbitalModule = orbitalModule;
    }

    public Engine getEngine() {
        return engine;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    public bulider.EscapeTower getEscapeTower() {
        return EscapeTower;
    }

    public void setEscapeTower(bulider.EscapeTower escapeTower) {
        EscapeTower = escapeTower;
    }
}

class OrbitalModule{
    private String name;

    public OrbitalModule(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

class Engine{
    private String name;

    public Engine(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

class EscapeTower{
    private String name;

    public EscapeTower(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
