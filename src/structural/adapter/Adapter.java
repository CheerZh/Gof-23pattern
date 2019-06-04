package structural.adapter;

/**
 * @author ZHGQ
 * @project Gof-23pattern
 * @Package structural.adapter
 * @date 2019/5/31-16:43
 * @Copyright: (c) 2019 USTC. All rights reserved.
 * @Description:
 *
 * 适配器(类适配器方式--继承)
 * 相当于usb和ps/2的转接器
 */
public class Adapter extends Adaptee implements Target{
    @Override
    public void handleRequest() {
        super.request();
    }
}
