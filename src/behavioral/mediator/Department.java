package behavioral.mediator;

/**
 * @author ZHGQ
 * @project Gof-23pattern
 * @Package behavioral.mediator
 * @date 2019/6/7-17:44
 * @Copyright: (c) 2019 USTC. All rights reserved.
 * @Description:
 *
 *部门类
 *
 */
public interface Department {
    void selfAction(); //做本部门的事情
    void outAction(); //向总经理发出申请
}




