package Singleton;
/**
*@author ZHGQ
*@project Gof-23pattern 
*@Package Singleton
*@date 2019年3月6日--下午3:04:08
*@Description: 测试饿汉式单例模式
*@Copyright: (c) 2019 USTC. All rights reserved.
*/
public class SingletonDemo1 {
	
	//类初始化时立即加载这个对象（没有延迟加载的优势）。加载类时，天然的是线程安全的
	private static SingletonDemo1 instance = new SingletonDemo1();
	
	private SingletonDemo1() {	
	}
	
	//方法没有同步，调用效率高！
	public static SingletonDemo1 getInstance() {
		return instance;
	}
}

