package singleton;

/**
 * @author ZHGQ
 * @project Gof-23pattern
 * @Package singleton
 * @date 2019/3/6-16:46
 * @Copyright: (c) 2019 USTC. All rights reserved.
 * @Description: for...
 */
public class Client {

    public static void main(String[] args) {
        SingletonDemo1 s1 = SingletonDemo1.getInstance();
        SingletonDemo1 s2 = SingletonDemo1.getInstance();
        System.out.println(s1);
        System.out.println(s2);

        SingletonDemo2 s3 = SingletonDemo2.getInstance();
        SingletonDemo2 s4 = SingletonDemo2.getInstance();
        System.out.println(s3);
        System.out.println(s4);

        SingletonDemo3 s5 = SingletonDemo3.getInstance();
        SingletonDemo3 s6 = SingletonDemo3.getInstance();
        System.out.println(s5);
        System.out.println(s6);

        System.out.println(SingletonDemo4.INSTANCE == SingletonDemo4.INSTANCE);

    }
}
