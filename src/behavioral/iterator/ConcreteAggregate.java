package behavioral.iterator;

import java.awt.*;
import java.util.ArrayList;
import java.util.List;

/**
 * @author ZHGQ
 * @project Gof-23pattern
 * @Package behavioral.iterator
 * @date 2019/6/7-17:17
 * @Copyright: (c) 2019 USTC. All rights reserved.
 * @Description:
 *
 * 自定义聚合类
 *
 */
public class ConcreteAggregate {
    private List<Object> list = new ArrayList<>();

    public void addObject(Object obj){
        this.list.add(obj);
    }

    public void removeObject(Object obj){
        this.list.remove(obj);
    }

    public List<Object> getList() {
        return list;
    }

    public void setList(List<Object> list) {
        this.list = list;
    }

    //获得迭代器
    public IIterator createIterator(){
        return new ConcreteIterator();
    }

    /**
     * 使用内部类定义迭代器：
     *      可以直接使用外部类属性
     *      不同聚合类的迭代器实现上具有差异，不考虑复用
     */
    private class ConcreteIterator implements IIterator{

        private int cursor;  //游标，用于记录遍历时的位置

        @Override
        public void first() {
            cursor = 0;
        }

        @Override
        public void next() {
            if(cursor<list.size()) cursor++;
        }

        @Override
        public boolean hasNext() {
            return cursor < list.size();
        }

        @Override
        public boolean isFirst() {
            return cursor==0 ;
        }

        @Override
        public boolean isLast() {
            return cursor == list.size()-1;
        }

        @Override
        public Object getCurrentObj() {
            return list.get(cursor);
        }
    }
}
