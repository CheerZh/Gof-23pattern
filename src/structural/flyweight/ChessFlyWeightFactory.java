package structural.flyweight;

import java.util.HashMap;
import java.util.Map;

/**
 * @author ZHGQ
 * @project Gof-23pattern
 * @Package structural.flyweight
 * @date 2019/6/7-14:27
 * @Copyright: (c) 2019 USTC. All rights reserved.
 * @Description:
 *
 * 享元工厂
 *
 */
public class ChessFlyWeightFactory {

    private static Map<String,ChessFlyWeight> map = new HashMap<>();

    public static ChessFlyWeight getChess(String color){
        if(map.get(color)!=null){
            return map.get(color);
        }else{
            ChessFlyWeight cfw = new ConcreatChess(color);
            map.put(color,cfw);
            return cfw;
        }
    }

}
