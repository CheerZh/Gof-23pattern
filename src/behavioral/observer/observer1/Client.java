package behavioral.observer.observer1;

/**
 * @author ZHGQ
 * @project Gof-23pattern
 * @Package behavioral.observer
 * @date 2019/6/8-15:45
 * @Copyright: (c) 2019 USTC. All rights reserved.
 * @Description:
 *
 *
 *
 *
 */
public class Client {
    public static void main(String[] args) {
        ConcreteSubject subject = new ConcreteSubject();

        //创建多个观察者
        ObserverA obs1 = new ObserverA();
        ObserverA obs2 = new ObserverA();
        ObserverA obs3 = new ObserverA();

        //将观察者添加到容器中
        subject.registerObserver(obs1);
        subject.registerObserver(obs2);
        subject.registerObserver(obs3);

        //改变subject的状态
        subject.setState(3000);

        //观察者的相应状态
        System.out.println("obs1:"+ obs1.getMyState());
        System.out.println("obs2:"+ obs2.getMyState());
        System.out.println("obs3:"+ obs3.getMyState());

        //改变subject的状态
        subject.setState(40);

        System.out.println("#########");
        //观察者的相应状态
        System.out.println("obs1:"+ obs1.getMyState());
        System.out.println("obs2:"+ obs2.getMyState());
        System.out.println("obs3:"+ obs3.getMyState());


    }
}
