package behavioral.mediator;

/**
 * @author ZHGQ
 * @project Gof-23pattern
 * @Package behavioral.mediator
 * @date 2019/6/7-17:42
 * @Copyright: (c) 2019 USTC. All rights reserved.
 * @Description:
 */
public interface Mediator {
    void register(String dName,Department d);
    void command(String dName);
}
