package structural.composite;

/**
 * @author ZHGQ
 * @project Gof-23pattern
 * @Package structural.composite
 * @date 2019/6/5-17:00
 * @Copyright: (c) 2019 USTC. All rights reserved.
 * @Description:
 *
 * 抽象组件
 *
 */
public interface Component {
    void opreation();

}

/**
 * 叶子组件
 */
interface Leaf extends Component{

}

/**
 * 容器组件
 */
interface Composite extends Component{
    void add(Component c);
    void remove(Component c);

    //放入容器，通过索引查找
    Component getChild(int index);

}
