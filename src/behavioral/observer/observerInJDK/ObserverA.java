package behavioral.observer.observerInJDK;

import java.util.Observable;
import java.util.Observer;

/**
 * @author ZHGQ
 * @project Gof-23pattern
 * @Package behavioral.observer.observerInJDK
 * @date 2019/6/8-16:00
 * @Copyright: (c) 2019 USTC. All rights reserved.
 * @Description:
 */
public class ObserverA implements Observer {

    private int myState;

    @Override
    public void update(Observable o, Object arg) {
        myState = ((ConcreteSubject)o).getState();
    }

    public int getMyState() {
        return myState;
    }

    public void setMyState(int myState) {
        this.myState = myState;
    }
}
