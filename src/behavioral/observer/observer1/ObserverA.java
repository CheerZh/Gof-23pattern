package behavioral.observer.observer1;

/**
 * @author ZHGQ
 * @project Gof-23pattern
 * @Package behavioral.observer
 * @date 2019/6/8-15:40
 * @Copyright: (c) 2019 USTC. All rights reserved.
 * @Description:
 */
public class ObserverA implements Observer {

    private int myState;    // 根据目标对象的状态，改变自己的状态

    @Override
    public void update(Subject sub) {
        myState = ((ConcreteSubject)sub).getState();
    }

    public int getMyState() {
        return myState;
    }

    public void setMyState(int myState) {
        this.myState = myState;
    }
}
