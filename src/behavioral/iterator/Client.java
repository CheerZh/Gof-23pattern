package behavioral.iterator;

/**
 * @author ZHGQ
 * @project Gof-23pattern
 * @Package behavioral.iterator
 * @date 2019/6/7-17:31
 * @Copyright: (c) 2019 USTC. All rights reserved.
 * @Description:
 *
 * JDK内置迭代器 list/set
 *
 */
public class Client {
    public static void main(String[] args) {
        ConcreteAggregate ca = new ConcreteAggregate();
        ca.addObject("aa");
        ca.addObject("bb");
        ca.addObject("cc");

        IIterator iter = ca.createIterator();
        while (iter.hasNext()){
            System.out.println(iter.getCurrentObj());
            iter.next();
        }
    }
}
