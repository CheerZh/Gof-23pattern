package behavioral.iterator;

/**
 * @author ZHGQ
 * @project Gof-23pattern
 * @Package behavioral.iterator
 * @date 2019/6/7-17:12
 * @Copyright: (c) 2019 USTC. All rights reserved.
 * @Description:
 *
 *
 * 迭代器接口
 *
 */
public interface IIterator {
    void first();   //将游标指向第一个元素
    void next();    //将游标指向下一个元素

    boolean hasNext();  //判断是否存在下一个元素
    boolean isFirst();
    boolean isLast();

    Object getCurrentObj(); //获取当前游标指向的对象
}
