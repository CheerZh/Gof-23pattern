package creational.prototype;

/**
 * @author ZHGQ
 * @project Gof-23pattern
 * @Package creational.prototype
 * @date 2019/5/31-16:11
 * @Copyright: (c) 2019 USTC. All rights reserved.
 * @Description:
 *
 * 如果new比较耗时，但又在需要短时间内获得大量对象，用原型模式省时
 */
public class Client4 {

    public static void main(String[] args) throws CloneNotSupportedException {
        testNew(1000);
        testClone(1000);

    }

    public static void testNew(int size){
        long start = System.currentTimeMillis();
        for(int i = 0 ; i< size; i++){
            new Laptop();
        }
        long end = System.currentTimeMillis();
        System.out.println("new的方式耗时："+(end-start));
    }

    public static void testClone(int size) throws CloneNotSupportedException {
        long start = System.currentTimeMillis();
        Laptop lp = new Laptop();
        for(int i = 0 ; i< size; i++){
            lp.clone();
        }
        long end = System.currentTimeMillis();
        System.out.println("new的方式耗时："+(end-start));
    }
}

class Laptop implements Cloneable{
    public Laptop(){
        try {
            Thread.sleep(10);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
