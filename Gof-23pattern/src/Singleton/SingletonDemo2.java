package Singleton;
/**
*@author ZHGQ
*@project Gof-23pattern 
*@Package Singleton
*@date 2019年3月6日--下午3:20:08
*@Description: TODO
*@Copyright: (c) 2019 USTC. All rights reserved.
*/
public class SingletonDemo2 {
	
	//类初始化时，不初始化对象（延迟加载，真正用的时候再构造）
	private static SingletonDemo2 instance;
	
	//方法同步，调用效率低
	public static synchronized SingletonDemo2 getInstance() {
		if(instance==null) {
			instance = new SingletonDemo2();
		}
		return instance;
	}
}

