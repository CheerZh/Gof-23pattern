package creational.singleton;

import java.io.*;
import java.lang.reflect.Constructor;

/**
 * @author ZHGQ
 * @project Gof-23pattern
 * @Package creational.singleton
 * @date 2019/3/6-16:46
 * @Copyright: (c) 2019 USTC. All rights reserved.
 * @Description: for...
 */
public class Client2 {

    public static void main(String[] args) throws Exception {
        SingletonDemo5 s1 = SingletonDemo5.getInstance();
        SingletonDemo5 s2 = SingletonDemo5.getInstance();
        System.out.println(s1);
        System.out.println(s2);

        final Class<SingletonDemo5> clazz = (Class<SingletonDemo5>) Class.forName("creational.singleton.SingletonDemo5");
        Constructor<SingletonDemo5> c = clazz.getDeclaredConstructor(null);
        //设置私有变量的访问权限
        c.setAccessible(true);
        SingletonDemo5 s3 = c.newInstance();
        SingletonDemo5 s4 = c.newInstance();
        System.out.println(s3);
        System.out.println(s4);

        //序列化
        FileOutputStream fos = new FileOutputStream("D:/test/a.txt");
        //通过对象输出流输出到文件流，再通过文件流输出到文件中
        ObjectOutputStream oos = new ObjectOutputStream(fos);
        //写出
        oos.writeObject(s1);

        //关闭流
        oos.close();
        fos.close();

        //反序列化
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("d:/test/a.txt"));
        SingletonDemo5 s5 = (SingletonDemo5) ois.readObject();
        System.out.println(s5);

    }
}
