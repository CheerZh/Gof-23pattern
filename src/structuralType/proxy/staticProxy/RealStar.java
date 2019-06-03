package structuralType.proxy.staticProxy;

/**
 * @author ZHGQ
 * @project Gof-23pattern
 * @Package structuralType.proxy.staticProxy
 * @date 2019/6/3-21:57
 * @Copyright: (c) 2019 USTC. All rights reserved.
 * @Description:
 */
public class RealStar implements Star {
    @Override
    public void confer() {
        System.out.println("RealStar.confer()");
    }

    @Override
    public void signContract() {
        System.out.println("RealStar.signContract()");
    }

    @Override
    public void bookTicket() {
        System.out.println("RealStar.bookTicket()");
    }

    @Override
    public void sing() {
        System.out.println("RealStar.sing()");
    }

    @Override
    public void collectMoney() {
        System.out.println("RealStar.collectMoney()");
    }
}
