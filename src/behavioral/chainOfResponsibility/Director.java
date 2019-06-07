package behavioral.chainOfResponsibility;

/**
 * @author ZHGQ
 * @project Gof-23pattern
 * @Package behavioral.chainOfResponsibility
 * @date 2019/6/7-15:19
 * @Copyright: (c) 2019 USTC. All rights reserved.
 * @Description:
 *
 * 主任
 *
 */
public class Director extends Leader{

    public Director(String name) {
        super(name);
    }

    @Override
    public void handleRequest(LeaveRequest request) {
        if(request.getLeaveDays()<3){
            System.out.println("员工："+request.getEmpName()+"请假 "
                    +request.getLeaveDays()+" 天，"+"理由："+request.getReason());
            System.out.println("主任："+this.name+"  审批通过！");
        }else {
            if(this.nextLeader != null){
                this.nextLeader.handleRequest(request);
            }
        }
    }
}
