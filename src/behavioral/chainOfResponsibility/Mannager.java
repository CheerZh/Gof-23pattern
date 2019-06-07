package behavioral.chainOfResponsibility;

/**
 * @author ZHGQ
 * @project Gof-23pattern
 * @Package behavioral.chainOfResponsibility
 * @date 2019/6/7-15:25
 * @Copyright: (c) 2019 USTC. All rights reserved.
 * @Description:
 *
 *
 * 经理
 *
 */



public class Mannager extends Leader {

    public Mannager(String name) {
        super(name);
    }

    @Override
    public void handleRequest(LeaveRequest request) {
        if (request.getLeaveDays() < 10) {
            System.out.println("员工：" + request.getEmpName() + "请假 "
                    + request.getLeaveDays() + " 天，" + "理由：" + request.getReason());
            System.out.println("经理：" + this.name + "  审批通过！");
        } else {
            if (this.nextLeader != null) {
                this.nextLeader.handleRequest(request);
            }
        }
    }
}
