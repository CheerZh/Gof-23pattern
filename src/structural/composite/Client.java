package structural.composite;

/**
 * @author ZHGQ
 * @project Gof-23pattern
 * @Package structural.composite
 * @date 2019/6/5-17:26
 * @Copyright: (c) 2019 USTC. All rights reserved.
 * @Description:
 *
 * 使用场景: 资源管理器；GUI容器层次图；xml文件；OA系统，组织结构；Junit
 *
 */
public class Client {
    public static void main(String[] args) {
        AbstractFile f2,f3,f4,f5,f6;

        Folder f1 = new Folder("我的收藏");

        f2 = new ImageFile("头像.jpg");
        f3 = new TextFile("holle.txt");

        f1.add(f2);
        f1.add(f3);

        Folder f11 = new Folder("电影");
        f4 = new VideoFile("笑傲江湖.avi");
        f5 = new VideoFile("神雕侠侣.avi");
        f11.add(f4);
        f11.add(f5);
        f1.add(f11);

        f2.killVirus();
        f1.killVirus();
    }
}
