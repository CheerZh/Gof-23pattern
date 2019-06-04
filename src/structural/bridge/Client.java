package structural.bridge;

/**
 * @author ZHGQ
 * @project Gof-23pattern
 * @Package structural.bridge
 * @date 2019/6/4-21:28
 * @Copyright: (c) 2019 USTC. All rights reserved.
 * @Description:
 *
 * 用组合代替继承关系
 *
 */
public class Client {
    public static void main(String[] args) {
        //销售联想笔记本电脑
        Computer2 c = new Laptop2(new Lenovo());
        c.sale();

        //销售神州的台式机
        Computer2 c2 = new Desktop2(new Shenzhou());
        c2.sale();
    }
}
