package behavioral.strategy;

/**
 * @author ZHGQ
 * @project Gof-23pattern
 * @Package behavioral.strategy
 * @date 2019/6/8-11:10
 * @Copyright: (c) 2019 USTC. All rights reserved.
 * @Description:
 *
 * 新用户小批量
 *
 */
public class NewCustomerFewStrategy implements Strategy{
    @Override
    public double getPrice(double price) {
        System.out.println("不打折,原价");
        return price;
    }
}
