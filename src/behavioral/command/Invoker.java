package behavioral.command;

/**
 * @author ZHGQ
 * @project Gof-23pattern
 * @Package behavioral.command
 * @date 2019/6/7-20:55
 * @Copyright: (c) 2019 USTC. All rights reserved.
 * @Description:
 *
 * 命令调用者
 *
 */
public class Invoker {

    private Command cmd;
    //也可以通过List<Command> 容纳很多命令对象，进行批处理。
    //数据库底层事务管理就是类似的结构


    public Invoker(Command cmd) {
        this.cmd = cmd;
    }

    //业务方法，调用命令累的方法
    public void call(){
        cmd.execute();
    }
}
