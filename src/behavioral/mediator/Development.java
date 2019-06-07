package behavioral.mediator;

/**
 * @author ZHGQ
 * @project Gof-23pattern
 * @Package behavioral.mediator
 * @date 2019/6/7-17:46
 * @Copyright: (c) 2019 USTC. All rights reserved.
 * @Description:
 */
public class Development implements Department{

    private Mediator m;    //中介者的引用

    public Development(Mediator m) {
        this.m = m;
        m.register("development",this);
    }

    @Override
    public void selfAction() {
        System.out.println("专心科研，开发项目！");
    }

    @Override
    public void outAction() {
        System.out.println("汇报工作！需要资金支持");
    }
}
