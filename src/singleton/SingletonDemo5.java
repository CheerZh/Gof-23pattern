package singleton;

import java.io.ObjectStreamException;
import java.io.Serializable;

/**
 * @author ZHGQ
 * @project Gof-23pattern
 * @Package singleton
 * @date 2019/3/6-16:41
 * @Copyright: (c) 2019 USTC. All rights reserved.
 * @Description: 懒汉单例模式（防止反射和反序列化漏洞）
 */
public class SingletonDemo5 implements Serializable {
    //类初始化时，不初始化对象（延迟加载，真正用的时候再构造）
    private static SingletonDemo5 instance;

    //手动抛出运行时异常!
//    private SingletonDemo5(){
//        if(instance!=null){
//            throw new RuntimeException("禁止反射和反序列化获取方式");
//        }
//    }

    //反序列化时，如果定义了readResolve方法，直接调用这个方法，而不创建新的对象
//    private Object readResolve() throws ObjectStreamException{
//        return instance;
//    }

    //方法同步，调用效率低
    public static synchronized SingletonDemo5 getInstance() {
        if (instance == null) {
            instance = new SingletonDemo5();
        }
        return instance;
    }


}
