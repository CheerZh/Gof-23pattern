package behavioral.strategy;

/**
 * @author ZHGQ
 * @project Gof-23pattern
 * @Package behavioral.strategy
 * @date 2019/6/8-11:10
 * @Copyright: (c) 2019 USTC. All rights reserved.
 * @Description:
 *
 * 新用户大批量
 *
 */
public class NewCustomerManyStrategy implements Strategy{
    @Override
    public double getPrice(double price) {
        System.out.println("打九折");
        return price*0.9;
    }
}
