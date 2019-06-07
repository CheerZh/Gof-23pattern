package behavioral.mediator;

/**
 * @author ZHGQ
 * @project Gof-23pattern
 * @Package behavioral.mediator
 * @date 2019/6/7-17:53
 * @Copyright: (c) 2019 USTC. All rights reserved.
 * @Description:
 */
public class Market implements Department {

    private Mediator m;    //中介者的引用

    public Market(Mediator m) {
        this.m = m;
        m.register("market",this);
    }

    @Override
    public void selfAction() {
        System.out.println("市场调研,项目谈判！");
    }

    @Override
    public void outAction() {
        System.out.println("汇报工作！项目承接进度，需要资金支持！");
        //通过中介者 与其他类交互
        m.command("financial");
    }
}
