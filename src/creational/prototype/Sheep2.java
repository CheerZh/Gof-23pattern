package creational.prototype;

import java.util.Date;

/**
 * @author ZHGQ
 * @project Gof-23pattern
 * @Package creational.prototype
 * @date 2019/5/31-15:47
 * @Copyright: (c) 2019 USTC. All rights reserved.
 * @Description:
 *
 * 深复制
 */
public class Sheep2 implements Cloneable{
    private String sname;
    private Date birthday;

    @Override
    protected Object clone() throws CloneNotSupportedException {

        Object obj = super.clone();

        //实现深复制（deep clone）
        Sheep2 s = (Sheep2) obj;
        //对象属性也进行克隆
        s.birthday = (Date) this.birthday.clone();

        return obj;
    }

    public String getSname() {
        return sname;
    }

    public void setSname(String sname) {
        this.sname = sname;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public Sheep2() {
    }

    public Sheep2(String sname, Date birthday) {
        this.sname = sname;
        this.birthday = birthday;
    }
}

