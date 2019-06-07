package behavioral.mediator;

/**
 * @author ZHGQ
 * @project Gof-23pattern
 * @Package behavioral.mediator
 * @date 2019/6/7-17:50
 * @Copyright: (c) 2019 USTC. All rights reserved.
 * @Description:
 */
public class Financial implements Department{

    private Mediator m;    //中介者的引用

    public Financial(Mediator m) {
        this.m = m;
        m.register("financial",this);
    }

    @Override
    public void selfAction() {
        System.out.println("准备资金！");
    }

    @Override
    public void outAction() {
        System.out.println("汇报工作！提交财务报表");
    }
}

