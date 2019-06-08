package behavioral.memento;

/**
 * @author ZHGQ
 * @project Gof-23pattern
 * @Package behavioral.memento
 * @date 2019/6/8-16:45
 * @Copyright: (c) 2019 USTC. All rights reserved.
 * @Description:
 */
public class Client {
    public static void main(String[] args) {
        CareTaker taker = new CareTaker();

        Emp emp = new Emp("张三",18,900);
        System.out.println("姓名："+emp.getName()+
                "  age:"+emp.getAge()+"  salary:"+emp.getSalary());

        taker.setMemento(emp.memento());  //备忘一次

        emp.setAge(38);
        emp.setName("周七七");
        emp.setSalary(9000);
        System.out.println("姓名："+emp.getName()+
                "  age:"+emp.getAge()+"  salary:"+emp.getSalary());

        //恢复到备忘录对象保存的状态
        emp.recovery(taker.getMemento());
        System.out.println("姓名："+emp.getName()+
                "  age:"+emp.getAge()+"  salary:"+emp.getSalary());
    }
}
