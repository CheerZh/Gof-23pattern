package structuralType.proxy.dynamicProxy;

import java.lang.reflect.Proxy;

/**
 * @author ZHGQ
 * @project Gof-23pattern
 * @Package structuralType.proxy.dynamicProxy
 * @date 2019/6/3-22:18
 * @Copyright: (c) 2019 USTC. All rights reserved.
 * @Description:
 */
public class Client {
    public static void main(String[] args) {
        Star realStar = new RealStar();

        StarHandler handler = new StarHandler(realStar);
        //通过类加载器得到代理对象
        Star proxy = (Star) Proxy.newProxyInstance(ClassLoader.getSystemClassLoader(),new Class[] {Star.class},handler);

        //调用handler中具体定义的处理方法
        //proxy.bookTicket();
        proxy.sing();
    }
}
