package behavioral.command;

/**
 * @author ZHGQ
 * @project Gof-23pattern
 * @Package behavioral.command
 * @date 2019/6/7-20:50
 * @Copyright: (c) 2019 USTC. All rights reserved.
 * @Description:
 */
public interface Command {
    /**
     * 返回为空的简单方法，
     * 实际项目中可以根据需求设计多个不同的方法
     */
    void execute();
}


class ConcreteCommand implements Command{

    private Receiver receiver; //命令的真正执行者

    public ConcreteCommand(Receiver receiver) {
        this.receiver = receiver;
    }

    @Override
    public void execute() {


        //命令真正执行前后，可以执行相关处理
        receiver.action();
    }
}