package behavioral.observer.observer1;

/**
 * @author ZHGQ
 * @project Gof-23pattern
 * @Package behavioral.observer
 * @date 2019/6/8-15:37
 * @Copyright: (c) 2019 USTC. All rights reserved.
 * @Description:
 */
public class ConcreteSubject extends Subject{

    private int state;

    public int getState() {
        return state;
    }

    public void setState(int state) {
        this.state = state;
        //通知所有的观察者 目标对象发生了变化
        this.notifyAllObserver();
    }
}
