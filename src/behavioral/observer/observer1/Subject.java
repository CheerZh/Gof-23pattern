package behavioral.observer.observer1;

import java.util.ArrayList;
import java.util.List;

/**
 * @author ZHGQ
 * @project Gof-23pattern
 * @Package behavioral.observer
 * @date 2019/6/8-15:32
 * @Copyright: (c) 2019 USTC. All rights reserved.
 * @Description:
 */
public class Subject {
    protected List<Observer> list = new ArrayList<>();

    public void registerObserver(Observer obs){
        list.add(obs);
    }

    public void removeObserver(Observer obs){
        list.remove(obs);
    }

    //通知所有的观察者更新状态
    public void notifyAllObserver(){
        for (Observer obs : list){
            obs.update(this);
        }
    }
}
