package creational.prototype;

import java.io.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @author ZHGQ
 * @project Gof-23pattern
 * @Package creational.prototype
 * @date 2019/5/31-15:57
 * @Copyright: (c) 2019 USTC. All rights reserved.
 * @Description:
 *
 * 使用序列化实现深复制
 */
public class Client3 {

    public static void main(String[] args) throws ParseException, IOException, ClassNotFoundException {
        SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd");
        Date d = df.parse("1993-10-01");

        Sheep s1 = new Sheep("喜羊羊",d);
        //Sheep s2 = (Sheep) s1.clone();

        //用序列化反序列化实现深复制
        ByteArrayOutputStream bos = new ByteArrayOutputStream();
        ObjectOutputStream oos = new ObjectOutputStream(bos);

        oos.writeObject(s1);
        byte [] sb = bos.toByteArray();

        //反序列化
        ByteArrayInputStream bis = new ByteArrayInputStream(sb);
        ObjectInputStream ois = new ObjectInputStream(bis);

        Sheep s2 = (Sheep) ois.readObject();

        d.setTime(123456789L);

        System.out.println(s1);
        System.out.println(s1.getSname());
        System.out.println(s1.getBirthday());
        System.out.println(s2);
        System.out.println(s2.getSname());
        System.out.println(s2.getBirthday());

        s2.setSname("多利");
        s2.setBirthday(df.parse("1997-01-01"));
        System.out.println(s2);
        System.out.println(s2.getSname());
        System.out.println(s2.getBirthday());
    }
}
