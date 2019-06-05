package structural.composite;

import java.util.ArrayList;
import java.util.List;

/**
 * @author ZHGQ
 * @project Gof-23pattern
 * @Package structural.composite
 * @date 2019/6/5-17:09
 * @Copyright: (c) 2019 USTC. All rights reserved.
 * @Description:
 *
 * 抽象构建
 */
public interface AbstractFile {
    void killVirus(); //杀毒
}


/**
 * 叶子组件： ImageFile
 *          TextFile
 *          VideoFile
 */
class ImageFile implements AbstractFile{

    private String name;

    public ImageFile(String name) {
        this.name = name;
    }

    @Override
    public void killVirus() {
        System.out.println("对图像文件-"+name+"-进行查杀！");
    }
}

class TextFile implements AbstractFile{

    private String name;

    public TextFile(String name) {
        this.name = name;
    }

    @Override
    public void killVirus() {
        System.out.println("对文本文件-"+name+"-进行查杀！");
    }
}

class VideoFile implements AbstractFile{

    private String name;

    public VideoFile(String name) {
        this.name = name;
    }

    @Override
    public void killVirus() {
        System.out.println("对视频文件-"+name+"-进行查杀！");
    }
}


/**
 * 容器组件
 */

class Folder implements AbstractFile{

    private String name;
    //定义容器，用于存放本容器构件下的子节点
    private List<AbstractFile> list = new ArrayList<>();

    public Folder(String name) {
        this.name = name;
    }

    /**
     * 递归（recursion）地进行方法调用
     */
    @Override
    public void killVirus() {
        System.out.println("对文件夹--"+name+"--进行查杀！");
        for(AbstractFile file: list){
            file.killVirus();
        }
    }

    public void add(AbstractFile file){
        list.add(file);
    }

    public void remove(AbstractFile file){
        list.remove(file);
    }

    public AbstractFile getChild(int index){
        return list.get(index);
    }
}
