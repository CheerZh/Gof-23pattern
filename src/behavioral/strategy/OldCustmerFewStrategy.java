package behavioral.strategy;

/**
 * @author ZHGQ
 * @project Gof-23pattern
 * @Package behavioral.strategy
 * @date 2019/6/8-11:13
 * @Copyright: (c) 2019 USTC. All rights reserved.
 * @Description:
 */
public class OldCustmerFewStrategy implements Strategy {
    @Override
    public double getPrice(double price) {
        System.out.println("打八五折");
        return price*0.85;
    }
}
