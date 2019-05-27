package singleton;

/**
 * @author ZHGQ
 * @project Gof-23pattern
 * @Package singleton
 * @date 2019/3/6-16:44
 * @Copyright: (c) 2019 USTC. All rights reserved.
 * @Description: 枚举式单例模式
 * 避免了反射和反序列化的漏洞，效率高，但没有延迟加载
 */
public enum SingletonDemo4 {
    //这个枚举元素本身就是单例对象
    INSTANCE;

    //添加自己需要的操作
    private void singletonOperation() {
        //to do
    }
}
