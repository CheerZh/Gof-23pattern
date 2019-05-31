package creational.factory.abstractFactory;

/**
 * @author ZHGQ
 * @project Gof-23pattern
 * @Package creational.factory.abstractFactory
 * @date 2019/5/20-21:24
 * @Copyright: (c) 2019 USTC. All rights reserved.
 * @Description:
 */
public interface Engine {
    void run();
    void start();
}

class LuxuryEngine implements Engine{

    @Override
    public void run() {
        System.out.println("跑得快！");
    }

    @Override
    public void start() {
        System.out.println("启动快！自动启停！");
    }
}

class LowerEngine implements Engine{

    @Override
    public void run() {
        System.out.println("跑得慢！");
    }

    @Override
    public void start() {
        System.out.println("启动慢！");
    }
}
