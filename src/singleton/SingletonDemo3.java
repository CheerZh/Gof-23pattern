package singleton;

/**
 * @author ZHGQ
 * @project Gof-23pattern
 * @Package singleton
 * @date 2019/3/6-16:41
 * @Copyright: (c) 2019 USTC. All rights reserved.
 * @Description: for...
 */
public class SingletonDemo3 {

    //静态内部类实现单例模式，调用效率高，并且实现了延迟加载
    private static class SingletonClassInstance {
        private static final SingletonDemo3 instance = new SingletonDemo3();
    }

    public static SingletonDemo3 getInstance() {
        return SingletonClassInstance.instance;
    }
}
