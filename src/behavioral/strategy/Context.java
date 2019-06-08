package behavioral.strategy;

/**
 * @author ZHGQ
 * @project Gof-23pattern
 * @Package behavioral.strategy
 * @date 2019/6/8-11:15
 * @Copyright: (c) 2019 USTC. All rights reserved.
 * @Description:
 *
 * 负责和具体的策略类交互
 *      使 具体算法 和 客户调用分离
 *      算法可以独立于客户端变化
 */
public class Context {
    private Strategy strategy;  //当前采用的算法

    //通过构造器注入
    public Context(Strategy strategy) {
        this.strategy = strategy;
    }
    //通过set方法注入
    public void setStrategy(Strategy strategy) {
        this.strategy = strategy;
    }
    //如果使用Spring的依赖注入功能，还可以通过配置文件
    //动态注入不同的策略对象，动态的切换不同的算法


    public void printPrice(double price){
        System.out.println("报价："+strategy.getPrice(price));
    }
}
