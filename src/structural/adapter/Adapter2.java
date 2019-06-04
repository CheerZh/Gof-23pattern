package structural.adapter;

/**
 * @author ZHGQ
 * @project Gof-23pattern
 * @Package structural.adapter
 * @date 2019/5/31-16:50
 * @Copyright: (c) 2019 USTC. All rights reserved.
 * @Description:
 *
 * 适配器2（对象适配器--对象组合）
 */
public class Adapter2 implements Target{

    private Adaptee adaptee;

    @Override
    public void handleRequest() {
        adaptee.request();
    }

    public Adapter2(Adaptee adaptee){
        super();
        this.adaptee = adaptee;
    }
}
