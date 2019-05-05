package Singleton;
/**
*@author ZHGQ
*@project Gof-23pattern 
*@Package Singleton
*@date 2019年3月6日--下午3:20:08
*@Description: 测试枚举式单例模式
*@Copyright: (c) 2019 USTC. All rights reserved.
*/
//避免了反射和反序列化的漏洞，效率高，但没有延迟加载
public enum SingletonDemo4 {
	
	//这个枚举元素本身就是单例对象
	INSTANCE;
	//添加自己需要的操作
	private void singletonOperation() {
		
	}
}

