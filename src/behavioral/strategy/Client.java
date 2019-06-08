package behavioral.strategy;

/**
 * @author ZHGQ
 * @project Gof-23pattern
 * @Package behavioral.strategy
 * @date 2019/6/8-11:24
 * @Copyright: (c) 2019 USTC. All rights reserved.
 * @Description:
 *
 * J2SE中的GUI的布局管理器
 * Spring框架中的Resource接口
 * javax.servlet.http.HttpServlet#service()
 *
 */
public class Client {
    public static void main(String[] args) {
        Strategy s1 = new OldCustmerFewStrategy();
        Strategy s2 = new OldCustmerManyStrategy();
        Context ctx = new Context(s1);
        Context ctx2 = new Context(s2);

        ctx.printPrice(998);
        ctx2.printPrice(4399);
    }
}
