package behavioral.observer.observerInJDK;

/**
 * @author ZHGQ
 * @project Gof-23pattern
 * @Package behavioral.observer.observerInJDK
 * @date 2019/6/8-16:04
 * @Copyright: (c) 2019 USTC. All rights reserved.
 * @Description:
 *
 * Servlet 中的 监听器
 * Android 广播机制
 * AWT中 事件处理模型，基于观察者模式的委派事件模型
 *
 */
public class Client {
    public static void main(String[] args) {
        ConcreteSubject subject = new ConcreteSubject();

        ObserverA obs1 = new ObserverA();
        ObserverA obs2 = new ObserverA();
        ObserverA obs3 = new ObserverA();

        //将观察者添加到容器中
        subject.addObserver(obs1);
        subject.addObserver(obs2);
        subject.addObserver(obs3);

        //改变subject对象的状态
        subject.set(4500);

        System.out.println(obs1.getMyState());
        System.out.println(obs2.getMyState());
        System.out.println(obs3.getMyState());

        subject.set(4399);

        System.out.println("#######");

        System.out.println(obs1.getMyState());
        System.out.println(obs2.getMyState());
        System.out.println(obs3.getMyState());

    }

}
