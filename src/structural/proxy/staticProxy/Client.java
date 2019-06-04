package structural.proxy.staticProxy;

/**
 * @author ZHGQ
 * @project Gof-23pattern
 * @Package structural.proxy.staticProxy
 * @date 2019/6/3-22:05
 * @Copyright: (c) 2019 USTC. All rights reserved.
 * @Description:
 */
public class Client {

    public static void main(String[] args) {
        Star real = new RealStar();
        Star proxy = new ProxyStar(real);

        proxy.confer();
        proxy.signContract();
        proxy.bookTicket();

        //找真实角色
        proxy.sing();
        proxy.collectMoney();
    }
}
