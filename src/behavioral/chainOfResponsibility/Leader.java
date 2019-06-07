package behavioral.chainOfResponsibility;

/**
 * @author ZHGQ
 * @project Gof-23pattern
 * @Package behavioral.chainOfResponsibility
 * @date 2019/6/7-15:13
 * @Copyright: (c) 2019 USTC. All rights reserved.
 * @Description:
 *
 * 抽象类
 *
 */
public abstract class Leader {

    protected String name;
    protected Leader nextLeader;
    public Leader(String name){
        this.name = name;
    }

    //设定责任链中的下一个方法
    public void setNextLeader(Leader nextLeader){
        this.nextLeader = nextLeader;
    }


    /**
     * 处理请求的核心业务方法
     * @param request
     */
    public abstract void handleRequest(LeaveRequest request);
}
