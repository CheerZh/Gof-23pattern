package behavioral.state;

/**
 * @author ZHGQ
 * @project Gof-23pattern
 * @Package behavioral.state
 * @date 2019/6/8-13:07
 * @Copyright: (c) 2019 USTC. All rights reserved.
 * @Description:
 *
 * 表示当前状态，并负责状态间的切换
 *
 */
public class Context {
    private State state;

    public void setState(State state) {
        System.out.println("修改状态");
        this.state = state;
        state.handle();
    }
}
