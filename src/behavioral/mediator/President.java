package behavioral.mediator;

import java.util.HashMap;
import java.util.Map;

/**
 * @author ZHGQ
 * @project Gof-23pattern
 * @Package behavioral.mediator
 * @date 2019/6/7-17:56
 * @Copyright: (c) 2019 USTC. All rights reserved.
 * @Description:
 */
public class President implements Mediator {

    private Map<String,Department> map = new HashMap<>();

    @Override
    public void register(String dName, Department d) {
        map.put(dName,d);
    }

    @Override
    public void command(String dName) {
        map.get(dName).selfAction();
    }
}
