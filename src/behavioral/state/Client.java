package behavioral.state;

/**
 * @author ZHGQ
 * @project Gof-23pattern
 * @Package behavioral.state
 * @date 2019/6/8-13:11
 * @Copyright: (c) 2019 USTC. All rights reserved.
 * @Description:
 */
public class Client {
    public static void main(String[] args) {
        Context ctx = new Context();
        ctx.setState(new FreeState());
        ctx.setState(new BookedState());
        ctx.setState(new CheckedInState());
    }
}
