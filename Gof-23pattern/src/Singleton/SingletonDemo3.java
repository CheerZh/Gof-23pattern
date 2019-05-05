package Singleton;
/**
*@author ZHGQ
*@project Gof-23pattern 
*@Package Singleton
*@date 2019年3月6日--下午3:20:08
*@Description: 静态内部类实现单例模式，调用效率高，并且实现了延迟加载
*@Copyright: (c) 2019 USTC. All rights reserved.
*/
public class SingletonDemo3 {
	//静态内部类实现单例模式，调用效率高，并且实现了延迟加载
	private static class SingletonClassInstance{
		private static final SingletonDemo3 instance =new SingletonDemo3();
	}
	
	private SingletonDemo3() {
		
	}
	
	public static SingletonDemo3 getInstance() {
		return SingletonClassInstance.instance;
	}
}

