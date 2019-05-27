package singleton;

/**
 * @author ZHGQ
 * @project Gof-23pattern
 * @Package singleton
 * @date 2019/3/6-16:39
 * @Copyright: (c) 2019 USTC. All rights reserved.
 * @Description: 饿汉单例模式
 */
public class SingletonDemo1 {

    //类初始化时立即加载这个对象（没有延迟加载的优势）。加载类时，天然的是线程安全的
    private static SingletonDemo1 instance = new SingletonDemo1();

    //方法没有同步，调用效率高！
    public static SingletonDemo1 getInstance() {
        return instance;
    }

}
