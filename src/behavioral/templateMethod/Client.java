package behavioral.templateMethod;

/**
 * @author ZHGQ
 * @project Gof-23pattern
 * @Package behavioral.templateMethod
 * @date 2019/6/8-12:00
 * @Copyright: (c) 2019 USTC. All rights reserved.
 * @Description:
 *
 * 使用场景：
 *      数据库访问的封装
 *      Junit单元测试
 *      servlet中关于doGet/doPost方法调用
 *      Hibernate中的模板程序
 *      spring中JDBCTemplate、HibernateTemplate
 *
 */
public class Client {
    public static void main(String[] args) {

        BankTemplateMethod btm = new DrawMoney();
        btm.process();

        //采用匿名内部类
        BankTemplateMethod btm2 = new BankTemplateMethod() {
            @Override
            public void transact() {
                System.out.println("办理存款业务");
            }
        };

        btm2.process();

        //匿名内部类
        new BankTemplateMethod(){

            @Override
            public void transact() {
                System.out.println("我要理财，2000万");
            }
        }.process();

    }
}


class DrawMoney extends BankTemplateMethod{

    @Override
    public void transact() {
        System.out.println("办理取款业务");
    }
}