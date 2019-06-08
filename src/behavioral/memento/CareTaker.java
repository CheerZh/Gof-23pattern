package behavioral.memento;

import java.util.ArrayList;
import java.util.List;

/**
 * @author ZHGQ
 * @project Gof-23pattern
 * @Package behavioral.memento
 * @date 2019/6/8-16:44
 * @Copyright: (c) 2019 USTC. All rights reserved.
 * @Description:
 *
 * 复责人类，负责管理备忘录对象
 *
 */
public class CareTaker {

    private EmpMemento memento;

    //利用容器存储多个备忘点
    private List<EmpMemento> list = new ArrayList<>();

    public EmpMemento getMemento() {
        return memento;
    }

    public void setMemento(EmpMemento memento) {
        this.memento = memento;
    }
}
