package creational.prototype;

import java.io.Serializable;
import java.util.Date;

/**
 * @author ZHGQ
 * @project Gof-23pattern
 * @Package creational.prototype
 * @date 2019/5/31-14:30
 * @Copyright: (c) 2019 USTC. All rights reserved.
 * @Description:
 */
public class Sheep implements Cloneable, Serializable {
    private String sname;
    private Date birthday;

    @Override
    protected Object clone() throws CloneNotSupportedException {

        return super.clone();
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

    public Sheep() {
    }

    public Sheep(String sname, Date birthday) {
        this.sname = sname;
        this.birthday = birthday;
    }
}
