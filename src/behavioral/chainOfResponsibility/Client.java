package behavioral.chainOfResponsibility;

/**
 * @author ZHGQ
 * @project Gof-23pattern
 * @Package behavioral.chainOfResponsibility
 * @date 2019/6/7-15:31
 * @Copyright: (c) 2019 USTC. All rights reserved.
 * @Description:
 *
 * 可以增加单独的 责任链对象 进行优化
 *
 * java 异常机制、Servlet 过滤器链式处理、Struts2 拦截器
 *
 */
public class Client {
    public static void main(String[] args) {
        Leader a = new Director("张三");
        Leader b = new Mannager("李四");
        Leader c = new GeneralManager("王五");
        Leader b2 = new ViceGeneralManager("赵六");

        //组织责任链任务关系
        a.setNextLeader(b);
        b.setNextLeader(b2);
        b2.setNextLeader(c);


        //开始请假
        LeaveRequest req1 = new LeaveRequest("TOM",10,"回英国探亲！");
        a.handleRequest(req1);
    }
}
