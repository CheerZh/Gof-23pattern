package structural.adapter;

/**
 * @author ZHGQ
 * @project Gof-23pattern
 * @Package structural.adapter
 * @date 2019/5/31-16:37
 * @Copyright: (c) 2019 USTC. All rights reserved.
 * @Description:
 *
 * 被适配的类
 * （相当于ps/2键盘）
 */
public class Adaptee {
    public void request(){
        System.out.println("可以完成客户请求的需要功能！");

    }
}
