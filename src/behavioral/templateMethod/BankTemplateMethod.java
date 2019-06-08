package behavioral.templateMethod;

/**
 * @author ZHGQ
 * @project Gof-23pattern
 * @Package behavioral.templateMethod
 * @date 2019/6/8-11:55
 * @Copyright: (c) 2019 USTC. All rights reserved.
 * @Description:
 */
public abstract class BankTemplateMethod {

    //具体方法
    public void takeNumber(){
        System.out.println("排队取号");
    }

    //办理具体的业务，定义为抽象方法
    //相当于一个 钩子 方法
    public abstract void transact();

    public void evaluate(){
        System.out.println("反馈评分");
    }

    public final void process(){
        this.takeNumber();
        //钩子方法
        transact();
        evaluate();
    }
}
