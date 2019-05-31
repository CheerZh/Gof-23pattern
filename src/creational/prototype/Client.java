package creational.prototype;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @author ZHGQ
 * @project Gof-23pattern
 * @Package creational.prototype
 * @date 2019/5/31-14:28
 * @Copyright: (c) 2019 USTC. All rights reserved.
 * @Description:
 *
 * 浅克隆 ，对于对象只是克隆了对其引用
 */
public class Client {
    public static void main(String[] args) throws CloneNotSupportedException, ParseException {

        SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd");
        Date d = df.parse("1993-10-01");

        Sheep s1 = new Sheep("喜羊羊",d);
        Sheep s2 = (Sheep) s1.clone();
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
