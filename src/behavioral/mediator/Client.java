package behavioral.mediator;

/**
 * @author ZHGQ
 * @project Gof-23pattern
 * @Package behavioral.mediator
 * @date 2019/6/7-18:01
 * @Copyright: (c) 2019 USTC. All rights reserved.
 * @Description:
 *
 * 实现 对象之间的解耦
 *
 *  场景： MVC 中的 控制器
 *       窗口游戏程序的 窗口对象 是一个中介者
 *       GUI开发中多组件交互 通过一个 中介者 对象解决
 *       java.lang.reflect.Method#invoke()
 *
 */
public class Client {
    public static void main(String[] args) {
        Mediator m = new President();

        Market market = new Market(m);
        Development devp = new Development(m);
        Financial f = new Financial(m);

        market.selfAction();
        market.outAction();
    }
}
