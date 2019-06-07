package behavioral.chainOfResponsibility;

/**
 * @author ZHGQ
 * @project Gof-23pattern
 * @Package behavioral.chainOfResponsibility
 * @date 2019/6/7-15:28
 * @Copyright: (c) 2019 USTC. All rights reserved.
 * @Description:
 */
public class GeneralManager extends Leader {
    public GeneralManager(String name) {
        super(name);
    }

    @Override
    public void handleRequest(LeaveRequest request) {
        if (request.getLeaveDays() < 30) {
            System.out.println("员工：" + request.getEmpName() + "请假 "
                    + request.getLeaveDays() + " 天，" + "理由：" + request.getReason());
            System.out.println("总经理：" + this.name + "  审批通过！");
        } else {
            System.out.println("莫非"+request.getEmpName()+"想辞职，居然请假"+request.getLeaveDays()+"天");
        }
    }
}
