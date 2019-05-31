package creational.prototype;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @author ZHGQ
 * @project Gof-23pattern
 * @Package creational.prototype
 * @date 2019/5/31-15:42
 * @Copyright: (c) 2019 USTC. All rights reserved.
 * @Description:
 *
 * 原型模式（深复制）
 */
public class Client2 {
    public static void main(String[] args) throws ParseException, CloneNotSupportedException {
        SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd");
        Date d = df.parse("1993-10-01");

        Sheep2 s1 = new Sheep2("喜羊羊",d);
        Sheep2 s2 = (Sheep2) s1.clone();
        d.setTime(1234567890L);
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
