package behavioral.observer.observerInJDK;

import java.util.Observable;

/**
 * @author ZHGQ
 * @project Gof-23pattern
 * @Package behavioral.observer.observerInJDK
 * @date 2019/6/8-15:56
 * @Copyright: (c) 2019 USTC. All rights reserved.
 * @Description:
 */

//目标对象
public class ConcreteSubject extends Observable {

    private int state;

    public void set(int s){
        state = s;

        setChanged();  //表示目标已经做了更改，父类中定义
        notifyObservers(state); //通知所有的观察者
    }

    public int getState() {
        return state;
    }

    public void setState(int state) {
        this.state = state;
    }
}
