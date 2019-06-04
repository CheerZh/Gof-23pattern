package structural.bridge;

/**
 * @author ZHGQ
 * @project Gof-23pattern
 * @Package structural.bridge
 * @date 2019/6/4-21:23
 * @Copyright: (c) 2019 USTC. All rights reserved.
 * @Description:
 *
 * 职责分离，电脑类型维度
 *
 */

public class Computer2 {


    protected Brand brand;

    //采用组合 替代 继承 关系
    public Computer2(Brand b){
        this.brand = b;
    }

    public void sale(){
        brand.sale();
    }
}

class Desktop2 extends Computer2{
    public Desktop2(Brand b) {
        super(b);
    }

    @Override
    public void sale() {
        super.sale();
        System.out.println("销售台式机");
    }
}

class Laptop2 extends Computer2{

    public Laptop2(Brand b) {
        super(b);
    }

    @Override
    public void sale() {
        super.sale();
        System.out.println("销售笔记本");
    }
}