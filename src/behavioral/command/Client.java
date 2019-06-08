package behavioral.command;

/**
 * @author ZHGQ
 * @project Gof-23pattern
 * @Package behavioral.command
 * @date 2019/6/7-21:00
 * @Copyright: (c) 2019 USTC. All rights reserved.
 * @Description:
 *
 * Invoker的方法调用Command,
 *      Command 再调用相应的 Receiver的真实方法
 *          避免客户直接跟receiver打交道
 *
 *      提高可扩展性
 *
 *      场景：
 *      事务机制、Struts2中action的调用、
 *      命令的撤销和恢复（整合备忘录）
 *
 */
public class Client {
    public static void main(String[] args) {
        Command c = new ConcreteCommand(new Receiver());
        Invoker i = new Invoker(c);
        i.call();

    }
}
