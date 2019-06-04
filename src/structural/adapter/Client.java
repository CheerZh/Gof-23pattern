package structural.adapter;


/**
 * @author ZHGQ
 * @project Gof-23pattern
 * @Package structural.adapter
 * @date 2019/5/31-16:28
 * @Copyright: (c) 2019 USTC. All rights reserved.
 * @Description:
 *
 * 相当于笔记本
 */
public class Client {

    public void test1(Target t){
        t.handleRequest();
    }

    public static void main(String[] args) {
        Client c = new Client();
        Adaptee a = new Adaptee();

        //类适配器
        Target t = new Adapter();
        c.test1(t);

        //对象适配器
        Target t2 = new Adapter2(a);
        c.test1(t2);
    }
}
