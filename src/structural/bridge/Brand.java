package structural.bridge;

/**
 * @author ZHGQ
 * @project Gof-23pattern
 * @Package structural.bridge
 * @date 2019/6/4-21:20
 * @Copyright: (c) 2019 USTC. All rights reserved.
 * @Description:
 *
 * 职责分离，只管品牌
 *
 */
public interface Brand {
    void sale();
}

class Lenovo implements Brand{

    @Override
    public void sale() {
        System.out.println("销售联想电脑");
    }
}

class Dell implements Brand{

    @Override
    public void sale() {
        System.out.println("销售戴尔电脑");
    }
}

class Shenzhou implements Brand{

    @Override
    public void sale() {
        System.out.println("销售神舟电脑");
    }
}
