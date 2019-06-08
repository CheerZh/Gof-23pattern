package behavioral.state;

/**
 * @author ZHGQ
 * @project Gof-23pattern
 * @Package behavioral.state
 * @date 2019/6/8-13:03
 * @Copyright: (c) 2019 USTC. All rights reserved.
 * @Description:
 */
public interface State {
    void handle();
}

class FreeState implements State{

    @Override
    public void handle() {
        System.out.println("房间空闲！");
    }
}

class BookedState implements State{

    @Override
    public void handle() {
        System.out.println("房间已预订！");
    }
}

class CheckedInState implements State{

    @Override
    public void handle() {
        System.out.println("房间已入住，请勿打扰！");
    }
}
