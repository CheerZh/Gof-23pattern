package structural.proxy.dynamicProxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * @author ZHGQ
 * @project Gof-23pattern
 * @Package structural.proxy.dynamicProxy
 * @date 2019/6/3-22:14
 * @Copyright: (c) 2019 USTC. All rights reserved.
 * @Description:
 */
public class StarHandler implements InvocationHandler {

    Star realStar;

    public StarHandler(Star realStar) {
        this.realStar = realStar;
    }

    /**
     * 核心方法，所有流程在这个方法中进行处理
     * @param proxy 代理类
     * @param method 方法
     * @param args 方法的参数
     * @return
     * @throws Throwable
     */
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {

        Object obj = null;

        System.out.println("真正的方法执行前！");
        System.out.println("面谈，签合同，预付款，订机票");

        //激活调用的方法
        if(method.getName().equals("sing")){
            obj = method.invoke(realStar,args);
        }

        //method.invoke(realStar,args);
        System.out.println("真正的方法执行后！");
        System.out.println("收尾款");

        return obj;
    }
}
