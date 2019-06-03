package structuralType.proxy.staticProxy;

/**
 * @author ZHGQ
 * @project Gof-23pattern
 * @Package structuralType.proxy.staticProxy
 * @date 2019/6/3-22:00
 * @Copyright: (c) 2019 USTC. All rights reserved.
 * @Description:
 */
public class ProxyStar implements Star{

    //持有一个真实对象的引用
    private Star star;

    public ProxyStar(Star star){
        super();
        this.star = star;
    }

    @Override
    public void confer() {
        System.out.println("ProxyStar.confer()");
    }

    @Override
    public void signContract() {
        System.out.println("ProxyStar.signContract()");
    }

    @Override
    public void bookTicket() {
        System.out.println("ProxyStar.bookTicket()");
    }

    @Override
    public void sing() {
        //代理不能唱歌
        star.sing();
    }

    @Override
    public void collectMoney() {
        System.out.println("ProxyStar.collectMoney()");
    }
}
